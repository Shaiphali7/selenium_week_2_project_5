package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowser {
    static String browser = "FireFox";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;


    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wronge browser name");
        }

        //Navigate to the page
        //driver.navigate().to(baseUrl);
        //Open the base url in chrome browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // giving Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Printing the title of page
        System.out.println("Title of the page: " + driver.getTitle());
//Printing the current Url
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        //Printing Source code
        System.out.println("Source code of page: " + driver.getPageSource());
        //Adding the value in Email field
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("123@gmail.com");
        //Adding the value in Password field
        driver.findElement(By.id("user[password]")).sendKeys("1234#");
//Closing the browser
         driver.close();
    }
}
