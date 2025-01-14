package com.shashankjaincompany.ex_selenium_xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Taskidrive360
{
  @Description("Verify that Free trial expire message in idrve.com")
   @Test
    public void idrivelogin() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.idrive360.com/enterprise/login");

       WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
       email.sendKeys("augtest_040823@idrive.com");

       WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
       password.sendKeys("123456");


       WebElement signin = driver.findElement(By.xpath("//button[@id='frm-btn']"));
       signin.click();

       Thread.sleep(12000);

       WebElement message = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));
       Assert.assertEquals(message.getText(),"Your free trial has expired");

       driver.quit();


    }
}
