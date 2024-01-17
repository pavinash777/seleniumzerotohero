package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRadioButtons {

public WebDriver driver;
	
	@BeforeMethod
	public void browserStart() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		// Close the WebDriver instance after all tests are executed
        if (driver != null) {
            driver.quit();
        }
	}
	
	@Test
    public void testMaleRadioButton() {
        // Find and select the male radio button
        WebElement maleRadioButton = driver.findElement(By.id("maleRadioButton"));
        maleRadioButton.click();

        // Verify that the male radio button is selected
        Assert.assertTrue(maleRadioButton.isSelected());

        // Verify that the female radio button is not selected
        WebElement femaleRadioButton = driver.findElement(By.id("femaleRadioButton"));
        Assert.assertFalse(femaleRadioButton.isSelected());
    }

    @Test
    public void testFemaleRadioButton() {
        // Find and select the female radio button
        WebElement femaleRadioButton = driver.findElement(By.id("femaleRadioButton"));
        femaleRadioButton.click();

        // Verify that the female radio button is selected
        Assert.assertTrue(femaleRadioButton.isSelected());

        // Verify that the male radio button is not selected
        WebElement maleRadioButton = driver.findElement(By.id("maleRadioButton"));
        Assert.assertFalse(maleRadioButton.isSelected());
    }

    @Test
    public void testSwitchBetweenMaleAndFemale() {
        // Select male
        WebElement maleRadioButton = driver.findElement(By.id("maleRadioButton"));
        maleRadioButton.click();

        // Select female
        WebElement femaleRadioButton = driver.findElement(By.id("femaleRadioButton"));
        femaleRadioButton.click();

        // Verify that the female radio button is selected
        Assert.assertTrue(femaleRadioButton.isSelected());

        // Verify that the male radio button is not selected
        Assert.assertFalse(maleRadioButton.isSelected());
    }

    @Test
    public void testSubmitWithMaleSelection() {
        // Select male
        WebElement maleRadioButton = driver.findElement(By.id("maleRadioButton"));
        maleRadioButton.click();

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("submitButton"));
        submitButton.click();

        // Verify that the submitted data includes the selected gender as male
        // Add verification logic based on your application's behavior
    }

   
}
