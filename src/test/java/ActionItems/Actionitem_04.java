package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Actionitem_04 {
    public static void main(String[] args) throws InterruptedException {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");

        //run in headless mode (runs in the background)
//        options.addArguments("headless");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //declare string array
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11205");
        zipCode.add("11210");
        zipCode.add("11228");
        //INTIATE forloop
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to weight watchers
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //declare javascript executor
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //wait 3 seconds
            Thread.sleep(3000);
            //click find a workshop
            driver.findElement(By.xpath("//*[text()='Find a Workshop']")).click();
            //wait more
            Thread.sleep(2000);
// Click in person
            driver.findElement(By.xpath("//*[text()='In-Person']")).click();
//wait few seconds
            Thread.sleep(3000);
            //store search box in array
            //store the home value into webelement variable
            WebElement zipValue = driver.findElement(By.xpath("//*[@id = 'location-search']"));
            //clear zipvalue
            zipValue.clear();
            //enter zips
            zipValue.sendKeys(zipCode.get(i));
            //wait 2 seconds
            Thread.sleep(2000);
           //click search button
driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
//wait more
            Thread.sleep(3000);
            //define an arraly list of webelements
            ArrayList<WebElement> studioLinks = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class,'linkUnderline-1_h4g')]")));
            // if statements
            if (i == 0) {
                studioLinks.get(1).click();
            }//end of if

            else if (i == 1) {
                studioLinks.get(2).click();

            }//end else if
            else if (i == 2) {
                studioLinks.get(0).click();




            }//end of else if

            //more wait time

            Thread.sleep(3000);

            //store address as variable and print
            WebElement addyWeight = driver.findElement(By.xpath("//*[@class = 'address-2PZwW']"));
            //print adddress
            System.out.println(" The WeightWatchers addys are " + addyWeight.getText());
            //wait some mo
            Thread.sleep(3000);
            // store the scdulde into a webelement variable
            WebElement scheduleWw = driver.findElement(By.xpath("//*[@id = 'studioWorkshopSchedule']"));
            //scroll into element
            jse.executeScript("arguments[0].scrollIntoView(true);", scheduleWw);
            //print whole schedule
            System.out.println("the whole schedule is " + scheduleWw.getText());







            }//end of loop





        }//end of main





    }//end of class

