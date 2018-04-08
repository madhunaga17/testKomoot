## Java-TestNG-Appium-Android-Komoot

Appium testing on Komoot app

### Environment Setup

1. Global Dependencies
    * Install Java, android studio, Appium, Eclipse(Used Luna),  
    
2. Hardware and Software
    * Samsung S4, Android Version-5.0.1
	* Selenium Version 3.11.0
	* Java
	* Android Studio
	* Appium
	* Eclipse IDE (i have used Luna)
	* To identify elements use uiautomatorviewer.bat

3. Project Dependencies
    * Download completed project and import in eclipse IDE
	* Add all the Jar files to library
	* Install testNG
	* Specify the .APK path in for all the 5 scripts in capabilities.setCapability(MobileCapabilityType.APP,"Specify .apk path");
	* Open Appium
	* Connect mobile device(android)
		* Install Komoot app
		* change the below mentioned fields as per your mobile device
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "dc14aaa1");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.1");
	* Connect device to PC
	* run POM.XML
	* Check the result test-output folder by opening index.html in browser
	* find the screenshot in snap folder

4.  Testcases
	4.1. Verify Home page
		4.1.1. Tap on "CONTINUE WITH FACEBOOK" button
		4.1.2. Verify Home page is displayed
		4.1.3. Close the app
	4.2. Verify Change Sports Type
		4.2.1. Tap on "CONTINUE WITH FACEBOOK" button
		4.2.2. Tap on Sports Type "Hiking" button
		4.2.3. Tap on Sports Type "Hiking" button
		4.2.4. Change Sports Type "All Sports" button
		4.2.5. Verify Sports type changed
		4.2.6. Close the app
	4.3. VerifyTourPlan
		4.3.1. Tap on "CONTINUE WITH FACEBOOK" button
		4.3.2. Tap on "Plan" tab
		4.3.3. Tap on "Hiking"
		4.3.4. Tap on "Cycling" 
		4.3.5. Verify Sports type changed
		4.3.6. Tap on "Fitness Type"
		4.3.7. Tap on "-" icon
		4.3.8. Verify Fitness type changed to "Average"
		4.3.9. Tap on Current Location, Enter the location and Select the Location
		4.3.10. Tap on Choose Destination, Enter the location and Select the Location
		4.3.11. Take Screen shot of the map
		4.3.12. Close the app
	4.4. Verify Elevation Profile
		4.4.1. Tap on "CONTINUE WITH FACEBOOK" button
		4.4.2. Tap on "Alpine bliss on the long-distance hiking trails in East Tyrol" button
		4.4.3. Scroll down to "SAVE" of "Alpine bliss on the long-distance hiking trails in East Tyrol" frame
		4.4.4. Tap on "SAVE" button
		4.4.5. Scroll down to "ELEVATION PROFILE"
		4.4.6. Tap on ELEVATION PROFILE graph
		4.4.7. Tap on "GOT IT" link
		4.4.8. Tap on "X" button on Elevation Profile Frame
		4.3.9. Close the app
	4.5. Change Notification
		4.5.1. Tap on "CONTINUE WITH FACEBOOK" button
		4.5.2. Tap on "Profile" tab
		4.5.3. Tap on "Setting(Gear icon)"
		4.5.4. Tap on "Notifications"
		4.5.5. Tap on "comment/mobile" icon in "When someone comments on my Tour" text frame
		4.5.6. Tap on "comment/mail"  icon in "When someone comments on my Tour" text frame
		4.5.7. Close the app

### Resources

##### [Sauce Labs Documentation](https://wiki.saucelabs.com/)

##### [TestNG Documentation](http://testng.org/doc/documentation-main.html)

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### [Stack Overflow](http://stackoverflow.com/)
* A great resource to search for issues not explicitly covered by documentation.







