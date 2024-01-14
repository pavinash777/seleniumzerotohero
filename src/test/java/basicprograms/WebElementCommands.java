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
	public void ClickMethod() throws InterruptedException {
		
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
}
