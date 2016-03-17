package selenium;

import java.io.BufferedWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


@SuppressWarnings("deprecation")
public class Selenium_login_test {
	Selenium selenium;
	String url;
	BufferedWriter out;
	
		
		public Selenium_login_test(WebDriver driver, String url) {
		
		driver.get(url);		
		selenium = new WebDriverBackedSelenium(driver, url);
	
		selenium.waitForPageToLoad("30000");
	}

	// login like existent user
	
	public void login_correctCredentials(WebDriver driver) {
			
		String username = "luba" ;
    	String password = "prostoi" ;
		    	  	
    	selenium.type("id=user_login", username);
		selenium.type("id=user_password", password);
		selenium.click("class=clicker");
		selenium.waitForPageToLoad("30000");
		
			if(selenium.isTextPresent("hiya, Luba!")){
			System.out.println (" Pass! Existent User can login. "); 
											
			}
			else{
			System.out.println (" Fail! Existent User can not login. ");	

			}
			
		
		
		//login out
			driver.findElement(By.linkText("logout")).click();
			selenium.waitForPageToLoad("30000");
			//driver.findElement(By.linkText("log in again")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/a")).click();
			selenium.waitForPageToLoad("30000");
		
	}
	
	//login like nonexistent User
	
	public void login_nonExistentUser(WebDriver driver) {		
		
		driver.navigate().refresh();
		selenium.waitForPageToLoad("30000");
		//Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		
		String username = "kuku" ;
    	String password = "qwerty1" ;
	 	  	
    	selenium.type("id=user_login", username);
		selenium.type("id=user_password", password);
		selenium.click("class=clicker");
		selenium.waitForPageToLoad("30000");
						
			if(selenium.isTextPresent("hiya, kuku!")){				
			  System.out.println (" Fail! Nonexistent User can login. ");
			}
			else{
				System.out.println (" Pass! Nonexistent User can not login. "); 
											
			}
					
			
	}
			
	
		public void login_incorrectPasword(WebDriver driver) {
		
		//driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		
		selenium.waitForPageToLoad("30000");
				
		String username = "luba" ;
    	String password = "qwerty1" ;
		    	  	
    	selenium.type("id=user_login", username);
		selenium.type("id=user_password", password);
		selenium.click("class=clicker");
		selenium.waitForPageToLoad("30000");
					
			if(selenium.isTextPresent("Your password is incorrect ")){
			System.out.println (" Pass! User with incorrect credentials can not login. "); 
						
			}
			else{
			System.out.println (" Fail! User with incorrect credentials login. ");
	
			}
		
	}
	
	public void login_incorrectUser(WebDriver driver) 	{

		
	}
	
	
	public void login_forgotPassword(WebDriver driver) {

		
	}
	
	public void login_testRememberMe(WebDriver driver) {

		
	}
	
	public void login_logOut(WebDriver driver){
	
		
}

	
	
	
}


