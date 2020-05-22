

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	
	WebDriver driver;    //instance variable access throughout the class
	
	By MyAcct=By.linkText("My Account");
	
	public Welcome(WebDriver driver)    //local variable 
	{
		this.driver=driver;            // local cannot be accessed hence,instance =local variable--->assigning the local variable values to instance variable                               
	}
	
	public void clickOnMyaccount()   //all the loc_values store it in instance variable
	{
		driver.findElement(MyAcct).click();	
	}
}
