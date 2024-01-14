package basicprograms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchFireFoxBrowser {

	@Test
	public void lanchFireFoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actTitle="OrangeHRM";
		String expTitle= driver.getTitle();
		
		Assert.assertEquals(expTitle, actTitle, "Title As Expected");
		
		driver.close();
		
	}
}
