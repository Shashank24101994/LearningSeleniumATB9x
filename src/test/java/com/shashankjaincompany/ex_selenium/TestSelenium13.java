package com.shashankjaincompany.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium13 {
    @Description("Open google and bing.com")
    @Test
    public void test_Selenium01() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com"); // 95%


        // Use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        // close command= close only current tab
        driver.close();
        // quit command= close all tabs
        driver.quit();



    }
}
