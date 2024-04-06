package loginPageTests;

import org.testng.annotations.Test;

import baseTest.BaseTest;

public class Test002 extends BaseTest{
	
	
/*
 * this is new test cases 
 * 
 */
	
	
	@Test
	public void Test02() {
		
		loginpage.validateForgotyourpassword();
		
	}
	
	@Test
	public void Test2() {
		loginpage.ValidateFieldsIntheLoginpage();
		
	}
}
