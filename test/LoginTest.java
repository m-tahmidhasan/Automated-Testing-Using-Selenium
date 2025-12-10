package com.sqt.tests;

import com.sqt.base.BaseTest;
import com.sqt.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Verify that an existing user can login and reach dashboard")
    public void testLogin() {
        LoginPage login = new LoginPage(getDriver());
        String loginUrl = url("/login"); // change path if needed
        login.open(loginUrl);

        // Replace with valid credentials for your app or test data
        String testEmail = "testuser@example.com";
        String testPassword = "Password123";

        login.enterEmail(testEmail);
        login.enterPassword(testPassword);
        login.clickLogin();

        // Assertion — adjust to your app's success condition
        Assert.assertTrue(getDriver().getCurrentUrl().toLowerCase().contains("dashboard"), "Expected to be on dashboard after login");
    }
}
