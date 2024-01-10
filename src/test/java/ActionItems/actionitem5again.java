package ActionItems;

import day10_12122023.ReusuableMethoddd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class actionitem5again {
    public static void main(String[] args) throws InterruptedException {
        //instantiate the driver
        WebDriver driver = ReusuableMethoddd.setUpDriver();
        //declare string array
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11205");
        zipCode.add("11210");
        zipCode.add("11228");
        //INTIATE forloop
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to metlife
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //click find a workshop
            ReusuableMethoddd.clickMethod(driver,"//*[text()='Find a Workshop']","find a workshop button");
            //click in person
            ReusuableMethoddd.clickMethod(driver,"//*[text()='In-Person']","in person button");
            //enter zipcode
            ReusuableMethoddd.sendKeys(driver,"//*[@id = 'location-search']",zipCode.get(i),"zip code search bar");
            //click search
            ReusuableMethoddd.clickMethod(driver,"//*[@class='rightArrow-daPRP']","search button");
            //wait
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
            Thread.sleep(2000);
            //scroll to element
            ReusuableMethoddd.scrollMethod(driver,"//*[@id = 'studioWorkshopSchedule']","scheduleWeight");
            //wait
            Thread.sleep(2000);
            //print whole schedule
            // store the scdulde into a webelement variable
            //WebElement scheduleWw = driver.findElement(By.xpath("//*[@id = 'studioWorkshopSchedule']"));
            //print whole schedule
            //System.out.println("the whole schedule is " + scheduleWw.getText());


        }//end ofloop
        ReusuableMethoddd.captureText(driver,"//*[@id = 'studioWorkshopSchedule']","scheduleWeight");
    }//end of main
}//end of class
