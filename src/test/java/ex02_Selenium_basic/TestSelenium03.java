package ex02_Selenium_basic;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium03 {
    @Description("open to app.vwo.com ")
    @Test
    public void test_selenium03(){
        //open edge brwoser
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.opencart.com/");
        driver.quit();
    }
}
