package day10_12122023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouseactionss {
    public static void main(String[] args) throws InterruptedException {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");

        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calc
        driver.navigate().to("https://www.usps.com/");
        Thread.sleep(3000);
        //declare Mouse actions
        Actions mouseAction = new Actions(driver);
        //hover to quick tools module
        WebElement quicktool = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
        mouseAction.moveToElement(quicktool).perform();
        //clcik on trackpackage
        WebElement tracPackage = driver.findElement(By.xpath("//*[text()='Track a Package']"));
        mouseAction.moveToElement(tracPackage).click().perform();
        //type in invalid tracking number on tracking search feild
        WebElement searchField = driver.findElement(By.xpath("//*[@id= 'tracking-input']"));
        //when the element in under textarea it means you have to click before entering vlaues
        mouseAction.moveToElement(searchField).click().sendKeys("327323").perform();







    }//end of method
}//end of class
