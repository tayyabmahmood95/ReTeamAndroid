package tests;

import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;


	@BeforeTest
	public void setup() {

		try {

			DesiredCapabilities caps = new DesiredCapabilities();


			caps.setCapability("deviceName", "Mi A2 Lite");
			caps.setCapability("platformName", "Android");
			caps.setCapability("udid", "f6e196690605");
			caps.setCapability("platformVersion", "10");
			caps.setCapability("autoAcceptAlerts",true);
			caps.setCapability("autoGrantPermissions", true);
			caps.setCapability("autoDismissAlerts", true);
			caps.setCapability("unicodeKeyboard", true);
			caps.setCapability("resetKeyboard", true);


			/*caps.setCapability("deviceName","HUAWEI Y7 Prime 2019");
		caps.setCapability("udid","58KRX19307004176");
		caps.setCapability("platformName","Android");
		caps.setCapability("platformVersion","8.1.0");
		caps.setCapability("autoAcceptAlerts",true);
		caps.setCapability("autoGrantPermissions", true);*/

			caps.setCapability("appPackage", "com.beremote.reteam");
			caps.setCapability("appActivity", "com.beremote.ui.splash.SplashActivity");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, caps);
		} 

		catch(Exception exp){
			System.out.println("Cause is :" +exp.getCause());
			System.out.println("Message is : " +exp.getMessage());
			exp.printStackTrace();

		}

	}





	@AfterTest
	public void teardown () {

		driver.quit();

	}
}
