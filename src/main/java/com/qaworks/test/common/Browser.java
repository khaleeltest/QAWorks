package com.qaworks.test.common;

import org.openqa.selenium.WebDriver;

public enum Browser {
	
	INSTANCE;
	   

    public WebDriver getWebDriverInstance(){
        DriverWrapper driverWrapper = new DriverWrapper();
        return driverWrapper.getWebDriver();
    }

}
