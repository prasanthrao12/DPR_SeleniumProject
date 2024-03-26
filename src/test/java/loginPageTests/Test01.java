package loginPageTests;

import org.testng.annotations.Test;
import baseTest.BaseTest;


public class Test01 extends BaseTest{
	
	
   @Test
   public  void TestLogin() {
	  
	   loginpage.Enter_Username();
	   loginpage.Enter_Password();
	   loginpage.Hit_Login_Button();
	   	   
   }
   
   
	@Test(dataProvider="logintestdata")
	public void LoginTest(String username,String Password) {
		loginpage.Login_Tests(username, Password);
	}
	
}
