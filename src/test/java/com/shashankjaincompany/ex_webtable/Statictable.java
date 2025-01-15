package com.shashankjaincompany.ex_webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Statictable
{
    @Test
    public void Test_statictable() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1) find total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();// used when multiple table on webpage
        // int rows= driver.findElements(By.tagName("tr")).size(); // used by only single webtable on page
        System.out.println("number of rows : " + rows);

        //2) find total number of columns in a table

        int cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
        System.out.println("number of coloumn equals :" + cols);

        //3) Read data from specific row and column
        // String countryname = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[6]//td[3]")).getText();
        // System.out.println(countryname);

        //4) read data from all the rows and colums
/*       for(int r=2 ;r<=rows;r++){

            for(int c=1;c<=cols;c++){
                String values = driver.findElement(By.xpath("//table[@id='customers']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.print(values+"\t");

            }
            System.out.println();
        }*/


        //5) Print company name whose country is canada
         for(int r=2;r<=rows;r++) {

             String countryname = driver.findElement(By.xpath("//table[@id='customers']//tr[" + r + "]//td[3]")).getText();
             if(countryname.equals("UK")){
                 String contactname = driver.findElement(By.xpath("//table[@id='customers']//tr[" + r + "]//td[2]")).getText();
                 System.out.println(contactname+"\t"+countryname);
             }
         }

    }}


