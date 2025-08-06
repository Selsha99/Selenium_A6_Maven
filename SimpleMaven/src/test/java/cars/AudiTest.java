package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AudiTest {
	@Test
	public void Launch() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.audi.in/en/");
		Reporter.log("Audi Launched",true);
		
	}
}
