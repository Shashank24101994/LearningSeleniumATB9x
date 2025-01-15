package com.shashankjaincompany.ex_webtable;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium21 {
    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test_web_table_login() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        WebElement table=driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
        List<WebElement> row = driver.findElements(By.tagName("tr"));
        for(int i=0;i<row.size();i++){

            List<WebElement> col = row.get(i).findElements(By.tagName("td"));
            for(WebElement c:col)
            {
                if(c.getText().equals("Taiwan")){
                    System.out.println("city: "+col.get(1).getText());
                }

            }
        }


        }
    }



