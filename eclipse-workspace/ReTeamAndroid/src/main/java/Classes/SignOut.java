package Classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignOut 
{

	public AppiumDriver<MobileElement> driver;

	public static Logger logger = LogManager.getLogger(SignOut.class);

	By btnClickBack = By.id("com.beremote.reteam:id/iv_back");
	By btnDrawer = By.id("com.beremote.reteam:id/iv_drawer");
	By btnLogOut = By.id("com.beremote.reteam:id/iv_logout");
	By btnYesOnAlert = By.id("android:id/button1");

	public SignOut (AppiumDriver<MobileElement> driver) 
	{

		this.driver = driver;
	}

	public void tapBack() 
	{
		driver.findElement(btnClickBack).click();
		logger.info("Back icon tapped tap on the Team Feed");
	}
	public void DrawerTap() 
	{	
		driver.findElement(btnDrawer).click();
		logger.info("Drawer icon tapped on the Home Screen");
	}

	public void SignOutTap () 
	{	
		driver.findElement(btnLogOut).click();
		logger.info("SignOut button tapped from the side drawer");
	}

	public void Alert () 
	{
		driver.findElement(btnYesOnAlert).click();
		logger.info("Yes option tapped on the confirmation alert for sign out");
	}
}
