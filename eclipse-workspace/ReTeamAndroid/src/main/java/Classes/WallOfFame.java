package Classes;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WallOfFame 
{

	public AppiumDriver<MobileElement> driver;

	public static Logger logger = LogManager.getLogger(WallOfFame.class);

	By btnTeamSelect = By.id("com.beremote.reteam:id/tv_name");
	By cboMore = By.id("com.beremote.reteam:id/iv_more");
	By btnWallButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]");
	By pbColorSelection = By.id("com.beremote.reteam:id/radio_water");
	By txtFieldSelection = By.id("com.beremote.reteam:id/et_message");
	By btnPostAnnouncement = By.id("com.beremote.reteam:id/btn_post_celebration");
	By btnClosePopUp = By.id("com.beremote.reteam:id/iv_close");
	By btnAddMedia = By.id("com.beremote.reteam:id/add_media");
	By btnGoToGallery = By.id("com.beremote.reteam:id/tv_go_to_gallery");
	By selectingMedia = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView[1]");
	//	By selectingMedia = By.xpath("//android.widget.ImageView 1[@content-desc]");
	By btnSelectingTagMember = By.id("com.beremote.reteam:id/add_member");
	By chkSelectingMember1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
	By chkSelectingMember2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup");
	By btnDoneForList = By.id("com.beremote.reteam:id/action_done");
	By btnCloseList = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.ImageButton");		

	public WallOfFame (AppiumDriver<MobileElement> driver) 
	{
		this.driver = driver;
	}

	public void teamSelection() 
	{
		driver.findElement(btnTeamSelect).click();
		logger.info("First team card tapped on the team listing");
	}

	public void moreSelection() 
	{
		driver.findElement(cboMore).click();
		logger.info("More icon (+) tapped on the selected Team feed");
	}

	public void wallSelection ()
	{
		driver.findElement(btnWallButton).click();
		logger.info("Wall of Fame Button Tapped in the selected team");
	}

	public void colorSelection () 
	{
		driver.findElement(pbColorSelection).click();
		logger.info("Third Background color tapped on the share an Announcement screen");
	}

	public void wallInputField (String wallInputData) 
	{
		driver.findElement(txtFieldSelection).sendKeys(wallInputData);
		logger.info("Text entered in the input field for Wall of Fame");
	}

	public void addMedia() 
	{
		driver.findElement(btnAddMedia).click();
		logger.info("Add Media button tapped on the announcement screen");
		driver.findElement(btnGoToGallery).click();
		logger.info("Go To Gallery option tapped on the bottom sheet");
		driver.findElement(selectingMedia).click();
		logger.info("Image is selected from the gallery for announcement attachement");
	}

	public void tagMemberSelection() 
	{
		driver.findElement(btnSelectingTagMember).click();
		logger.info("Tag Member option tapped on the announcement screen");
		driver.findElement(chkSelectingMember1).click();
		logger.info("Position 1 tapped on the member selection listing"); 
	
		driver.findElement(chkSelectingMember2).click();
		logger.info("Position 2 tapped on the member selection listing");
		driver.findElement(btnDoneForList).click();
		logger.info("Done button tapped on the Member selection List");

	}

	public void postAnnouncement ()
	{
		driver.findElement(btnPostAnnouncement).click();
		logger.info("Post Announcement in Team button tapped on the Announcement screen");
	}

	public void closePopUp() 
	{
		//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(btnClosePopUp).click();
		logger.info("Close icon tapped on the success pop-up for announcement posted");
	}


}
