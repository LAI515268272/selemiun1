package com.lsj.word1.demo;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
        System.out.println("运行了网址");
        Thread.sleep(5000);

        chrome.findElement(By.id("kw")).sendKeys("java");
        System.out.println("输入了文字");
        Thread.sleep(2000);

        chrome.findElement(By.xpath("//*[@id=\"su\"]")).click();
        Thread.sleep(6000);
        System.out.println("点击了搜索按钮");

        chrome.findElement(By.xpath("//*[@id=\"2\"]/h3/a")).click();
        System.out.println("点击了链接");

        Thread.sleep(10000);

        chrome.quit();
        System.out.println("关闭浏览器");




    }
    @Test
    public void test2(){

        chrome.get("http://wwww.baidu.com");

        chrome.findElement(By.xpath("//*[@id=\"u1\"]/a")).click();

        chrome.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__footerULoginBtn\"]")).click();

        chrome.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__userName\"]")).sendKeys("13566201301");

        chrome.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__password\"]")).sendKeys("lsj515268272");

        chrome.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__submit\"]")).click();
        
    }

}
