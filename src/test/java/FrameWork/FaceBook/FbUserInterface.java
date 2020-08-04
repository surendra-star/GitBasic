package FrameWork.FaceBook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resourses.base;

public class FbUserInterface extends base{

	public WebDriver driver;
@BeforeTest
public void Intialize() throws IOException
{
	 driver= BrowserIntializer();
	 driver.get(prop.getProperty("url"));

}
	
	@Test(dataProvider="getData")
	public void base(String email,String password) throws IOException  
	{
		
		
	    
	      
		FbHomePage hp=new FbHomePage(driver);
        //Assert.assertEquals("facebook", "FaceBook");hp.getTitle().getText();
		hp.emailid().sendKeys(email);
		hp.password().sendKeys(password);
		hp.getlogin().click();
		
		
	}
	@Test
	public void getLogo()
	{
	UserHomePage up=new UserHomePage(driver);
	System.out.println(up.getlogo().getText());
	System.out.println(up.linksCount().size());
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		
		data[0][0]="sugmail.com";		
		data[0][1]="surenuma";
		return data;
	}
	
	
	
	
	
	}	
	
	

