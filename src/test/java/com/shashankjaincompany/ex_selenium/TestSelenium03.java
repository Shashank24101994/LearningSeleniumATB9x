package com.shashankjaincompany.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03
{

    @Description("OPEN THE VWO.COM AND GET TITLE")
    @Test
    public void test_selenium(){
        // Selenium 3
        // You need to setup the Driver(browser)
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        // Selenium 4
        // Selenium Manager - utility - Which can download the driver automaticially
        // start and stop itself.
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

    }
}
