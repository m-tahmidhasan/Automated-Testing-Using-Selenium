package com.sqt.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    protected static final String BASE_URL = "http://localhost:8080"; // <-- change to your app URL
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        // options.addArguments("--headless=new"); // optional headless if needed
        driver.set(new ChromeDriver(options));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }

    protected WebDriver getDriver() {
        return driver.get();
    }

    protected String url(String path) {
        if (path == null || path.isEmpty()) return BASE_URL;
        if (path.startsWith("http")) return path;
        return BASE_URL + (path.startsWith("/") ? path : "/" + path);
    }
}
