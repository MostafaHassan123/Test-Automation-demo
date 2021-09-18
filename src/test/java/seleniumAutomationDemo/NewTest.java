package seleniumAutomationDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest {
	private WebDriver driver;
	
	
	
  @Test
  public void TestLogin () {
	 // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  //driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  //driver.findElement(By.id("btnLogin")).click();
	  
	 LoginPage signInPage = new LoginPage(driver);
	 HomePage homePage = signInPage.loginValidUser1("Admin", "admin123");
	 //Assert.assertTrue(homePage.isOrangeLogoImageDisplayed());
		   
	  
  }
  
  
	
  @Test
  public void TestLogin2 () {
	 // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  //driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  //driver.findElement(By.id("btnLogin")).click();
	  
	 LoginPage signInPage = new LoginPage(driver);
	 HomePage homePage = signInPage.loginValidUser1("Admin", "admin123");
	 Assert.assertTrue(homePage.isOrangeLogoImageDisplayed());
		   
	  
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		
  }

  private void to(String string) {
	// TODO Auto-generated method stub
	
}
@AfterMethod
  public void afterMethod() {
	
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver_win32/chromedriver.exe");
	  
  }

}
