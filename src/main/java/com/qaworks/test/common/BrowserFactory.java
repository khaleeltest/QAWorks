package com.qaworks.test.common;

public enum BrowserFactory {
	
	
	FIREFOX("firefox"),
    CHROME("chrome");

    public String driverType;

    private BrowserFactory(String driverType){
        this.driverType = driverType;
    }

    public String getDriverType(){
        return driverType;
    }
}



