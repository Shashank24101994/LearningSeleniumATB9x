package com.shashankjaincompany.Selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium19
{
    @Test
    public void test1_selenium() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial");
        WebElement bussinessemailinputbox = driver.findElement(By.id("page-v1-step1-email"));
        bussinessemailinputbox.sendKeys("shashank123");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        List<WebElement> buttonlist = driver.findElements(By.tagName("button"));
        buttonlist.get(0).click();

        Thread.sleep(3000);

        WebElement errormessage = driver.findElement(By.xpath("//div[normalize-space()='The email address you entered is incorrect.']"));
        Assert.assertEquals(errormessage.getText(),"The email address you entered is incorrect.");



    }
}
