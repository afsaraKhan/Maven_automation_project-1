package DAY12_12182023;

import day10_12122023.ReusuableMethoddd;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T1_TESTngGoogle {
    WebDriver driver;

    @BeforeSuite
    public void setUpChromeDriver() {
        driver = ReusuableMethoddd.setUpDriver();
    }//end of before suite

    @Test(priority = 1)
    public void searchForACar() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //search for BMW
        ReusuableMethoddd.sendKeys(driver,"//*[@name= 'q']","BMW","SearchField");
        //hit submit on the google search button
        ReusuableMethoddd.submitMethod(driver,"//*[@name= 'btnK']","Submit");
        Thread.sleep(1000);
    }//end of test case 1
    @Test(priority = 2)
    public void captureSearchResult(){
        //store the search result into a string variable
        String result = ReusuableMethoddd.captureText(driver,"//*[@id = 'result-stats']","SearchResult");
        //split the result
        String[] searchResultArray = result.split(" ");
        //print out the number only
        System.out.println("Search Result Number is " + searchResultArray[1]);
    }//end of test case 2

    @AfterSuite
    public void quitDriver(){
        driver.quit();
    }//end of after suite
}//end of class
