package Day5_11212023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GOOGLESEARCHTExt {
    public static void main(String[] args) throws InterruptedException {
        //setup the chrome driver with web drivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //maximize the driver
        driver.manage().window().maximize();
        //search for cars using relative x path
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //search for cars using absolute x path
        ////driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("cars");
        //hit submit on google search
        driver.findElement(By.xpath("//*[@name = 'btnK']")).submit();
        //slow down by 2 seconds
        Thread.sleep(2000);
        //store the results in a string variable
        String searchResult = driver.findElement(By.xpath("//*[@id = 'result-stats']")).getText();
        //print out the result of the counsle
        System.out.println("search result is " + searchResult);
        //split the search result  using split command
        String[] searchResultArray = searchResult.split(" ");
        //print out only the search result number
        System.out.println("search result number is " + searchResultArray[1]);
        //quit the browser
        driver.quit();


    }//end of main
}//enmd of class
