package ex05_Selenium_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;

public class Navigation {
    public WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void Navigate(){
        //open google in the  first tab
        driver.get("https://google.com/");

        //store the first tab handle
        String first =driver.getWindowHandle();

        //open the new tap
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);

        //open Amazon in the second tab
        driver.get("https://Amazon.com/");

       //switch back to the first window google
//        driver.switchTo().window(first);
//        System.out.println("first window:  "+ driver.getCurrentUrl());

        //open anther tab and to go flipkard
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
        driver.get("https://www.flipkart.com/");

        //open anther tab and to go zigag
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
        driver.get("https://int.zigzag.lk/");

        //get all window handles tabs
        Set<String> Alltab = driver.getWindowHandles();
        for(String tab:Alltab){
            driver.switchTo().window(tab);
            System.out.println("switching to tab: "+ driver.getCurrentUrl());
        }
    }
}
