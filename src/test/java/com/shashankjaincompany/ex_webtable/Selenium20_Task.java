package com.shashankjaincompany.ex_webtable;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium20_Task {
    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test_web_table_login() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement table = driver.findElement(By.xpath("//div[@class='orangehrm-container']/div[@class='oxd-table orangehrm-employee-list']"));
        List<WebElement> row = table.findElements(By.xpath("//div[@class='oxd-table-body']/div[@class='oxd-table-card']"));
        for (int i = 1; i <=row.size(); i++) {
            List<WebElement> col = row.get(i).findElements(By.xpath("//div[@role='row']"));
            for (WebElement c : col) {
                System.out.println(c.getText());
            }


        }


    }
}

