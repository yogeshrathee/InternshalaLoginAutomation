package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Internshala login page
        driver.get("https://internshala.com/login/student");

        // Wait for the email field to be visible and enter email
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        emailField.sendKeys("");

        // Wait for the password field to be visible and enter password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("");

        // Wait for the login button to be clickable and click it using JavascriptExecutor
        WebElement loginButton = driver.findElement(By.id("login_submit"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", loginButton);

        // Optionally, add necessary waits or checks for successful login
        // For example, wait for a user-specific element or homepage to confirm login

    }
}
