package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");


        //locate searchBox
        WebElement searchBox = driver.findElement(By.name("field-keywords"));

        //type --> selenium
        searchBox.sendKeys("selenium");

        Thread.sleep(2000);
        //locate searchButton
        WebElement button = driver.findElement(By.xpath("//*[@value='Go']"));
        button.click();



    }
}
