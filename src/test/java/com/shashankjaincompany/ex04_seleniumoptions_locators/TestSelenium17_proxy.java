package com.shashankjaincompany.ex04_seleniumoptions_locators;

import io.qameta.allure.Description;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium17_proxy
{

    @Description("proxy")
    @Test
    public void test_Selenium0()
    {
        EdgeOptions edgeOptions=new EdgeOptions();
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("188.255.245.205:1080");
        edgeOptions.setCapability("proxy", proxy);
        WebDriver driver=new EdgeDriver( edgeOptions);
        System.out.println(proxy);

    }
}
