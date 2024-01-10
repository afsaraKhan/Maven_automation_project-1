package DAY14_122024;

import DAY_13_121923.TestParent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T3_yahooextentEnhanced extends TestParent {
    @Test
    public void tc001_verifyStaySignedInIsChecked() {
        //navigate to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
        //click on sign in button
        Reuseable_Method_Loggers.clickMethod(driver, "//*[text() = 'Sign in']", logger, "Sign In Button");
        //store checked option into a boolean variable
        boolean isStaySignedInChecked = driver.findElement(By.xpath("//*[@id = 'persistent']")).isSelected();
        //print out if checkbox is selected
        System.out.println("The checkbox is checked: " + isStaySignedInChecked);
        //assert if condition is true
        Reuseable_Method_Loggers.isConditionTrue(isStaySignedInChecked, logger);
    }//end of tc 01
}//end class
