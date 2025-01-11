package com.shashankjaincompany.ex01_SeleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium01
{
  @Test
    public void test_Selenium01()
    {
        // open the url and print the title
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());



    }



}
