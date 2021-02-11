package Classes;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignIn 
{

	public static Logger logger = LogManager.getLogger(SignIn.class);


	public AppiumDriver<MobileElement> driver;

	By txtEmail = By.id("com.beremote.reteam:id/et_email");
	By txtPassword = By.id("com.beremote.reteam:id/et_password");
	By btnSignInClick = By.id("com.beremote.reteam:id/btn_sign_in");
	By lblMyTeams = By.id("com.beremote.reteam:id/tv_title");


	public SignIn (AppiumDriver<MobileElement> driver) 
	{
		this.driver = driver;
	}

	public void emailField(String emailData)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(txtEmail).sendKeys(emailData);
		logger.info("Email type in the email field on the sign-in screen");
	}

	public  void passwordField (String passwordData)
	{
		//password value
		driver.findElement(txtPassword).sendKeys(passwordData);
		logger.info("Password typed in the password field on the sign-in screen");
	}

	public void signInClick() 
	{
		//Sign in button click 
		driver.findElement(btnSignInClick).click();
		logger.info("Sign In button tapped on the sign-in screen");
	}

	public void signInValidation() 
	{

		String text= driver.findElement(lblMyTeams).getText();
		String expectedText = "My Teams";
		if (text.equals(expectedText))
		{
			System.out.println("User is successfully Signed in");
		} 
		else
		{
			System.out.println("User wasn't able to Sign in");
		}

		Assert.assertEquals(text,expectedText);
		logger.info("Text verified for the login confirmation");
	}




}
