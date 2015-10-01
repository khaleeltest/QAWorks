package com.qaworks.test.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverWrapper {
	
	private final static Logger LOGGER = Logger.getLogger(DriverWrapper.class);

    public WebDriver getWebDriver() {
        String browser = System.getProperty("browser","firefox");

        if (browser == null) {
            LOGGER.error(" Browser is not initizated.. calling default browser");
            return new FirefoxDriver();

        }	
        if (BrowserFactory.FIREFOX.getDriverType().equalsIgnoreCase(browser)) {
            return new FirefoxDriver();
        } else if (BrowserFactory.CHROME.getDriverType().equalsIgnoreCase(browser)) {
            return new ChromeDriver();
        } else {
            throw new ContactException(" Browser type is invalid :" + browser);
        	
            
        }
    }



}


