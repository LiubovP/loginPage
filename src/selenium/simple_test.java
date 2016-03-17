package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class simple_test {

static String url = "https://www.ravelry.com";
	
	public static void main(String[] args){

		WebDriver driver = new FirefoxDriver(); 
    	//driver.get(url);
    	
    	login_test(driver,url);
    	//action_test (driver,url);
    	//log_out (driver,url);
    	
    	
}
	
		
	public static void login_test(WebDriver driver, String url){
		
		Selenium_login_test s_loginTest = new Selenium_login_test(driver,url);
		
		s_loginTest.login_correctCredentials(driver);
		s_loginTest.login_nonExistentUser(driver);
		s_loginTest.login_incorrectPasword(driver);
		//s_loginTest.login_incorrectUser(driver);
		//s_loginTest.login_forgotPassword(driver);
		//s_loginTest.login_testRememberMe(driver);
		//s_loginTest.login_logOut(driver);
		
		
		driver.close();
		driver.quit();
		
	}

	
	
	
	//public static void logout_test(WebDriver driver){
		//Selenium selenium = new WebDriverBackedSelenium(driver, url);
		//Selenium_login s_login = new Selenium_login();
	    //s_login.logout(selenium);
	//}

	
	
	
	}
