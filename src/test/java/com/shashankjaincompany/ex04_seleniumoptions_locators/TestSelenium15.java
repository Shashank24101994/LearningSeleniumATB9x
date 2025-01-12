package com.shashankjaincompany.ex04_seleniumoptions_locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium15
{
    @Description("OPTION CLASS")
    @Test
    public void testSelenium()
    {
        ChromeOptions chromeOptions =new ChromeOptions();
        //chromeOptions.addArguments("--window-size=1280,720");
        //        edgeOptions.addArguments("--window-size=800,600");
        chromeOptions.addArguments("--incognito");
        // edgeOptions.addArguments("--start-maximized")



        WebDriver driver = new ChromeDriver(chromeOptions);
        // EdgeOptions or chromeoption -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?


    }

}
