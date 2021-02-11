package Classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TextualPost {

	public AppiumDriver<MobileElement> driver;
	public static Logger logger = LogManager.getLogger(SignOut.class);
	
	By etTextualPost = By.id("com.beremote.reteam:id/et_post");
	By btnSend = By.id("com.beremote.reteam:id/layout_send");

public TextualPost (AppiumDriver<MobileElement> driver) {
	this.driver = driver;
}
public void addText(String TextData)
{
	driver.findElement(etTextualPost).sendKeys(TextData);
	logger.info("Typed text in the Textual Post Field");
	}
public void sendPost()
{
	driver.findElement(btnSend).click();
	logger.info("Tapped the send button to post the status");
}

}