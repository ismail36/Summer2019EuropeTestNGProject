package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTestText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://amazon.com");

        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("selenium");

        WebElement button = driver.findElement(By.xpath("//*[@value='Go']"));
        button.click();

        String str = driver.findElement(By.xpath("//span[contains(text(),'results for'")).getText();

        System.out.println("str = " + str);
        
    }
}
