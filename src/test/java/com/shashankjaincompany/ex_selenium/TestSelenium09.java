package com.shashankjaincompany.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09 {
    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.manage().window().minimize();
        driver.get("https://www.confidencegroup.co/");
       // System.out.println(driver.getTitle());
      //  System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"CPIL");


    }
}
