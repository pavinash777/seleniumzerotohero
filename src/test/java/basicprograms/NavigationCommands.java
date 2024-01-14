package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;

public class NavigationCommands extends Base {
	
	@Test
	public void navigateTo() throws InterruptedException {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
        driver.navigate().forward();
		
		Thread.sleep(2000);
		
        driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		
	}
	
	

}
