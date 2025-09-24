package ex05_Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;


public class DrogAndDrop {

    @Test
    public void drog(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/droppable/");

        // Switch to iframe (because demo is inside iframe)
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        System.out.println("check to frame: "+ frame.getTagName());
        driver.switchTo().frame(frame);
        // Source element (the box to drag)
        WebElement sourec = driver.findElement(By.id("draggable"));

        // Target element (the box to drop into)
        WebElement tagar = driver.findElement(By.id("droppable"));

        // Perform drag and drop
        Actions action =  new Actions(driver);
        action.dragAndDrop(sourec,tagar).perform();


        driver.quit();
    }
}
