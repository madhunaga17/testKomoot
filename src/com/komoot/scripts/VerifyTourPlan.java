package com.komoot.scripts;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class VerifyTourPlan {

  
    
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
	public void getScreenShot(AppiumDriver<MobileElement> d) throws IOException{
		 DateFormat sdf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		 Date date = new Date();
		 String fileName=sdf.format(date);
		 File des= d.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(des, new File(System.getProperty("user.dir")+"//snap//"+fileName+".png"));
		 
	}
	
    @Test
    public void verifyTourPlan() throws IOException, InterruptedException{
     System.out.println("Tour Plan Started");
	 driver.findElement(By.id("de.komoot.android:id/jka_v2_proceed_with_facebook_fragment")).click();
	 driver.findElement(By.id("de.komoot.android:id/imageViewTabPlanning")).click();
	 
	 //Changing hiking to cycling
	 driver.findElement(By.id("de.komoot.android:id/psfb_selected_sport_name_tv")).click();
	 System.out.println("Current Sports Type Hiking");
	 driver.findElement(By.xpath("//*[@resource-id='de.komoot.android:id/stlivh_container' and @index='1']")).click();
	 System.out.println("Sports type changed to Cycle");
	 String Type = driver.findElement(By.id("de.komoot.android:id/psfb_selected_sport_name_tv")).getText();
	 Assert.assertEquals(Type, "Cycling");
	 
	 //Change fitness type
	 driver.findElement(By.id("de.komoot.android:id/pflfb_title_ttv")).click();
	 System.out.println("Current Fitness Type is In Good Shape");
	 driver.findElement(By.id("de.komoot.android:id/pflfb_fitness_minus_ib")).click();
	 String fitnessType = driver.findElement(By.id("de.komoot.android:id/pflfb_selected_fitness_level_ttv")).getText();
	 Assert.assertEquals(fitnessType, "Average");
	 System.out.println("Fitness Type is Changed to Average");
	
	 //Search Location
	 driver.findElement(By.xpath("//*[@resource-id='de.komoot.android:id/pwb_location_name_tatv' and @text='Current Location']")).click();
	 driver.findElement(By.id("android:id/search_src_text")).sendKeys("Hamburg Airport, Hamburg");
	 driver.findElement(By.xpath("//*[@resource-id='de.komoot.android:id/textview_list_item_label' and @text='Hamburg Airport, Hamburg']")).click();
	 driver.findElement(By.xpath("//*[@resource-id='de.komoot.android:id/pwb_location_name_tatv' and @text='Choose Destination']")).click();
	 driver.findElement(By.id("android:id/search_src_text")).sendKeys("Berlin");
	 driver.findElement(By.xpath("//*[@resource-id='de.komoot.android:id/textview_list_item_label' and @text='Berlin']")).click();
	 WebDriverWait wait = new WebDriverWait(driver, 60);//timeout in Seconds
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("de.komoot.android:id/textview_cta")));
	 getScreenShot(driver);
	 driver.quit();
	 System.out.println("Tour Plan Stopped");
	 
    }
    
 }