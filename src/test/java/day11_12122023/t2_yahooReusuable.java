package day11_12122023;

import day10_12122023.ReusuableMethoddd;
import org.openqa.selenium.WebDriver;

public class t2_yahooReusuable {
    public static void main(String[] args) {
        //instantiate the driver
        WebDriver driver = ReusuableMethoddd.setUpDriver();
        //navigate to metlife
        driver.navigate().to("https://www.yahoo.com/");
        //click o sports menu (third tab or index 2)
        ReusuableMethoddd.clickByIndexMethod(driver,"//*[contains(@class,'_yb_q22uj')]",2,"yahoo headers");
        //quit driver
        driver.quit();


    }//end main
}//end class
