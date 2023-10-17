package com.softserve.edu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppTest {

    @Test
    public void testApp1() {
        System.out.println("class AppTest: testApp1()");
        Assertions.assertTrue(true);
    }

    @Test
    public void checkMac() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 0 by default
        driver.manage().window().maximize();
        //
        driver.get("http://taqc-opencart.epizy.com/");
        driver.get("https://demo.opencart.com/");
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
