package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;

public class WebElementCommands extends Base {

	
	@Test(priority=1)
	public void clearTextBox() {
		
		WebElement ele= driver.findElement(By.name("username"));
		ele.clear();
		
	}
	
	@Test(priority=2)
	public void EnterText() throws InterruptedException {
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		
		username.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
		
		
	}
	
	@Test(priority=3)
	public void clickMethod() throws InterruptedException {
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		username.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		submit.click();
		
		
		Thread.sleep(2000);
		
		String expurl = driver.getCurrentUrl();
		String actUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(actUrl, expurl, "Url as expected");
		
		
		
	}
	
	@Test(priority=4)
	public void isDisplayedMethod() throws InterruptedException {
		
		WebElement username = driver.findElement(By.name("username"));
		System.out.println("Displaye Status: "+username.isDisplayed());
		
		
		WebElement password = driver.findElement(By.name("password"));
		Boolean password_displayed_or_not = password.isDisplayed();
		System.out.println("Display Status: "+password_displayed_or_not);
		
		
		
		
	}
	
	@Test(priority=4)
	public void isEnabledMethod() throws InterruptedException {
		
		WebElement username = driver.findElement(By.name("username"));
		System.out.println("Displaye Status: "+username.isDisplayed());
		System.out.println("Enabled Status: "+ username.isEnabled());
		
		WebElement password = driver.findElement(By.name("password"));
		Boolean password_displayed_or_not = password.isDisplayed();
		Boolean password_enabled_or_not = password.isDisplayed();
		System.out.println("Display Status: "+password_displayed_or_not);
		System.out.println("Display Status: "+password_enabled_or_not);
		
	}
	
	@Test(priority=5)
	public void isSelectedMethod() throws InterruptedException {
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		username.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		submit.click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("My Info")).click();
		
		Thread.sleep(2000);
		
		WebElement male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	
		System.out.println(male.isSelected());
		Thread.sleep(2000);
		male.click();
		Thread.sleep(2000);
		System.out.println(male.isSelected());
		
		WebElement female = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		System.out.println(female.isSelected());
		Thread.sleep(2000);
		female.click();
		Thread.sleep(2000);
		System.out.println(female.isSelected());
	}
	
	@Test(priority=6)
	public void submitMethod() throws InterruptedException {
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		username.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		submit.submit();
		
		
		Thread.sleep(2000);
		
		String expurl = driver.getCurrentUrl();
		String actUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(actUrl, expurl, "Url as expected");

	}
	
	@Test(priority=7)
	public void getTextMethod() throws InterruptedException {
		
		WebElement heading = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/h5"));
		
		String expText = heading.getText();
		String actText = "Login";
		
		Assert.assertEquals(expText, actText, "Text as expected");
		
		
	}
	
	@Test(priority=8)
	public void getCssValueMethod() throws InterruptedException {
		
		
		//WebElement ele = driver.findElement(By.className("orangehrm-login-title"));
		WebElement ele = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/h5"));
		System.out.println(ele.getCssValue("font-weight"));
		System.out.println(ele.getCssValue("font-size"));
		System.out.println(ele.getCssValue("letter-spacing"));
		
		
	}
	
	@Test(priority=9)
	public void getAttributeMethod() throws InterruptedException {
		
		
		//WebElement ele = driver.findElement(By.className("orangehrm-login-title"));
		WebElement ele = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/h5"));
		System.out.println(ele.getAttribute("class"));
		
		WebElement username = driver.findElement(By.name("username"));
		System.out.println(username.getAttribute("class"));
		System.out.println(username.getAttribute("placeholder"));
		
		
	}
	
	
	
	
}
