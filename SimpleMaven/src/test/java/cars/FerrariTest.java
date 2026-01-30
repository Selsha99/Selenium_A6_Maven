package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FerrariTest {

	@Test
	public void Launch() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ferrari.com/");
		Reporter.log("Ferrari Launched",true);
		driver.quit();
		
	}


}
