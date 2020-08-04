package resourses;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	
	
	static ExtentReports extent;
	public ExtentReports ExtentReporter() {
		
	String path=System.getProperty("user.dir")+"\\reports\\index.html";
		
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	
	reporter.config().setReportName("Web Test Results");
	reporter.config().setDocumentTitle("Test Recults");
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Surendra");
	return extent;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
