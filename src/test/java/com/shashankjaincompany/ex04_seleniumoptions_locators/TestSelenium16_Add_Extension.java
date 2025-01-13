package com.shashankjaincompany.ex04_seleniumoptions_locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_Add_Extension {
    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        // EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/com/shashankjaincompany/ex04_seleniumoptions_locators/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.google.co.in/");

    }
}
