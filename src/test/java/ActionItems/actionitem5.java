package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class actionitem5 {
    public static void main(String[] args) throws InterruptedException {
        //create arraylist for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11225");
        zipCode.add("11215");
        //arraylist for first name
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Steve");
        firstName.add("Aladdin");
        //arraylist for last name
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Lebron");
        lastName.add("Jones");
        //arraylist for dob
        ArrayList<String> dateofBirth = new ArrayList<>();
        dateofBirth.add("06141996");
        dateofBirth.add("09151999");
        //arraylist for vehicle year
        ArrayList<String> vehicleYear = new ArrayList<>();
        vehicleYear.add("2006");
        vehicleYear.add("2018");
        //arraylist for vehicle make
        ArrayList<String> vehicleMake = new ArrayList<>();
        vehicleMake.add("Toyota");
        vehicleMake.add("BMW");
        //arraylist for vehicle model
        ArrayList<String> vehicleModel = new ArrayList<>();
        vehicleModel.add("Avalon");
        vehicleModel.add("M4");
        //arraylist for days per week
        ArrayList<String> dpW = new ArrayList<>();
        dpW.add("6");
        dpW.add("3");
        //arraylist for miles
        ArrayList<String> avgMiles = new ArrayList<>();
        avgMiles.add("15000");
        avgMiles.add("6000");
        WebDriverManager.chromedriver().setup();
        //arraylist for addy
        ArrayList<String> addyGeico = new ArrayList<>();
        addyGeico.add("934 carroll st");
        addyGeico.add("938 carroll st");
        //arraylist for apt numbers
        ArrayList<String> aptNumbers = new ArrayList<>();
        aptNumbers.add("1");
        aptNumbers.add("2");

        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();

        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //declare your web driver and pass the options variable inside the chromedriver
        WebDriver driver = new ChromeDriver(options);
        //start of for loop
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to geico homepage

                driver.navigate().to("https://www.geico.com/");

            //click on auto
            driver.findElement(By.xpath("//*[contains(@class, 'icon-container')]")).click();
            Thread.sleep(2000);
            //click on start quote button
            driver.findElement(By.xpath("//*[contains(@class, 'modal-trigger btn btn--primary btn--full-mobile')]")).click();
            //enter zipcode into field
            driver.findElement(By.xpath("//*[@id = 'bundle-modal-zip']")).sendKeys(zipCode.get(i));
            //sleep for 2 secs
            Thread.sleep(2000);
            //click on homeowners using data product, homeowners
            driver.findElements (By.xpath("//*[@data-product = 'homeowners']")).get(1).click();
            //click on continue
            driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
            //sleep for 2 secs
            Thread.sleep(4000);
            //enter date of birth into field date
            try {   //="Date" //="Date of Birth"
                driver.findElement(By.xpath("//*[@aria-label ='Date of Birth']")).sendKeys(dateofBirth.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter date of birth because" + e);
            }// end of date of birth catch try
            //sleep for 2
            Thread.sleep(2000);
            //click on Next
            try { //type="submit"
                driver.findElement(By.xpath("//*[@type = 'submit']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } // end of click next catch try
            //sleep for 2 secs
            Thread.sleep(3000);
            //enter first name into field //name="Id_GiveFirstName_81879"//aria-label="First Name"

                driver.findElement(By.xpath("//*[@aria-label= 'First Name']")).sendKeys(firstName.get(i));

            //enter last name into field
            try {
                driver.findElement(By.xpath("//*[@data-formotivid = 'GiveLastName']")).sendKeys(lastName.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter last name because" + e);
            } // end of last name catch try
            //click on next, use try catch as well
            //wait more
            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//*[@type = 'submit']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } //end of click next catch try
            //wait more
            Thread.sleep(2000);
            //enter addy
        try {
            driver.findElement(By.xpath("//*[@class = 'address-search-field include-clear-action']")).sendKeys(addyGeico.get(i));
        } catch (Exception e) {
            System.out.println("Unable to addy because " + e);
        } // end of last name catch try
        //wait more
        Thread.sleep(2000);

        //choose addy from dropdown

        try {
            driver.findElements(By.xpath("//*[contains(@class,'query-results-item')]")).get(0).click();

        } catch (Exception e) {
            System.out.println("Unable to click addy because " + e);
        } // end of last name catch try
        //wait more
        Thread.sleep(2000);
        //=""
        //enter aptnumber

        try { //name="Id_GiveUnitNumber_25847"//data-formotivid="UnitNumber"
            driver.findElement(By.xpath("//*[@data-formotivid ='UnitNumber']")).sendKeys(aptNumbers.get(i));
        } catch (Exception e) {
            System.out.println("Unable to aptNumber because " + e);
        } // end of last name catch try
        //wait
        Thread.sleep(2000);
        //clcik next

        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        //wait
        Thread.sleep(7500);
        //selectYes//id="Id_IsHomeAddressActivity_69058"//radio react-markdown//
        driver.findElement(By.xpath("//*[@id = 'labelForYes']")).click();
        //wait
        Thread.sleep(3000);
        //click yes//id="labelForNo"
        driver.findElement(By.xpath("//*[@id = 'labelForNo']")).click();
        //wait
        Thread.sleep(3000);
        //click yes for have you lived at this addy for 2 years //id="labelForNo"
        driver.findElement(By.xpath("//*[@id = 'labelForYes']")).click();
        //wait
        Thread.sleep(3000);
        //enter addy again
        try {
            driver.findElement(By.xpath("//*[@class = 'address-search-field include-clear-action']")).sendKeys(addyGeico.get(i));


        } catch (Exception e) {
            System.out.println("Unable to enter addy because " + e);
        }//end of enter addy
        //choose addy from dropdown //query-results-item
        try {
            driver.findElements(By.xpath("//*[contains(@class,'query-results-item')]")).get(0).click();

        } catch (Exception e) {
            System.out.println("Unable to choose addy because " + e);
        }//end of choose addy from dropdown

        //wait a sec
        Thread.sleep(2000);
        //enter apt
        try { //name="Id_GiveUnitNumber_25847"//data-formotivid="UnitNumber"
            driver.findElement(By.xpath("//*[@data-formotivid ='UnitNumber']")).sendKeys(aptNumbers.get(i));
        } catch (Exception e) {
            System.out.println("Unable to aptNumber because " + e);
        } // end of last name catch try
        //clcik next
        try {
            driver.findElement(By.xpath("//*[@type = 'submit']")).click();


        } catch (Exception e) {
            System.out.println("Unable to click next " + e);
        }//end of clcik next catc and try
        //wait for 2 seconds
        Thread.sleep(2000);
        //click no for Vin #//click no//id="labelForNo
        try {
            driver.findElement(By.xpath("//*[@id = 'labelForNo']")).click();


        } catch (Exception e) {
            System.out.println("Unable to click no " + e);
        }//end of click no
        //click on Next
        try { //type="submit"
            driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        } catch (Exception e) {
            System.out.println("Unable to click next because" + e);
        } // end of click next catch try
        //wait 2 secs
        Thread.sleep(2000);
        //click year from dropdownlist
        //select by year vivible text
        WebElement carYear = driver.findElement(By.xpath("//*[@data-formotivid='GiveYear']"));
        //select the select funtion for the start month dropdown

        Select carYeardropdown = new Select(carYear);
        //select by vivible text
        carYeardropdown.selectByVisibleText("2002");
        //wait a sec
        Thread.sleep(2000);
        //select make vivsible text

        WebElement carMake = driver.findElement(By.xpath("//*[@id='Id_GiveMake_97744']"));
        //select the select funtion for the start month dropdown

        Select carMakeDropdown = new Select(carMake);
        //select by vivible text
        carMakeDropdown.selectByVisibleText("Acura");
        //wait a second
        Thread.sleep(2000);
        //enter model
        WebElement carModel = driver.findElement(By.xpath("//*[@id='Id_GiveModel_98762']"));
        //select the select funtion for the start month dropdown

        Select carModelDropdown = new Select(carModel);
        //select by vivible text
        carModelDropdown.selectByVisibleText("MDX");
        //wait a second
        Thread.sleep(2000);
        //click next
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        //wait
        Thread.sleep(2000);
        //click next on antitheft device
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        //wait 2secs
        Thread.sleep(2000);
        //click on lease
        driver.findElement(By.xpath("//*[@id = 'labelForL']")).click();
        //wait
        Thread.sleep(1000);
        //clcik next
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        //wait
        Thread.sleep(2000);
        //choose commute
        driver.findElement(By.xpath("//*[@id = 'labelForC']")).click();
        //clcik next
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        //wait
        Thread.sleep(2000);
        //select make vivsible text

        WebElement daysPerweek = driver.findElement(By.xpath("//*[@aria-label='Days per Week']"));
        //select the select funtion for the start month dropdown

        Select daysPerweekDropdown = new Select(daysPerweek);
        //select by vivible text
        carMakeDropdown.selectByVisibleText("1");
        //enter miles
        driver.findElement(By.xpath("//*[@id = 'Id_GiveMilesOneWay_79460']")).sendKeys("20");
        //wait a sec
        Thread.sleep(2000);
        //click nextt
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        //wait a sec
        Thread.sleep(2000);
        //click next on more about 2002 acura
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        //wait a sec
        Thread.sleep(2000);
        //click next one last time
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();
        //select gender
        WebElement gender = driver.findElement(By.xpath("//*[@aria-label='Gender']"));
        //select the select funtion for the start month dropdown


        Select genderDropdown = new Select(gender);
        //select by vivible text
        genderDropdown.selectByVisibleText("Non-Binary");
        //wait a sec
        Thread.sleep(2000);
        //click agree and continue
        driver.findElement(By.xpath("//*[@type = 'submit']")).click();





































        }//end of for loop

    }//end of main
}//emnd of class
