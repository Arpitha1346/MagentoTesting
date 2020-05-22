

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	By e=By.id("email");
	By p=By.id("pass");
	By lo=By.id("send2");
	
	public Login(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void enterEmail()
	{
		driver.findElement(e).sendKeys("sharonvictoria0692@gmail.com");
	}
	
	public void enterPass()
	{
		driver.findElement(p).sendKeys("Welcome@12345");
	}
	
	public void clickONLogin()
	{
		driver.findElement(lo).click();
	} 
}
