package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {
	@Test
	public void createReport() {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		// step 1: create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ExtentReport_"+timestamp+".html");
		
		// step 2: create ExtentReports object
		ExtentReports ereport = new ExtentReports();
		
		// step 3: Attach ExtentSparkReporter to ExtentReports
		ereport.attachReporter(spark);
		
		// step 4: Create ExtentTest object 
		ExtentTest test = ereport.createTest("createReport");
		
		// step 5: Call log(Status, "message")
		test.log(Status.PASS, "Message added into report");
		
		// step 6: call flush()
		ereport.flush();
	}
}
