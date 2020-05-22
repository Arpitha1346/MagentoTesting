

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	
	@Test
	public void positiveCredential()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/");
		
		Welcome w=new Welcome(driver);
		w.clickOnMyaccount();
		
		Login l=new Login(driver);
		l.enterEmail();
		l.enterPass();
		l.clickONLogin();
		
		MyAccount m=new MyAccount(driver);
		m.clickOnLogout();
		
		driver.quit();
	}
}
