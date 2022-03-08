package MainTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.utility.driverUtility;


public class ActionsMouseOver {
	

	@Test
	public void testMouseAction()
	{
	WebDriver driver=driverUtility.getDriver("chrome");
	driver.manage().window().maximize();
	driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	Actions act=new Actions(driver);
	WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"));
	act.moveToElement(e1).perform();
	WebElement e2=driver.findElement(By.xpath("//span[contains(text(),'Our')]"));
	act.moveToElement(e2).perform();
	WebElement e3=driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"));
	act.moveToElement(e3).click().perform();

	}



	}



