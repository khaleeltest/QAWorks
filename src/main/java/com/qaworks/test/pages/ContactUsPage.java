package com.qaworks.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
public class ContactUsPage {
	
	WebDriver driver;
    WebDriverWait wait;
    
    @FindBy(css = "#ctl00_MainContent_NameBox")
    WebElement nameInputBox;
    
    @FindBy(css = "#ctl00_MainContent_MessageBox")
    WebElement messageInputBox;
    
    @FindBy(css = "#ctl00_MainContent_EmailBox")
    WebElement emailInputBox;
    
    @FindBy(css = "#ctl00_MainContent_SendButton")
    WebElement sendBtn;

    @FindBy(css = "#ctl00_MainContent_rfvName")
    public WebElement nameInputBoxErrorMessage;

    @FindBy(css = "#ctl00_MainContent_rfvEmailAddress")
    public WebElement emailBlankErrorMessage;

    @FindBy(css = "#ctl00_MainContent_revEmailAddress")
    public WebElement emailInvalidErrorMessage;

    @FindBy(css = "#ctl00_MainContent_rfvMessage")
    public WebElement messageInputBoxErrorMessage;


    public ContactUsPage(WebDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver,10);
    }
    
    public ContactUsPage inputName(String name){
    	nameInputBox.sendKeys(name);
    	return this;
    }

    public ContactUsPage inputEmail(String email){
    	emailInputBox.sendKeys(email);
    	return this;
    }
    
    public ContactUsPage inputMessage(String message){
    	messageInputBox.sendKeys(message);
    	return this;
    }
 
    public MessagePage andClickSend(){
    	sendBtn.click();
    	return PageFactory.initElements(driver,MessagePage.class);
    }
    
    public boolean isContactUsPage(){
    	return this.driver.getTitle().contains("Contact Us - QAWorks");
    }

 }



