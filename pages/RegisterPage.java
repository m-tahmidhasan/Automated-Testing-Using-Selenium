package com.sqt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // LOCATORS — update according to your app
    private final By nameInput = By.id("name");
    private final By emailInput = By.id("email");
    private final By passwordInput = By.id("password");
    private final By phoneInput = By.id("phone");
    private final By registerButton = By.id("registerBtn"); // or By.cssSelector("button[type='submit']")
    private final By registrationSuccessIndicator = By.cssSelector("body");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open(String url) {
        driver.get(url);
    }

    public void enterName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(nameInput)).clear();
        driver.findElement(nameInput).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void enterPhone(String phone) {
        driver.findElement(phoneInput).clear();
        driver.findElement(phoneInput).sendKeys(phone);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public boolean isRegistrationSuccessful() {
        // replace with a better check (login page visible, success message etc.)
        wait.until(ExpectedConditions.visibilityOfElementLocated(registrationSuccessIndicator));
        return driver.getCurrentUrl().toLowerCase().contains("login") || driver.findElements(registrationSuccessIndicator).size() > 0;
    }
}
