package seleniumAutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private String url = "https://opensource-demo.orangehrmlive.com/";
	
	private By User_Name = By.id("txtPassword");
	private   By Password = By.id("btnLogin");
	private   By Login = By.id("btnLogin");
	
	
	
	public LoginPage(WebDriver driver) {
	
    this.driver = driver ;
	}
	
	
	
	public void navigate() {
		driver.navigate().to(url);
	}



	public  Object loginValidUser(String string, String string2) {
		
		
		
		
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public HomePage loginValidUser1(String userName, String password) {
	    driver.findElement(User_Name).sendKeys(userName);
	    driver.findElement(Password).sendKeys(password);
	   driver.findElement(Login).click();
	    return new HomePage();
	  }
	
	
	
	
	

}
