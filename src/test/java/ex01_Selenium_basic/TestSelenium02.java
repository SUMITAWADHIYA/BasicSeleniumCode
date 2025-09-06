package ex01_Selenium_basic;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description("open the shmpl.com and verify the title")
    @Test
    public void test_Selenium02(){
        //open to chrome browse
        ChromeDriver driver = new ChromeDriver();

        //navigate the URL--> get the url
        driver.get("https://cms.shmpl.com:2030/");

        //Assert  the URL --> validation testNG assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://cms.shmpl.com:2030/");

        //browse close
        driver.quit();

    }
    @Test
    public void verifyAssert(){
        ChromeDriver driver = new ChromeDriver();

        //navigate the URL--> get the url
        driver.get("https://cms.shmpl.com:2030/");

        String Actual = driver.getTitle();
        String Expected ="Login LIS";
        Assert.assertEquals(Actual,Expected,"Miss to Title name ");
    }
}
