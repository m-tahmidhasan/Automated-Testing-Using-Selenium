package com.sqt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // LOCATORS — update these to match your app
    private final By emailInput = By.id("email");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("loginBtn"); // or By.cssSelector("button[type='submit']")
    private final By loginSuccessIndicator = By.cssSelector("body"); // change to something meaningful

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open(String url) {
        driver.get(url);
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailInput)).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        // replace with a better check (dashboard element, URL contains 'dashboard', etc.)
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginSuccessIndicator));
        return driver.getCurrentUrl().toLowerCase().contains("dashboard") || driver.findElements(loginSuccessIndicator).size() > 0;
    }
}
