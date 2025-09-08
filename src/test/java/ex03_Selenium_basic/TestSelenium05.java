package ex03_Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium05 {
    //multiple iframe check
    @Test
    public void Iframe(){

        // ✅ setup chromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //✅ open test site
        driver.get("https://the-internet.herokuapp.com/");

        //✅ click on "frame"
        driver.findElement(By.linkText("Frames")).click();

        //✅ click on Nested frame
        driver.findElement(By.linkText("Nested Frames")).click();

        //✅ count number of frame
        List<WebElement> frameCount = driver.findElements(By.tagName("frame"));
        System.out.println("count number of frame: "+frameCount.size());

        //============ left Frame===============
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement locatorName = driver.findElement(By.cssSelector("body"));
        System.out.println("Text inside left frame: "+locatorName.getText());

        // ✅ Back to main content
        driver.switchTo().defaultContent();

        //====================Middle frame===========
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        String text = driver.findElement(By.id("content")).getText();
        System.out.println("Text inside middle frame: " + text);
        driver.switchTo().defaultContent();

        // ================= Right Frame =================
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        WebElement textName = driver.findElement(By.cssSelector("body"));
        System.out.println("Text inside right frame:"+textName.getText());

        //✅ back to main page
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFram = driver.findElement(By.cssSelector("body"));
        System.out.println("Test inside bottom frame: "+bottomFram.getText());

        //✅ back to main page
        driver.switchTo().defaultContent();

        // ✅Navigate back and open iFrame
        driver.navigate().back();
        driver.findElement(By.linkText("iFrame")).click();

        //✅ Switch to iframe by id
        driver.switchTo().frame("mce_0_ifr");
        WebElement iframeBody = driver.findElement(By.id("tinymce"));
        System.out.println("Text inside iFrame: " + iframeBody.getText());

        //✅ Close browser
        driver.quit();
    }

}
