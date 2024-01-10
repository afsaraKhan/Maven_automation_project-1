package DAY14_122024;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.ArrayList;

public class Reuseable_Method_Loggers {
    //create a click method to click on any web element
    public static void clickMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to click on " + elementName);
            //attach if click method fails
            getScreenShot(driver, elementName, logger);

        }// end try catch
    }//end of click method

    public static void isConditionTrue(boolean bool, ExtentTest logger) {
        if (bool == true) {
            logger.log(LogStatus.PASS, "Boolean Condition is " + bool);
        } else {
            logger.log(LogStatus.FAIL, "Boolean Condition is " + bool);
        }
    }//end of isConditionTrue method

    public static void scrollMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            jse.executeScript("arguments[0].scrollIntoView(true);", element);
            logger.log(LogStatus.PASS, "Successfully scrolled to " + elementName);

        } catch (Exception e) {
            System.out.println("unable to scroll to element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to scroll to " + elementName);

        }//end of exception

    }//end scrollmethod

    public static void switchToTabByIndex(WebDriver driver, int index, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            //call ArrayList function to store the tabs
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            //switch to new tab
            driver.switchTo().window(tabs.get(index));
            logger.log(LogStatus.PASS, "Successfully switched to " + index);

        } catch (Exception e) {
            System.out.println("Unable to switch tab " + ":" + e);
            logger.log(LogStatus.FAIL, "unable to switch to " + index);

        }//endexcelption
    }//end of switch tab method

    public static String captureText(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String result = "";
        try {
            result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
            logger.log(LogStatus.PASS, "Successfully captured " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to get text " + ":" + e);
            logger.log(LogStatus.FAIL, "unable to capture " + elementName);

        }
        return result;
    }//end of capture text method

    public static void sendKeys(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.clear();
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully sent text " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to type on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to send text " + elementName);
            //attach if click method fails
            getScreenShot(driver, elementName, logger);
        }//end of try catch


    }//end sendkeys
    public static void submitMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
            logger.log(LogStatus.PASS, "Successfully submitted on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to submit on " + elementName);
            //attach if click method fails
            getScreenShot(driver, elementName, logger);
        }//end of try catch
    }//end of submit method

    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error occurred while taking SCREENSHOT!!!");
            e.printStackTrace();
        }//end try catch
    }//end of getScreenshot method


}//end class
