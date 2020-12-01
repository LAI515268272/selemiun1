package com.lsj.word1.demo;


import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
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
    public void sle(){

        chrome.get("http://www.github.com");
    }

}
