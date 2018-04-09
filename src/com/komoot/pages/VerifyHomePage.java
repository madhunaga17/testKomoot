package com.komoot.pages;

import io.appium.java_client.pagefactory.AndroidBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.komoot.base.DriverPag;

public class VerifyHomePage extends DriverPag {
	

	
	String eTTText = "Find your perfect Tour";
	
        @AndroidBy(id = "de.komoot.android:id/jka_v2_proceed_with_facebook_fragment")
        public WebElement clickFacebook;

        @FindBy(xpath="//android.widget.TextView[@text='Find your perfect Tour']")
        public WebElement textHomePage;
        

        public void clickFacebookButon()
    	{
    		clickFacebook.click();
    		
    	}
        
        public void verifyHomePageText(String eTTText){
    		String aTTText=textHomePage.getText();
    		System.out.println(aTTText);
    		Assert.assertEquals(aTTText, eTTText);
    	}
	
}
