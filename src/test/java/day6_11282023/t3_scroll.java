package day6_11282023;

import day10_12122023.ReusuableMethoddd;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class t3_scroll {
    public static void main(String[] args) throws InterruptedException {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");
        options.addArguments("incognito");
        //run in headless mode (runs in the background)
//        options.addArguments("headless");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calc website
        driver.navigate().to("https://www.mlcalc.com/");
        //declare javascript executor
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels (based on your need you can adjust the number bt plus or minus -200)
        //jse.executeScript("scroll(0,1500)");
        ReusuableMethoddd.scrollPixelMethod(driver,"0,1800");
        //wait 2 seconds
        Thread.sleep(4000);
        //scroll up 400 pixels
        //jse.executeScript("scroll(0,-400)");
        //wait 2 seconds
        //Thread.sleep(2000);
        // store the caLculate button into a webelement variable
       // WebElement calcButton = driver.findElement(By.xpath("//*[@value = 'Calculate']"));
        //scroll into element
        //jse.executeScript("arguments[0].scrollIntoView(true);", calcButton);
        //wait 2 seconds
        //Thread.sleep(2000);
        //quir broweser
        driver.quit();



    }//emnd main
}//end of class
