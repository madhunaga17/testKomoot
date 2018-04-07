package com.komoot.scripts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class navigateHomePage {

  
    
    private static AndroidDriver driver;
    
    @BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException
    {
    
     DesiredCapabilities capabilities = new DesiredCapabilities();

     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "dc14aaa1");
     capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.1");
     capabilities.setCapability(MobileCapabilityType.APP, "E:/Appium/Appium/testKomoot/driver/de.komoot.android-9.6.7-varies-sdk21-vc5032-APK4Fun.com.apk");
     capabilities.setCapability("appPackage", "de.komoot.android");
     capabilities.setCapability("appActivity", "de.komoot.android.app.InspirationActivity");
     driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  
    }
    
    @Test
    public void homePage(){
     System.out.println("app lunched");
	 driver.findElement(By.id("de.komoot.android:id/jka_v2_proceed_with_facebook_fragment")).click();
	 String Actualtext = driver.findElement(By.xpath("//android.widget.TextView[@text='Find your perfect Tour']")).getText();
	 Assert.assertEquals(Actualtext, "Find your perfect Tour");
    }
    
    @Test
    public void hike(){
     System.out.println("app lunched");
	 driver.findElement(By.id("de.komoot.android:id/dsrli_image_riv")).click();
	 driver.findElement(By.id("de.komoot.android:id/dtsfbv_selected_sport_name_tv")).getText();
	 driver.findElement(By.id("de.komoot.android:id/dtsfbv_selected_sport_name_tv")).click();
	 driver.findElement(By.id("de.komoot.android:id/stlivh_sport_icon_iv")).click();
	// driver.findElement(By.id("de.komoot.android:id/dtsfbv_selected_sport_name_tv")).getText();
	 String Actualtext = driver.findElement(By.id("de.komoot.android:id/dtsfbv_selected_sport_name_tv")).getText();
	 Assert.assertEquals(Actualtext, "All Sports");
    }
    
    
    
    
    
    
 }