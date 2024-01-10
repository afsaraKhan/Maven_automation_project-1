package day11_12122023;

import day10_12122023.ReusuableMethoddd;
import org.openqa.selenium.WebDriver;

public class metLifeReuseble {
    public static void main(String[] args) throws InterruptedException {
        //instantiate the driver
        WebDriver driver = ReusuableMethoddd.setUpDriver();
        //navigate to metlife
        driver.navigate().to("https://www.metlife.com/");
        //click on the solutions tab
        ReusuableMethoddd.clickMethod(driver, "//*[@aria-controls = 'section1']", "Solutions Tab");
        //click on the dental menu
        ReusuableMethoddd.clickMethod(driver, "//*[text() = 'Dental']", "Dental Tab");
        //wait
        Thread.sleep(3000);
        //quit the driver
        driver.quit();
    }//end of main
}//end class
