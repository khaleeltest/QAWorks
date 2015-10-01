package com.qaworks.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(linkText = "Contact")
    WebElement contactUs;

    private String qaworksURL = "http://www.qaworks.com";

    public HomePage(WebDriver driver) {
        this.driver = driver;
//        this.wait =  new WebDriverWait(driver,10);
    }

    public void launchQAWorks() {
        driver.get(qaworksURL);
    }

    public ContactUsPage navigateContactUsPage() {
        contactUs.click();
        return PageFactory.initElements(driver, ContactUsPage.class);
    }

    public boolean isHomePage() {
        return this.driver.getTitle().contains("Home Page - QAWorks");
    }


}
