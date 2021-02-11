package Classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TopicOfTheDay {
	
	public AppiumDriver<MobileElement> driver;
	public static Logger logger = LogManager.getLogger(TopicOfTheDay.class);
	
	By tvTotd = By.id("com.beremote.reteam:id/tv_totd");
	By tvCreateTopic = By.id("com.beremote.reteam:id/tv_create");
	By etTotd = By.id("com.beremote.reteam:id/et_totd");
	

public TopicOfTheDay (AppiumDriver<MobileElement> driver) {
	this.driver = driver;
}
public void topicFieldSelection () {
	driver.findElement(tvTotd).click();
	logger.info("Topic of the Field is tapped");
}
public void bottomSheetSelection() {
	driver.findElement(tvCreateTopic).click();
	logger.info("Bottom sheet is tapped to select the Create Topic option");
}
public void addTopic(String topicData) {
	driver.findElement(etTotd).sendKeys(topicData);
	logger.info("Text typed for the Topic in the Topic of the Day field");
}
}