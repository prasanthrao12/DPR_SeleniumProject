package loginPageTests;

import java.time.Duration;

import org.testng.annotations.Test;

import baseTest.BaseTest;

public class EmployeeSearchTest extends BaseTest {

	
	
	@Test(dataProvider="EmployeeInformation_TestData01")
	public void employeeSeachTest(String EmployeeName,String EmpolyeeID,String SupervisorName){
		   loginpage.Enter_Username();
		   loginpage.Enter_Password();
		   loginpage.Hit_Login_Button();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		   homepage.Select_PIM();
		   
		  homepage.SampleTest(EmployeeName, SupervisorName, EmpolyeeID);		   
	}
}
