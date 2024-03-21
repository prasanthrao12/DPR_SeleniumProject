package baseTest;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.driver.BrowserFactory;


public class BaseTest {
	static WebDriver driver= BrowserFactory.createDriver("chrome");
	static BrowserFactory Browser;	
	
	
@BeforeMethod
public static void Setup() 
{
	driver.get("https://www.youtube.com/watch?v=HOf0qkOUSUs&list=PLL34mf651faNP0ISiU3oQFmRQRis-9blX");
}
	
@AfterMethod
public static void Endtest() 
{
	driver.quit();
}

@Test
public static void ts() {
	
}

}
