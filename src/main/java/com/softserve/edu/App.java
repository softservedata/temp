package com.softserve.edu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        //System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 0 by default
        driver.manage().window().maximize();
        //
        driver.get("http://taqc-opencart.epizy.com/");
        Thread.sleep(2000); // For Presentation
        //
        driver.findElement(By.name("search")).sendKeys("mac");
        Thread.sleep(2000); // For Presentation
        //
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
        //
        Thread.sleep(8000); // For Presentation
        driver.quit();
    }
}
