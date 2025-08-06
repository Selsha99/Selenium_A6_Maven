package Assignment;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_Assignment {
	@Test
	public void login() throws InterruptedException {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("virat18rcb@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("virat@rcb");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		String Screenshot = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/Demo_loginPage_"+timestamp+".html");
		ExtentReports eReport = new ExtentReports();
		eReport.attachReporter(spark);
		ExtentTest test = eReport.createTest("login");
		test.addScreenCaptureFromBase64String(Screenshot);
		test.log(Status.INFO, "Login Page Displayed");
		eReport.flush();
		
	}
}
