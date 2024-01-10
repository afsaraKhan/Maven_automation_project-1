package day10_12122023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googlereusableMethod {
    public static void main(String[] args) {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");
        //declare webdriver
        WebDriver sumonDriver = new ChromeDriver(options);
        //nav 2 google
        sumonDriver.navigate().to("https://www.google.com");
        //click on Google Search button
        ReusuableMethoddd.submitMethod(sumonDriver,"//*[@name='btnK']","Search Button");

        ReusuableMethoddd.clickMethod(sumonDriver,"//*[text()='About']","About Link");


    }//end main

}//end of class
