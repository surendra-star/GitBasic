package FrameWork.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resourses.base;

public class FbHomePage extends base {

	public WebDriver driver;
	
	
	By email=By.id("email");
	By password=By.id("pass");
	By submit=By.xpath("//input[@type='submit']");
	By title=By.xpath("//a[@title='Go to Facebook home'][i]");
	
	
	
	public FbHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
	this.driver=driver;
		
	}



	public WebElement emailid()
	{
		return driver.findElement(email);
	
	}
	
	

	public WebElement password()
	{
	 return driver.findElement(password);
	
	}
	
	
	public WebElement getlogin()
	{
		return driver.findElement(submit);
	
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	
	}
	
	
	
	
	
	
	
}
