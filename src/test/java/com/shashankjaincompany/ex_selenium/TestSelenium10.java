package com.shashankjaincompany.ex_selenium;

import io.qameta.allure.Description;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10 {
    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA HEALTHCARE SERVICE IS VISIBLE");
            Assert.assertTrue(true);
        }
        else {
            throw new Exception("\"CURA Health care service page not visible\"");
        }


    }
}
