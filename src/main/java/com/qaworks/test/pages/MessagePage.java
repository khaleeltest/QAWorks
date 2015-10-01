package com.qaworks.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagePage {
	
	WebDriver driver;
    WebDriverWait wait;


    @FindBy(id = "")
    WebElement isConfirmationMessage;
    
    public MessagePage(WebDriver driver){
    	
    	this.driver = driver;
    	wait = new WebDriverWait(driver,60);
    }
    
    public boolean checkConformationMessage(){
    	
    	wait.until(ExpectedConditions.visibilityOf(isConfirmationMessage));
    	return isConfirmationMessage.isDisplayed();
    }
    
     

}
