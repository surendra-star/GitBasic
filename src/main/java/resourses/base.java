package resourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver BrowserIntializer() throws IOException
	{
		prop=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\Surendra Kandipati\\Downloads\\eclipse-java-2020-03-R-win32-x86_64\\FaceBook\\src\\main\\java\\resourses\\data.properties");
		
		prop.load(file);
	String browserName=prop.getProperty("browser");
	if(	browserName.equals("chrome"))
	{
		ChromeOptions options=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		driver=new ChromeDriver(options);
		/*if(browserName.contains("chromeheadless"))
		{
			options.addArguments("chromeheadless");
		}
		*/
	}
	else if(browserName.equals("firefox"))
	{
        System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver.exe");
		
		driver = new FirefoxDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
