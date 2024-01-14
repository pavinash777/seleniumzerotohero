package basicprograms;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void lunchBrowserforGetMethods() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	
	@Test
	public void lanchFireFoxBrowser() {
		
		String actTitle="OrangeHRM";
		String expTitle= driver.getTitle();
		
		Assert.assertEquals(expTitle, actTitle, "Title As Expected");
		
		
		
	}
	
	@Test
	public void getTitle() {
		
		String actTitle="OrangeHRM";
		String expTitle= driver.getTitle();
		
		Assert.assertEquals(expTitle, actTitle, "Title As Expected");
		
		
		
	}
	
	@Test
	public void getCurrentUrl() {
		
		String actUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String expUrl= driver.getCurrentUrl();
		
		Assert.assertEquals(expUrl, actUrl, "Title As Expected");
		
		
		
	}
	
	@Test
	public void getPageSource() {
		
		
		String expPageSource= driver.getPageSource();
		
		System.out.println(expPageSource);
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
}
