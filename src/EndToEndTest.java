package com.sqt.tests;

import com.sqt.base.BaseTest;
import com.sqt.pages.LoginPage;
import com.sqt.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

    @Test(description = "Register a new user then login with the same credentials")
    public void testRegisterThenLogin() {
        RegisterPage register = new RegisterPage(getDriver());
        LoginPage login = new LoginPage(getDriver());

        String registerUrl = url("/register"); // adjust path
        String loginUrl = url("/login");

        // Register
        register.open(registerUrl);
        String email = "e2e" + System.currentTimeMillis() + "@example.com";
        String password = "Password123";
        register.enterName("E2E User");
        register.enterEmail(email);
        register.enterPassword(password);
        register.enterPhone("01234567890");
        register.clickRegister();

        // Usually redirect to login
        login.open(loginUrl);
        login.enterEmail(email);
        login.enterPassword(password);
        login.clickLogin();

        // Verify landing on dashboard
        Assert.assertTrue(getDriver().getCurrentUrl().toLowerCase().contains("dashboard"), "After E2E login expected dashboard URL");
    }
}
