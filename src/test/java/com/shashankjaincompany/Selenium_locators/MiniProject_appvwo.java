package com.shashankjaincompany.Selenium_locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiniProject_appvwo
{
    @Description("TC #1 - Login to VWO app with incoorect credential")
    @Test
    public void test_appvwo() throws InterruptedException {
        WebDriver driver = new ChromeDriver() ;
        Thread.sleep(5000);
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.id("login-password")).sendKeys("admin");
        driver.findElement(By.xpath("//span[@data-qa='ezazsuguuy']")).click();
        if(driver.findElement(By.xpath("//span[@data-qa='ezazsuguuy']")).isDisplayed()){

            System.out.println("Login Failed");

        }
        else {
            System.out.println("login passed");
        }
    }
}
