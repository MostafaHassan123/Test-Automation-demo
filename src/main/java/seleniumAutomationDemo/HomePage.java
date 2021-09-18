package seleniumAutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private By DashBorad = By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
	private By OrangeLogo = By.xpath("//*[@id=\"branding\"]/a[1]/img");
	  
	
	
	public HomePage() {
		
	    this.driver = driver ;
		}
	
	public boolean isOrangeLogoImageDisplayed() {
		return driver.findElement(OrangeLogo).isDisplayed();
	}

}
