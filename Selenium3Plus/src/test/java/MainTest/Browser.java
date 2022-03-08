package MainTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.utility.driverUtility;
public class Browser {

		public class NewTest2 {
	@Test
	public void openChrome() {
	//System.setProperty("webdriver.chrome.driver", "C:\\My Data\\Software\\Driver Files\\chromedriver.exe");
	WebDriver driver=driverUtility.getDriver("chrome");

	}
	}
	
}
