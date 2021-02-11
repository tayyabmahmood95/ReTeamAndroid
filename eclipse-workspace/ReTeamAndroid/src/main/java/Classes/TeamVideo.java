package Classes;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TeamVideo {
	
	public AppiumDriver<MobileElement> driver;
	public static Logger logger = LogManager.getLogger(TeamVideo.class);
	
	By cboMore = By.id("com.beremote.reteam:id/iv_more");
	By btnTeamVideo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView");
	By btnRecord =  By.id("com.beremote.reteam:id/capture_video");
	By txtTopic = By.id("com.beremote.reteam:id/et_topic");
	By btnShare = By.id("com.beremote.reteam:id/btn_share");
	By btnClosePopUp = By.id("com.beremote.reteam:id/iv_close");

public TeamVideo (AppiumDriver<MobileElement> driver) {
	this.driver = driver;	
}

public void moreSelection() 
{
	driver.findElement(cboMore).click();
	logger.info("More icon (+) tapped on the selected Team feed");
}
public void openTeamVideo() {
	driver.findElement(btnTeamVideo).click();
	logger.info("Team Video option is tapped from the more menu");
}
public void recordVideo() {
	
	driver.findElement(btnRecord).click();
	logger.info("Team Video Record button is tapped on the Video Recording Screen");
	driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	logger.info("Waiting for recording for about 5 seconds");
	driver.findElement(btnRecord).click();
	logger.info("Stop button tapped on the Video Screen to stop Recording");
}
public void addTopic (String inputTopicData) {
	driver.findElement(txtTopic).sendKeys(inputTopicData);
	logger.info("Topic is typed on the Team Video Screen");
}
public void shareVideo () {
	driver.findElement(btnShare).click();
	logger.info("Share button is tapped on the Video Screen to post the video in the Feed");
}
public void closePopUp() 
{
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(btnClosePopUp).click();
	logger.info("Close icon tapped on the success pop-up for Video posted");
}

}