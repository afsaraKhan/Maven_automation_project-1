package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionitem_03part2 {
    public static void main(String[] args) throws InterruptedException {
        //setup the chrome driver with web drivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //lets create dynamic array to handle multiple cars on google search
        String[] cars = new String[5];
        cars[0] = "Hyundai";
        cars[1] = "KIA";
        cars[2] = "Chevrolet";
        cars[3] = "Toyota";
        cars[4] = "BMW 2003 m3";


        for (int i = 0; i < cars.length; i++){
            //navigate to bing web page
            driver.navigate().to("https://www.bing.com/");
            //wait 3 seconds
            Thread.sleep(3000);
            //search for cars using relative x path
            driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys(cars[i]);
            //hit submit on bing search
            driver.findElement(By.xpath("//*[@id = 'search_icon']")).submit();
            //wait three more seconds bro
            Thread.sleep(3000);
            //store the results in a string variable
            String bingResult = driver.findElement(By.xpath("//*[@id = 'b_tween']")).getText();
            //split the search result  using split command
            String[] searchResultArrayz = bingResult.split(" ");
            //print out only the search result number
            System.out.println("search result number for " + cars[i] +  " is " + searchResultArrayz[1]);
            //quit the browser


        }//end of loop


    }//end of main
}//end of class
