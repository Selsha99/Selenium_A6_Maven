package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BenzTest {

	@Test
	public void Launch() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mercedes-benz.co.in/");
		Reporter.log("Benz Launched",true);
		driver.quit();
		
	}


}
