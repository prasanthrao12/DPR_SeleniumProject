package baseTest;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.project.driver.BrowserFactory;
import com.project.pages.Loginpage;

import utilies.Accessproperties;


public class BaseTest extends Dataproviders
{
	 public WebDriver driver;	
	 protected Loginpage loginpage;
	 
	 Dataproviders data=new Dataproviders();
	 
	@BeforeMethod()
	public void setup()  {
		
	driver=BrowserFactory.createDriver("chrome",Accessproperties.GettingValues("Base_URL"));	
	
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	loginpage=new Loginpage(driver);
	data.LoginData();
	}
	
	@AfterMethod
	public void EndTest() {
		
		driver.quit();
	}
	
	
	
}