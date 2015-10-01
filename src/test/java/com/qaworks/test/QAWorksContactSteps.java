package com.qaworks.test;

import java.util.Map;

import com.qaworks.test.common.Browser;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qaworks.test.pages.ContactUsPage;
import com.qaworks.test.pages.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QAWorksContactSteps {


    WebDriver driver;
    HomePage homepage;
    ContactUsPage contactuspage;

    @Before
    public void setup() {
        driver = Browser.INSTANCE.getWebDriverInstance();
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void tearDown(){
       driver.quit();
    }


    @Given("^I am on the QAWorks Site$")
    public void Iam_on_QAWorks_Page() throws Throwable {
        homepage.launchQAWorks();
        assertTrue(homepage.isHomePage());
    }

    @When("^I navigate to Contact us page$")
    public void I_navigate_to_Contact_us_page() throws Throwable {
        contactuspage = homepage.navigateContactUsPage();
        assertTrue(contactuspage.isContactUsPage());

    }

    @And("^I should be able to contact QAWorks with the following information$")
    public void I_should_be_able_to_contact_QAWorks(Map<String, String> contactUsMap) throws Throwable {
        contactuspage.inputName(contactUsMap.get("name"));
        contactuspage.inputEmail(contactUsMap.get("email"));
        contactuspage.inputMessage(contactUsMap.get("message"));
         contactuspage.andClickSend();
    }

    @Then("^I should see a confirmation message sent$")
    public void I_should_see_confirmation_message_sent() throws Throwable {

    }

    @And("^I submit the blank form$")
    public void I_submit_the_blank_form() throws Throwable {
        contactuspage.andClickSend();
    }

    @Then("^I should be able to see the corresponding error messages$")
    public void I_should_be_able_to_see_the_corresponding_error_messages(Map<String, String> contactUsMap) throws Throwable {
        assertEquals(contactuspage.nameInputBoxErrorMessage.getText(),contactUsMap.get("name"));
        assertEquals(contactuspage.emailBlankErrorMessage.getText(),contactUsMap.get("email"));
        assertEquals(contactuspage.messageInputBoxErrorMessage.getText(), contactUsMap.get("message"));
    }

    @And("^I fill invalid email (.+) in the form$")
    public void I_fill_invalid_email_invalidemail_com_in_the_form(String invalidEmailId) throws Throwable {
        contactuspage.inputName("name");
        contactuspage.inputEmail(invalidEmailId);
        contactuspage.inputMessage("");

    }

    @Then("^I should be able to see the error message as (.+)$")
    public void I_should_be_able_to_see_the_error_message_as_Invalid_Email_Address(String errorMessage) throws Throwable {
        assertEquals(contactuspage.emailInvalidErrorMessage.getText(),errorMessage);

    }
}
