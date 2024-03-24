package baseTest;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import com.project.driver.BrowserFactory;
import utilies.Accessproperties;


public class BaseTest extends BrowserFactory
{
	public WebDriver driver;	
	
	
		
	@BeforeTest
	public void setup()  {
   		
    driver=createDriver("chrome",Accessproperties.GettingValues("Base_URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	
	
	
	@AfterMethod
	public void EndTest() {
		
		driver.quit();
	}
}