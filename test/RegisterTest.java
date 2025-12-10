package com.sqt.tests;

import com.sqt.base.BaseTest;
import com.sqt.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test(description = "Verify that a new user can register successfully")
    public void testRegister() {
        RegisterPage register = new RegisterPage(getDriver());
        String registerUrl = url("/register"); // change path if needed
        register.open(registerUrl);

        // You may want to generate a unique email each run to avoid duplicates
        String uniqueEmail = "user" + System.currentTimeMillis() + "@example.com";
        register.enterName("Shoaib Test");
        register.enterEmail(uniqueEmail);
        register.enterPassword("Password123");
        register.enterPhone("01234567890");
        register.clickRegister();

        // Assertion — adjust to your app: usually redirect to login or show success msg
        Assert.assertTrue(getDriver().getCurrentUrl().toLowerCase().contains("login"), "Expected to be on login page after registration");
    }
}
