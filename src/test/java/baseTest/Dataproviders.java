package baseTest;

import org.testng.annotations.DataProvider;

public class Dataproviders {
	
	@DataProvider(name="logintestdata")
	public Object LoginData() {
		Object[][] data=new Object[2][2];
		data[0][0]="Admin";
		data[1][0]="admin12";
		data[0][1]="admin";
		data[1][1]="Admin123";
		return data;
		
	}
	
	
	
	   
   @DataProvider(name="EmployeeInformation_TestData01")
   public Object Employee_Information01() {
		
		
	   
     return new Object[][] {{"Prasanth","ramesh","143"}};
		
	}
   

}
