package ActionItems;

import DAY14_122024.Reuseable_Method_Loggers;
import DAY_13_121923.TestParent;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Action_Item7 extends TestParent {
    @Test
    public void tc001_VerifyLoginButtonOpensNewTab() throws InterruptedException {
        //navigate to transamericaRetirement
        driver.navigate().to("https://www.transamerica.com/retirement/your-retirement-plan");
        //scroll to login button
        Reuseable_Method_Loggers.scrollMethod(driver,"//*[@id = 'plan-for-success']",logger,"loginButtonclick");
        //click log in
        Reuseable_Method_Loggers.clickMethod(driver,"//*[@class = 'field__item']",logger,"loginButton");
        //wait a second to see it happen
        Thread.sleep(2000);
        //switch tab
        Reuseable_Method_Loggers.switchToTabByIndex(driver,1,logger);
        //capture text
        String result = Reuseable_Method_Loggers.captureText(driver,"//*[@class = 'h2-large']",logger,"loginText");
        //printext
        System.out.println("log in says " + result);
        //



    }//end test001

    @Test(dependsOnMethods = "tc001_VerifyLoginButtonOpensNewTab")
    public void tc002_VerifyRetirementVideoOpens() throws InterruptedException {
        //navigate to transamericaRetirement
        driver.navigate().to("https://www.transamerica.com/retirement/your-retirement-plan");
        //scroll to video
        Reuseable_Method_Loggers.scrollMethod(driver,"//*[@class = 'content']",logger,"blurb");
        //wait a sec
        Thread.sleep(2000);
        //click video///modal-trigger
        Reuseable_Method_Loggers.clickMethod(driver,"//*[@class = 'modal-trigger']",logger,"videoPlay");



    }//endtest
    @Test(dependsOnMethods = "tc002_VerifyRetirementVideoOpens")
    public void tc003_VerifyPhoneNumberIsClickable() throws InterruptedException {
        //navigate to transamericaRetirement
        driver.navigate().to("https://www.transamerica.com/retirement/your-retirement-plan");
        //scroll to twitter
        Reuseable_Method_Loggers.scrollMethod(driver,"//*[@id = 'block-footerbranding']",logger,"scrolltoBlurb");
        //click phone#//
        Reuseable_Method_Loggers.clickMethod(driver,"//*[text() = '800-797-2643']",logger,"Phonebutton");


    }//endtest003
    @Test(dependsOnMethods = "tc003_VerifyPhoneNumberIsClickable")
    public void tc004_VerifyTitlePage(){
        driver.navigate().to("https://www.transamerica.com/retirement/your-retirement-plan");
        //do string thing
        String expectedTitle = "Your Retirement Plan|Transamerica";
        String actualTitle = driver.getTitle();

        if(expectedTitle == actualTitle){
            logger.log(LogStatus.PASS, "title matches " + actualTitle);

        } else {
            logger.log(LogStatus.FAIL, "title does not match " + actualTitle);


        }//end if else



    }//end tc004
    @Test(dependsOnMethods = "tc004_VerifyTitlePage")
    public void tc005_GetPhoneNumberFromContactPage() throws InterruptedException {
        driver.navigate().to("https://www.transamerica.com/retirement/your-retirement-plan");
        //click search //
        //scroll to contact //
        Reuseable_Method_Loggers.scrollMethod(driver,"//*[text() = 'Agent Resources']",logger,"scrolltoAgent");
        //wait a sec
        Thread.sleep(2500);
        //click contact
        Reuseable_Method_Loggers.clickMethod(driver,"//*[text() = 'Contact Us']",logger,"contact");

        Thread.sleep(2000);


        //capture text
        String result = Reuseable_Method_Loggers.captureText(driver,"//*[text() = '800-797-2643']",logger,"hoursText");
        //printext
        System.out.println("customer service number is " + result);



    }//endtc005


}//end class

