package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        // Loading the web driver for Chrome browser
        WebDriver driver = new ChromeDriver();
        // Launching the browser
        driver.get("http://the-internet.herokuapp.com/login");
        // Maximizing the browser window
        driver.manage().window().maximize();
        // Applying the implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        // Getting the title of the page
        System.out.println(driver.getTitle());
        // Getting the URL of the page
        System.out.println("The Current URL : " + driver.getCurrentUrl());
        // Getting the page source
        System.out.println("The Page Source : " + driver.getPageSource());
        // Locating the Email field and sending the Email value to it
        driver.findElement(By.id("username")).sendKeys("Prime123@gmail.com");
        // Locating the password field and sending the password value to it
        driver.findElement(By.id("password")).sendKeys("Prime123");
        // Closing the browser window
        driver.close();
    }
}
