package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest { // Declaring the static elements
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        driver.get("http://the-internet.herokuapp.com/login"); // Launching the browser window
        driver.manage().window().maximize(); // Maximizing the browser window
        // Applying the implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        // Getting the page title
        System.out.println("The Page Title : " + driver.getTitle());
        // Getting the page URL
        System.out.println("The Page Url : " + driver.getCurrentUrl());
        // Getting the page source
        System.out.println("The Page Source : " + driver.getPageSource());
        // Locating the Email element and sending value to it
        driver.findElement(By.id("username")).sendKeys("Prime123@gmail.com");
        // Locating the password field and sending the value to it
        driver.findElement(By.id("password")).sendKeys("Prime123");
        // Closing the browser window
        driver.close();
    }
}
