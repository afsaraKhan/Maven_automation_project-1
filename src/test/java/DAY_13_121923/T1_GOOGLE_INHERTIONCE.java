package DAY_13_121923;

import day10_12122023.ReusuableMethoddd;
import org.testng.annotations.Test;

public class T1_GOOGLE_INHERTIONCE extends TestParent {
    @Test
    public void tc001_searchForACar() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //search for BMW
        ReusuableMethoddd.sendKeys(driver, "//*[@name= 'q']", "BMW", "SearchField");
        //hit submit on the google search button
        ReusuableMethoddd.submitMethod(driver, "//*[@name= 'btnK']", "Submit");
        Thread.sleep(1000);
    }//end of test case 1
    @Test
    public void tc002_captureSearchResult() {
        //store the search result into a string variable
        String result = ReusuableMethoddd.captureText(driver, "//*[@id = 'result-stats']", "SearchResult");
        //split the result
        String[] searchResultArray = result.split(" ");
        //print out the number only
        System.out.println("Search Result Number is " + searchResultArray[1]);
    }//end of test case 2


}//end of class
