package com.shashankjaincompany.Selenium_locators;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTaskkatalon
{
    @Description("open the katalon demo page and verify the current url")
    @Test
    public void test_katalon(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeappointment = driver.findElement(By.linkText("Make Appointment"));
        makeappointment.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement passward = driver.findElement(By.id("txt-password"));
        passward.sendKeys("ThisIsNotAPassword");

        WebElement loginbutton = driver.findElement(By.id("btn-login"));
        loginbutton.click();

//        if(driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/profile.php#login")) {
//            System.out.println("Test case passed");
//        }
//        else{
//            System.out.println("Test case failed");
//        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment", "Test case passsed");


    }
}
