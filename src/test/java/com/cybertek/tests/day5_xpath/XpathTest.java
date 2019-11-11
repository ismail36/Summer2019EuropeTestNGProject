package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class XpathTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

     //   driver.get("https://amazon.com");

    //    driver.findElement(By.name("field-keywords")).sendKeys("selenium");


     //   WebElement button = driver.findElement(By.xpath("//*[@class='nav-input']"));

     //   button.click();

       // /html/body/div/div/div/div/p[3]

    }
}
