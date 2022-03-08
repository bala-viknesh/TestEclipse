package MainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.driverUtility;

public class BasicValidation {
	
	@Test
	public void openChrome() {
	//System.setProperty("webdriver.chrome.driver", "C:\\My Data\\Software\\Driver Files\\chromedriver.exe");
	WebDriver driver=driverUtility.getDriver("chrome");
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	String title=driver.getTitle();
	//Assert.assertEquals(title, "Demo Web Shop. Login");
	Assert.assertTrue(title.endsWith("Login"));
	driver.findElement(By.id("Email")).sendKeys("kannan1@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("test1234");
	driver.findElement(By.className("login-button")).click();
	String account=driver.findElement(By.className("account")).getText();
	if(account.equals("kannan1@gmail.com"))
	{
	Assert.assertTrue(true);
	}
	else
	{
	Assert.assertTrue(false);
	}
	}
	}


