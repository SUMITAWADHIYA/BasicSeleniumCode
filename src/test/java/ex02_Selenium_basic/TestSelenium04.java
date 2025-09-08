package ex02_Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestSelenium04 {

    private String extractCredential(String text){
        return text.split(":")[1].trim();
    }

    @Test
    public void testSelenium4(){
        // ✅inital browser
        ChromeDriver driver = new ChromeDriver();
        //browse open to maximize
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         //✅ get URl
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // ✅ Validate Page Title
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "OrangeHRM";
        Assert.assertEquals(ActualTitle,ExpectedTitle,"Page title is validate mismatch ");

        // ✅ Extract username & password using helper method
        String userNameTest = driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText();
        String passNameTest = driver.findElement(By.xpath("//p[normalize-space()='Password : admin123']")).getText();

        //✅ enter usename and pass word trim
        String userName = extractCredential(userNameTest);
        String password = extractCredential(passNameTest);

        // ✅ Enter credentials and login
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed!");

        //✅ browser close
        driver.close();
    }


}
