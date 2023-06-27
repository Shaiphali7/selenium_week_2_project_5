package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {


        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Declared the driver
        WebDriver driver = new ChromeDriver();
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