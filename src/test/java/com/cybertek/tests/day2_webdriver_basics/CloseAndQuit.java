package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);

        //close() --> closes the tab which is opened by the selenium
        driver.close();

        driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);

        //quit() --> closes the browser
        driver.quit();


    }
}
