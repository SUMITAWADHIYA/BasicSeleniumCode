package ex01_Selenium_basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void verifySHMPl(){
        //write the code  which will execute the perform the UI intercation
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://cms.shmpl.com:2030/");
        System.out.println(driver.getSessionId());
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
