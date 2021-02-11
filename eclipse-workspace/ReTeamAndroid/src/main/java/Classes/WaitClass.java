package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WaitClass  {
	
	 AppiumDriver<MobileElement> driver;
	 
	 public WaitClass(AppiumDriver<MobileElement> driver)                   // constructor for driver
		{
			this.driver=driver;
		}
	 
		
		public  AppiumDriver<MobileElement> WaitforelementtobeClickable(String xpath, int time)         // Wait Function 1              
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
	
		
		public  AppiumDriver<MobileElement> WaitforelementToBeSelected(String xpath, int time)         // Wait Function 2           
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		
		public  AppiumDriver<MobileElement> WaitforpresenceOfElementLocated(String xpath, int time)         // Wait Function 3           
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		public  AppiumDriver<MobileElement> WaitforvisibilityOfElementLocated(String xpath, int time)         // Wait Function 4           
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
	
	
		public  AppiumDriver<MobileElement> WaitfortitleIs(String title, int time)         // Wait Function 5          
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.titleIs(title));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		

		public  AppiumDriver<MobileElement> WaitfortitleContains(String title, int time)         // Wait Function 6         
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.titleContains(title));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		
		public  AppiumDriver<MobileElement> WaitforInvisibilityOfElementLocated(String xpath, int time)         // Wait Function 7         
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		
		public  AppiumDriver<MobileElement> WaitfortextToBePresentInElement(String xpath, String Texttobepresent, int time)   // Wait Function 8         
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath), Texttobepresent));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
		
		public  AppiumDriver<MobileElement> WaitforUrlContains(String text, int time)         // Wait Function 9       
		{
			try {
				
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.urlContains(text));
			return this.driver;
			}
			
			catch (Exception e){
				
				System.out.println("Exception while running wait function "+ e.getMessage());
				return this.driver;
			}
		}
		
				
}
