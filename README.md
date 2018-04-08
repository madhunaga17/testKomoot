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

### Resources

##### [Sauce Labs Documentation](https://wiki.saucelabs.com/)

##### [TestNG Documentation](http://testng.org/doc/documentation-main.html)

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### [Stack Overflow](http://stackoverflow.com/)
* A great resource to search for issues not explicitly covered by documentation.







