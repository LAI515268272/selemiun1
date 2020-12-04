package com.lsj.word1.demo;


import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class demo2 {

    private static WebDriver chrome;


    @BeforeClass
    public static void  qudong(){

        System.setProperty("webdriver.chrome.driver","D:\\WM\\chromedriver.exe");


        chrome = new ChromeDriver();

        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @Test
    public void sle()throws Exception{

        chrome.get("http://eds.newtouch.cn/eds3/login.html");

        chrome.findElement(By.id("UserId")).sendKeys("191105");

        chrome.findElement(By.id("UserPassword")).sendKeys("lsj515268272");

        chrome.findElement(By.id("btnSubmit")).click();

        /*无法点击*/
        /*chrome.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div[2]/div[1]/div/span/a/span")).click();*/

    }

}
