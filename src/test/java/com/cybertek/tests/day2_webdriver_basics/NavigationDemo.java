package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //import class CMD+ENTER or ALT+ENTER or CTRL+SPACE
        //selenium object
        WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.get("https://www.google.com");

        Thread.sleep(3000);
        //navigate to website
        driver.get("https://www.amazon.com");


        Thread.sleep(3000);
        //another way of opening website
        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(3000);
        //goes back to previous webPage
        driver.navigate().back();

        Thread.sleep(3000);
        //goes back to forward webPage
        driver.navigate().forward();

        //refresh the webPage
        driver.navigate().refresh();






    }
}
