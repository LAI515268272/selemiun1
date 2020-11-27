package com.lsj.word1.demo;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.*;

import java.util.concurrent.TimeUnit;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class demo1 {

    private static   WebDriver chrome;


    @BeforeClass
    public static void qudong(){

       System.setProperty("webdriver.chrome.driver","D:\\WM\\chromedriver.exe");

        chrome = new ChromeDriver();

        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

    @Test
    public void test1()throws Exception{

        chrome.get("http://www.baidu.com");
        Thread.sleep(5000);

        chrome.findElement(By.id("kw")).sendKeys("java");
        Thread.sleep(2000);

        chrome.findElement(By.xpath("//*[@id=\"su\"]")).click();
        Thread.sleep(6000);

        chrome.findElement(By.xpath("//*[@id=\"2\"]/h3/a")).click();

        Thread.sleep(10000);

        chrome.quit();




    }

}
