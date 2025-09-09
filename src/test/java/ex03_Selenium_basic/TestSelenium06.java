package ex03_Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium06 {
    @Test
    public void testSelenium06() {
        WebDriver driver = new ChromeDriver();
        try {
            // Maximize window and set implicit wait
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Open the page
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("Challenging DOM")).click();

            // Loop to interact with buttons (re-fetch elements to avoid stale references)
            for (int i = 0; i < 3; i++) { // Limit clicks to 3 times just for demonstration
                List<WebElement> dynamicButtons = driver.findElements(By.xpath("//div[@class='large-2 columns']/a"));

                if (!dynamicButtons.isEmpty()) {
                    WebElement button = dynamicButtons.get(i % dynamicButtons.size());
                    System.out.println("Clicking button: " + button.getText());
                    button.click();

                    // Extract JavaScript text from the page (inside <script>)
                    WebElement scriptElement = driver.findElement(By.xpath("//div[@id='content']//script"));
                    String scriptText = scriptElement.getAttribute("innerHTML");
                    System.out.println("Script text: " + scriptText);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Always close browser
        }
    }
}
