package com.letskodit.learn.testsuit;

import com.letskodit.learn.pages.Homepage;
import com.letskodit.learn.pages.PracticePage;
import com.letskodit.learn.pages.SignUpPage;
import com.letskodit.learn.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase {

    Homepage homepage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void setUp(){
        homepage = new Homepage();
        signUpPage = new SignUpPage();
    }

    @Test
    public void verifyUserIsAbleToSignUpSuccessfully(){
        homepage.clickOnSignUpButton();
        signUpPage.enterFullName("Snehal");
        signUpPage.enterEmailAddress("abcdefg@yahoo.co.uk");
        signUpPage.enterPassword("2810om");
        signUpPage.enterConfirmPassword("2810om");
        signUpPage.clickOnReCaptchaCheckBox();
        signUpPage.clickOnIAgreeToTheTermsAndConditionsCheckBox();
        signUpPage.clickOnSignUpButton();

    }
}
