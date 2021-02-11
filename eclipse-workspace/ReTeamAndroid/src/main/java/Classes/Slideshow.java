package Classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Slideshow {

	AppiumDriver<MobileElement> driver;
	public static	Logger logger = LogManager.getLogger(Slideshow.class);

	By cboMore = By.id("com.beremote.reteam:id/iv_more");
	By btnSlideshow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView");
	By btnCapture =  By.id("com.beremote.reteam:id/iv_capture");
	By txtTopic = By.id("com.beremote.reteam:id/et_topic");
	By btnShare = By.id("com.beremote.reteam:id/iv_camera_shuffle");


	public Slideshow (AppiumDriver<MobileElement> driver) {

		this.driver = driver;
	}
	public void moreSelection() 
	{
		driver.findElement(cboMore).click();
		logger.info("More icon (+) tapped on the selected Team feed");
	}

	public void openSlideshow () {
		driver.findElement(btnSlideshow).click();
		logger.info("Slideshow option from more menu is tapped");
	}
	public void imageCapture () {

		driver.findElement(btnCapture).click();
		logger.info("Capture button tapped on the slideshow screen");
	}
	public void addTopic(String inputTopicData) { 
		driver.findElement(txtTopic).sendKeys(inputTopicData);
		logger.info("Topic type in the Set Topic field on the slideshow screen");
	}
	public void shareSlideshow () {
		driver.findElement(btnShare).click();
		logger.info("Share button tapped on the slideshow screen");
	}

}