package com.orangehrm.testsuit;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import com.orangehrm.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactSalesTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void setup(){
        homePage = new HomePage();
    }

    @Test
    public void verifyUserIsAbleToSubmitContactSalesDetails() {
      homePage.clickOnContactSalesButton();
      homePage.enterFirstName("Pratiksha");
      homePage.enterLastName("Patel");
      homePage.enterCompanyName("PBS Limited");
      homePage.selectNumberOfEmployeesFromDropDown("101 - 150");
      homePage.enterPhoneNumber("07495172051");
      homePage.enterJobTitle("Tester");
      homePage.enterEmail("patty_appu@yahoo.co.uk");
      homePage.selectCountryNameFromDropDown("United Kingdom");
      homePage.enterComment("None");
     // Thread.sleep(2000);


      //homePage.clickOnSubmitButton();
    }
}

