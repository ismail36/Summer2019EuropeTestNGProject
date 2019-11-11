package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    /**
     * Verify URL changed
     * open chrome
     * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */

    public static void main(String[] args) {

        //open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save url to string variable
        String expectedURL = "http://practice.cybertekschool.com/email_sent";

        WebElement emailInput = driver.findElement(By.name("email"));
        //sendKeys() --> send keyboard actions to WebElement / enters given text
        emailInput.sendKeys("email@gmail.com");

        //click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ActualURL:      " + actualURL);
            System.out.println("ExpectedURL:    " + expectedURL);
        }

        driver.quit();


    }

}
