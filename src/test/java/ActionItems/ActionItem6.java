package ActionItems;

import DAY_13_121923.TestParent;
import day10_12122023.ReusuableMethoddd;
import org.testng.annotations.Test;

public class ActionItem6 extends TestParent {
    @Test
    public void tc001_fidieleisCare() throws InterruptedException {
        //navigate to fidelis web page
        driver.navigate().to("https://www.fideliscare.org/");
        //clicksearch
        ReusuableMethoddd.clickMethod(driver,"//*[@class= 'tool dropdown search']","searchButton");
        Thread.sleep(2000);
        //enter get dental coverage
        ReusuableMethoddd.sendKeys(driver,"//*[@aria-label= 'Search']","get dental coverage","searchBox");
        //wait a sec
        //Thread.sleep(3000);
        //click search again
        ReusuableMethoddd.clickMethod(driver,"//*[@aria-label= 'Execute Search']","searchIcon");
        //wait a sec
        Thread.sleep(3000);
        //store the search result into a string variable
        String result = ReusuableMethoddd.captureText(driver, "//*[@class = 'gsc-result-info']", "SearchResult");
        //split the result
        String[] searchResultArray = result.split(" ");
        //print out the number only
        System.out.println("Search Result Number is " + searchResultArray[1]);
        //click get general coverage link
        ReusuableMethoddd.clickMethod(driver,"//*[text()='Get Dental Coverage']","get general coverage");

    }//end of test case 1

    @Test(dependsOnMethods = "tc001_fidieleisCare")
    public void tc002_switchTab() throws InterruptedException {
        //switch tab
       ReusuableMethoddd.switchToTabByIndex(driver,1);
       //scroll down page
        ReusuableMethoddd.scrollPixelMethod(driver,"0,700");
       //enter first name
        ReusuableMethoddd.sendKeys(driver,"//*[@id = 'firstName']","Sumon","firstNameBox");
        //wait
        Thread.sleep(2000);
        //enter last name
        ReusuableMethoddd.sendKeys(driver,"//*[@id = 'lastName']","Bhai","lastNameBox");
        //enter zipcode
        ReusuableMethoddd.sendKeys(driver,"//*[@id = 'zipCode']","11225","zipCodeBox");
        //select county
        ReusuableMethoddd.selectViaVisibleText(driver,"//*[@id = 'county']","Kings","countyDropdown");
        //wait
        Thread.sleep(2000);
        //enter phone number
        ReusuableMethoddd.sendKeys(driver,"//*[@id = 'phoneNumber']","6545555454","phoneBox");
        //enter email
        ReusuableMethoddd.sendKeys(driver,"//*[@id = 'email']","TriageIsAwesome@gmail.com","emailBox");
        //click contact me checkbox
        ReusuableMethoddd.clickMethod(driver,"//*[@for = 'contactMe']","contactmeCheckbox");
        //clcik contact me button
        ReusuableMethoddd.clickMethod(driver,"//*[@type = 'submit']","contactmeButton");
        //wait
        Thread.sleep(3000);
        //capture message
        String result = ReusuableMethoddd.captureText(driver,"//*[@class = 'alert alert-success']","submissionMessage");
        //print message
        System.out.println("The search result says " + result);
        //close current tab
        driver.close();
        //wait
        Thread.sleep(3000);



    }//end of test case 2
    @Test(dependsOnMethods = "tc002_switchTab")
    public void tc003_captureHelpfulHints() throws InterruptedException {
        //switch back to original tab
        ReusuableMethoddd.switchToTabByIndex(driver,0);
        //click login //role="button"
        ReusuableMethoddd.clickMethod(driver,"//*[@class = 'dropdown-toggle']","loginButton");
        //wait
        Thread.sleep(3000);
        //click member portal
        ReusuableMethoddd.clickMethod(driver,"//*[text()='Member Online Portal']","memberPortal");
        //wait
        Thread.sleep(2000);
        //switchTab
        ReusuableMethoddd.switchToTabByIndex(driver,1);
        //captureHints //dnn_TipsContentPanel
        String result = ReusuableMethoddd.captureText(driver,"//*[@id = 'dnn_TipsContentPanel']","Hints");
        //print it
        System.out.println("helpful hint says " + result);


    }//end test 3

}//end of class
