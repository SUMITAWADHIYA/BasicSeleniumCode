package ex00_selenium_basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;


public class BasicCommend {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver =new ChromeDriver();
        //Brower commends
        driver.get("https://google.com");
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();
        driver.close();
        driver.quit();

        //Navigation comments
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        //WebElement Comments
        By.id(""); By.name("use"); By.cssSelector(""); By.xpath(""); By.linkText("");
      /*  Sent("");
        click();
        clear();
        getText("");
        getAttribute("");
        isDisplay();
        isEnabled();
        isSelected();*/

        //wait comments
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));

        //window & frame Handling
        driver.switchTo().frame("frame-name");
        driver.switchTo().defaultContent();// came to main frame
        //Window Handling
        String mainWindow =driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for(String Window:allWindow){
            driver.switchTo().window(Window);
        }
        //ALert Handling
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.sendKeys("");
        alert.dismiss();
        alert.getText();

        //mange coockies
        driver.manage().getCookies();
        driver.manage().addCookie(new Cookie("name","cookies_value"));
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("coockie_name");

        //window management
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        //drowdown value handle
        Select select = new Select(driver.findElement(By.id("dropdown_value")));
        select.getAllSelectedOptions();
        select.getFirstSelectedOption();
        select.selectByValue("4");


    }
}
