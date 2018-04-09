package com.komoot.scripts;

import org.testng.annotations.Test;

import com.komoot.base.DriverPag;
import com.komoot.pages.VerifyHomePage;


public class LoginTests extends DriverPag{

@Test    

public void testLogin()
    {
	VerifyHomePage homePage = new VerifyHomePage();
    homePage.clickFacebookButon();
    homePage.verifyHomePageText("Find your perfect Tour");
    }
}