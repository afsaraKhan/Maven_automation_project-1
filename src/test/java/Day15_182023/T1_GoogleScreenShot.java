package Day15_182023;

import DAY14_122024.Reuseable_Method_Loggers;
import DAY_13_121923.TestParent;
import org.testng.annotations.Test;

public class T1_GoogleScreenShot extends TestParent {
    @Test
    public void tc001_searchForACar() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //search for BMW
        Reuseable_Method_Loggers.sendKeys(driver, "//*[@name= 'q']", "BMW", logger,"SearchField");
        //hit submit on the google search button
        Reuseable_Method_Loggers.submitMethod(driver, "//*[@name= 'btnKlp']", logger,"Submit");
        Thread.sleep(1000);
    }//end of test case 1

    @Test
    public void tc001_GitCommit() {
        //commiting a new test case
        //commiting even mo

        //roysa was here

    }//emd tedt


}//end class
