package Classes;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BrightIdeas {

	public AppiumDriver<MobileElement> driver;
	public static Logger logger = LogManager.getLogger(BrightIdeas.class);

	By cboMore = By.id("com.beremote.reteam:id/iv_more");
	By btnBrightIdeas = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/android.view.ViewGroup/android.widget.ImageView");
	//	By btnBrightIdeas1 = By.id("com.beremote.reteam:id/tv_title");
	By pbIdeasColor = By.id("com.beremote.reteam:id/radio_blue");
	By txtIdeasInput = By.id("com.beremote.reteam:id/et_message");
	By btnAddMedia = By.id("com.beremote.reteam:id/add_media");
	By btnGoToGallery = By.id("com.beremote.reteam:id/tv_go_to_gallery");
	By selectingMedia = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView[1]");
	By btnPostIdea = By.id("com.beremote.reteam:id/btn_post_celebration");
	By btnClosePopUp = By.id("com.beremote.reteam:id/iv_close");

	public BrightIdeas (AppiumDriver<MobileElement> driver) {

		this.driver = driver;

	}
	public void moreSelection() 
	{
		driver.findElement(cboMore).click();
		logger.info("More icon (+) tapped on the selected Team feed");
		
	}

	public void IdeaSelection ()
	{
		driver.findElement(btnBrightIdeas).click();
		logger.info("Bright Ideas Button Tapped in the selected team");
	}

	public void colorSelection () 
	{
		driver.findElement(pbIdeasColor).click();
		logger.info("sixth Background color tapped on the share an Announcement screen");
	}

	public void IdeaInputField (String ideaInputData)
	{
		driver.findElement(txtIdeasInput).sendKeys("This is a Test Idea Post");
		logger.info("Text entered in the input field for Bright Ideas");
	}

	public void addMedia() 
	{
		driver.findElement(btnAddMedia).click();
		logger.info("Add Media button tapped on the Idea screen");
		driver.findElement(btnGoToGallery).click();
		logger.info("Go To Gallery option tapped on the bottom sheet");
		driver.findElement(selectingMedia).click();
		logger.info("Image is selected from the gallery for Idea attachement");
	}
	public void postIdea ()
	{
		driver.findElement(btnPostIdea).click();
		logger.info("Post Idea in Team button tapped on the Idea screen");
	}

	public void closePopUp() 
	{
		//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(btnClosePopUp).click();
		logger.info("Close icon tapped on the success pop-up for Idea posted");
	}
}