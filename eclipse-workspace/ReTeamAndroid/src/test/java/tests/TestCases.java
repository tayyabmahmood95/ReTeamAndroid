package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Classes.BrightIdeas;
import Classes.SignIn;
import Classes.SignOut;
import Classes.Slideshow;
import Classes.TeamVideo;
import Classes.TextualPost;
import Classes.TopicOfTheDay;
import Classes.WallOfFame;


public class TestCases extends BaseClass {




	@Test(priority=1)
	@Parameters({ "emailField", "passwordField" })
	public void TestSignIn( String emailField, String passwordField) 
	{
		SignIn objSignIn = new SignIn (driver);
		objSignIn.emailField(emailField);
		objSignIn.passwordField(passwordField);
		objSignIn.signInClick();
		objSignIn.signInValidation();
	}


	@Test(priority=2)
	@Parameters({ "wallInputField"})
	public void TestWallOfFame(String wallInputField) 
	{
		WallOfFame objWall = new WallOfFame (driver);
		objWall.teamSelection();
		objWall.moreSelection();
		objWall.wallSelection();
		objWall.colorSelection();
		objWall.wallInputField(wallInputField);
		objWall.addMedia();
		objWall.tagMemberSelection();
		objWall.postAnnouncement();
		objWall.closePopUp();

	}

	@Test(priority=3)
	@Parameters({ "ideaInputField"})
	public void TestBrightIdea(String ideaInputField)
	{
		BrightIdeas objIdea = new BrightIdeas(driver);
		objIdea.moreSelection();
		objIdea.IdeaSelection();
		objIdea.colorSelection();
		objIdea.IdeaInputField(ideaInputField);
		objIdea.addMedia();
		objIdea.postIdea();
		objIdea.closePopUp();

	}

	@Test(priority=4)
	@Parameters({"slideshowTopic"})
	public void TestSlideshow (String slideshowTopic) 
	{
		Slideshow objSlideshow = new Slideshow(driver);
		objSlideshow.moreSelection();
		objSlideshow.openSlideshow();
		objSlideshow.imageCapture();
		objSlideshow.addTopic(slideshowTopic);
		objSlideshow.shareSlideshow();

	}
	@Test(priority=5)
	@Parameters({"videoTopic"})
	public void TestTeamVideo(String videoTopic) {
		TeamVideo objVideo = new TeamVideo(driver);
		objVideo.moreSelection();
		objVideo.openTeamVideo();
		objVideo.recordVideo();
		objVideo.addTopic(videoTopic);
		objVideo.shareVideo();
		objVideo.closePopUp();
	}
	
	@Test(priority=6)
	@Parameters({"textPostInput"})
	public void TestTextualPost(String textPostInput)
	{
		TextualPost objTPost = new TextualPost(driver);
		objTPost.addText(textPostInput);
		objTPost.sendPost();
	}
	
	@Test(priority=7)
	@Parameters({"topicValue"})
	public void TestTopicOfTheDay(String topicValue) {
		TopicOfTheDay objTopic = new TopicOfTheDay(driver);
		objTopic.topicFieldSelection();
		objTopic.bottomSheetSelection();
		objTopic.addTopic(topicValue);
	}
	
	@Test(priority=8)
	public void TestSignOut()
	{
		SignOut objSignOut = new SignOut(driver);
		objSignOut.tapBack();
		objSignOut.DrawerTap();
		objSignOut.SignOutTap();
		objSignOut.Alert();
	}


}




