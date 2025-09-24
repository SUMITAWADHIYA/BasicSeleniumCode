package ex04_Selenium_basic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium07_Assert {
    @Description("Open the URL And Validation")
    @Test
    public void Assertion_TestNG(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("print: "+driver.getCurrentUrl());

        //TestNG assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

    }
}
