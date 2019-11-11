package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    /**
     * Verify confirmation message
     * open browser
     * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        String expectedEmail = "email@gmail.com";
        WebElement emailInput = driver.findElement(By.name("email"));
        //sendKeys() --> send keyboard actions to WebElement / enters given text
        emailInput.sendKeys(expectedEmail);

        //verify that email is displayed in the input box
        String actualEmAil = emailInput.getAttribute("value");

        if(expectedEmail.equals(actualEmAil)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected email:     " + expectedEmail);
            System.out.println("Actual email:       " + actualEmAil);
        }

        //click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //expected confirmation message
        String expectedConfirmation = "Your e-mail's been sent!";

   //     WebElement messageElement = driver.findElement(By.name("confirmation_message"));
   //     String actualMessage = messageElement.getText();

        String actualConfirmation = driver.findElement(By.name("confirmation_message")).getText();

        if(expectedConfirmation.equals(actualConfirmation)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Confirmation=  " + expectedConfirmation);
            System.out.println("Actual Confirmation=    " + actualConfirmation);
        }

       driver.quit();






    }
}
