package loginPageTests;

import org.testng.annotations.Test;

import baseTest.BaseTest;

public class Test002 extends BaseTest{
	
	

	@Test
	public void Test02() {
		
		loginpage.validateForgotyourpassword();
		
	}
}
