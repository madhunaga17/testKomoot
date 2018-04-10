package com.komoot.scripts;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TapElevation {
	
	private static AndroidDriver driver;
	 
	@BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException{
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
    public void tapElevation() throws InterruptedException{
	 System.out.println("Elevation Testcase Started");
	 driver.findElement(By.id("de.komoot.android:id/jka_v2_proceed_with_facebook_fragment")).click();
	 //driver.findElement(By.xpath("//*[@resource-id='de.komoot.android:id/textview_title and @text='Alpine bliss on the long-distance hiking trails in East Tyrol']")).click();
	 //driver.findElement(By.id("de.komoot.android:id/textview_title")).click();
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Alpine bliss on the long-distance hiking trails in East Tyrol\"));").click();
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"SAVE\"));").click();
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().resourceId(\"de.komoot.android:id/touringElevationProfileView\"));").click();
	 driver.findElement(By.id("de.komoot.android:id/sc_subtitle_tv")).click();
	 driver.findElementById("de.komoot.android:id/imagebutton_close").click();
	 driver.quit();
	 System.out.println("Elevation Testcase Stopped");
    }

}
