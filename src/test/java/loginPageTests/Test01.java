package loginPageTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baseTest.BaseTest;
import utilies.Accessproperties;



public class Test01 extends BaseTest{
    
	
	
	
	@Test
	public void LoginTest() {
		
    WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));		
    WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
    WebElement LoginButton=driver.findElement(By.xpath("//button[@type='submit']"));
    
    
    Username.sendKeys(Accessproperties.GettingValues("UserName"));
    password.sendKeys(Accessproperties.GettingValues("Password"));
    LoginButton.click();
    
	}

	
	
}
