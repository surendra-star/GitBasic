package FrameWork.FaceBook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserHomePage {
	
	
	public WebDriver driver;
	
	
	By UserName=By.xpath("//a[@title='Profile'][span]/span[1]");
	By FullName=By.xpath("//div[@id='userNav']");
	
	By logo=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i");
	By LinksCount=By.tagName("a");
	
	
	public UserHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

public WebElement getlogo()
{
	return driver.findElement(logo);
}
	public List<WebElement> linksCount()
	{
		return driver.findElements(LinksCount);
	}

}
