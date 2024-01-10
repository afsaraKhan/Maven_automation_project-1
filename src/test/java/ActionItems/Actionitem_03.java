package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionitem_03 {
    public static void main(String[] args) throws InterruptedException {
        //setup the chrome driver with web drivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to bing web page
        driver.navigate().to("https://www.bing.com/");
        //wait 3 seconds
        Thread.sleep(3000);
        //search for bmw 2003 m3 using relative x path
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("bmw 2003 m3");
        //hit submit on bing search
        driver.findElement(By.xpath("//*[@id = 'search_icon']")).submit();
        //wait three more seconds bro
        Thread.sleep(3000);
        //store the results in a string variable
        String bingResult = driver.findElement(By.xpath("//*[@id = 'b_tween_searchResults']")).getText();
        //split the search result  using split command
        String[] searchResultArrays = bingResult.split(" ");
        //print out only the search result number
        System.out.println("search result number is " + searchResultArrays[1]);
        //quit the browser
        driver.quit();

    }//emd of main
}//end of class
