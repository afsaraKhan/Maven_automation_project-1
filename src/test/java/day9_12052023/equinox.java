package day9_12052023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class equinox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //declare your web driver and pass the options variable inside the chromedriver
        WebDriver driver = new ChromeDriver(options);
        //navigate to equinox website
        driver.navigate().to("https://www.equinox.com");
        //set arraylist for navbar options

        ArrayList<WebElement> navBar = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class, 'GlobalHeader_main-nav__KBR8U')]")));
        System.out.println("There are " + navBar.size() + " yahoo headers");


    }//end of main


}//end of class
