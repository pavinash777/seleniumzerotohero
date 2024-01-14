package basicprograms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchSafariBrowser {

	@Test
	public void lanchSafariBrowser() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actTitle="OrangeHRM";
		String expTitle= driver.getTitle();
		
		Assert.assertEquals(expTitle, actTitle, "Title As Expected");
		
		driver.close();
	}
}
