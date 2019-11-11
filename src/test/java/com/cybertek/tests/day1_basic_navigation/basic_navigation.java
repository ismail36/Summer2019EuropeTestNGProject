package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {

    public static void main(String[] args) {

        //we have to setup webDriver on the browser that we gonna use
        WebDriverManager.chromedriver().setup();

        //creating object for using selenium driver
        WebDriver driver = new ChromeDriver();

        //open browser
        driver.get("https://amazon.com");
        boolean x = false;
        //get the title and print it
        if(driver.getTitle().equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")){
            x=true;
            System.out.println(x);
        }




    }

}
