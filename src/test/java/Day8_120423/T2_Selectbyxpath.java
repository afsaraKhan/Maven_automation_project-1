package Day8_120423;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_Selectbyxpath {
    public static void main(String[] args) throws InterruptedException {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");

        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //clear and enter home value
        WebElement homeValue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
        //clear home value
        homeValue.clear();
        // type in 900000 into home value
        homeValue.sendKeys("900000");
        //clear and enter down payment
        WebElement dPayment = driver.findElement(By.xpath("//*[@id = 'downpayment']"));
        //clear home value
        dPayment.clear();
        // type in 900000 into home value
        dPayment.sendKeys("900000");
        //click on dropdown
      driver.findElement(By.xpath("//*[@name= 'param[start_month]']")).click();
        //clcick on xpath vivsible text for january
        driver.findElement(By.xpath("//*[text()= 'Jan']")).click();
        //select by vivible text

        Thread.sleep(2000);
        //verify that it selects back the Dec which is the default month
        driver.findElement(By.xpath("//*[text()='Dec']")).click();
        //wait a second to see change
        Thread.sleep(3000);
        //call quit funtion to exit you session
        driver.quit();



    }//emnd of main
}//end of class
