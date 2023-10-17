package com.softserve.edu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


public class App {

    private static void takeScreenShot(WebDriver driver) throws IOException {
        String currentTime = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-S").format(new Date());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./" + currentTime + "_screenshot.png"));
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        //
        /*
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
        */
        /*
        WebDriverManager.phantomjs().setup();
        WebDriver driver = new PhantomJSDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 0 by default
        driver.manage().window().maximize();
        //
        driver.get("http://www.google.com");
        System.out.println("\tdriver.get http://www.google.com DONE");
        System.out.println("\tCurrent title is: " + driver.getTitle());
        Thread.sleep(1000);
        //
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        //element.submit();
        System.out.println("\telement.sendKeys Cheese! DONE");
        System.out.println("\tPage title is: " + driver.getTitle());
        element.submit();
        Thread.sleep(1000);
        System.out.println("\tPage title is: " + driver.getTitle());
        //
        System.out.println("\tTaking First Screenshot ...");
        Thread.sleep(2000);
        takeScreenShot(driver);
        //
        driver.findElement(By.partialLinkText("Cheese - Wikipedia")).click();
        System.out.println("\tELEMENT IS " + driver.findElement(By.id("firstHeading")).getText());
        //Assert.assertEquals(driver.findElement(By.id("firstHeading")).getText(), "Cheese");
        //
        System.out.println("\tTaking Second Screenshot ...");
        // File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(scrFile, new File("./screenshot1.png"));
        Thread.sleep(2000);
        takeScreenShot(driver);
        System.out.println("\tDone Screenshot");
        //
        driver.quit();
        */
        //
        WebDriver driver = new HtmlUnitDriver(false);
        //((HtmlUnitDriver) driver).setJavascriptEnabled(true); // TODO Enable CSS
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/");
        System.out.println("\tdriver.get http://www.google.com DONE");
        System.out.println("\tCurrent title is: " + driver.getTitle());
        Thread.sleep(2000);
        //
        driver.quit();
        System.out.println("\tdone");
    }
}
