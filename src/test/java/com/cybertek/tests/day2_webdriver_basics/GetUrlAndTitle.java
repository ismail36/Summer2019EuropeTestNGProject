package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {

    public static void main(String[] args) {

        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //open the browser
        WebDriver driver = new ChromeDriver();

        //go to webPage
        driver.get("https://practice.cybertekschool.com");

        //get the currentUrl
        String url = driver.getCurrentUrl();

        //get title of page
        String title = driver.getTitle();

        //printout
        System.out.println("URL is: " + url);
        System.out.println("Title is: " + title);

        //get pageSource() -> gets the source code of the pace
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }
}
