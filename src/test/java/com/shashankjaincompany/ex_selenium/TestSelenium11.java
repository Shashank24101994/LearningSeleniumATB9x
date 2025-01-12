package com.shashankjaincompany.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium11 {
    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() {


        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //  driver.manage().window().minimize();
        driver.get("https://sapphirebuildsquare.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());



    }
}
