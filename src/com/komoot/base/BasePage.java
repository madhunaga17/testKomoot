package com.komoot.base;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BasePage {

        private DesiredCapabilities capabilities = new DesiredCapabilities();
        private static AndroidDriver driver = null;
        //AppiumDriver driver1;
        private String appiumPort;
        private String serverIp;
        
        
        
        @BeforeClass
        public void setup(){
            initDriver();
        }

        public AndroidDriver getDriver() {
            return driver;
        }

        private void initDriver(){
            System.out.println("Inside initDriver method");

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "dc14aaa1");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.1");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
            cap.setCapability(MobileCapabilityType.APP, "E:/Appium/Appium/testKomoot/driver/de.komoot.android-9.6.7-varies-sdk21-vc5032-APK4Fun.com.apk");
            cap.setCapability("appPackage", "de.komoot.android");
            cap.setCapability("appActivity", "de.komoot.android.app.InspirationActivity");
            cap.setCapability("noReset", true);
            String serverUrl = "http://" + "127.0.0.1" + ":" + "4723" + "/wd/hub";


            try
            {
                System.out.println("Argument to driver object : " + serverUrl);
                driver = new AndroidDriver(new URL(serverUrl), capabilities);

            }
            catch (NullPointerException | MalformedURLException ex) {
                throw new RuntimeException("appium driver could not be initialised for device ");
            }
            System.out.println("Driver in initdriver is : "+driver);

        }

        @AfterClass
        public void tearDown(){
        	driver.quit();
        }

    }