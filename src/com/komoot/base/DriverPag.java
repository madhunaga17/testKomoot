package com.komoot.base;
import io.appium.java_client.android.AndroidDriver;

public class DriverPag extends BasePage{

    protected AndroidDriver driver;

    public DriverPag() {
       this.driver = super.getDriver();
    }
}