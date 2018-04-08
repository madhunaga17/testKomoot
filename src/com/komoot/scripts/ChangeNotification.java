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

public class ChangeNotification {
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
    public void changeNotification() throws InterruptedException{
	     System.out.println("Notification Testcase Started");
	     driver.findElement(By.id("de.komoot.android:id/jka_v2_proceed_with_facebook_fragment")).click();
		 driver.findElement(By.id("de.komoot.android:id/imageViewTabProfile")).click();
		 driver.findElement(By.id("de.komoot.android:id/uihiv_settings_ib")).click();
		 driver.findElement(By.xpath("//*[@resource-id='android:id/title' and @text='Notifications']")).click();
		 driver.findElement(By.xpath("//*[@resource-id='de.komoot.android:id/checkbox_config_new_comment_push' and @index='0']")).click();
		 driver.findElement(By.xpath("//*[@resource-id='de.komoot.android:id/checkbox_config_new_comment_mail' and @index='1']")).click();
		 driver.quit();
		 System.out.println("Notification Testcase Stopped");
    }

}
