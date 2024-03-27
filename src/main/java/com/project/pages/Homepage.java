package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.Js_Executor;
import utilies.LogUtils;

public class Homepage {

	
	public Homepage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	   }
    WebDriver driver;
    Js_Executor executes=new Js_Executor();
    LogUtils log=new LogUtils(); 
    
    @FindBy (xpath="//div/label[text()='Employee Name']/parent::div/following-sibling::div/div/div/input") public  WebElement Employee_Name_Input; 
    @FindBy (xpath="//div/label[text()='Employee Id']/parent::div/following-sibling::div/input")    public  WebElement Employee_Id_Input; 
    @FindBy (xpath="(//form/div/div/div/div)[3]")    public  WebElement Employment_Status_Input; 
    @FindBy (xpath="(//form/div/div/div/div)[4]")    public  WebElement Include_Input; 
    @FindBy (xpath="//div/label[text()='Supervisor Name']/parent::div/following-sibling::div/div/div/input")    public  WebElement Supervisor_Name_Input; 
    @FindBy (xpath="(//form/div/div/div/div)[6]")    public  WebElement Job_Title_Input; 
    @FindBy (xpath="(//form/div/div/div/div)[7]")    public  WebElement Sub_Unit_Input; 
    @FindBy (xpath="//button[text()=' Search ']")    public  WebElement Search_Button; 
    @FindBy (xpath="//ul/li/a/span[text()='PIM']")   public  WebElement PIM_Menu_Option;
    
  
    public void Employee_Informaion_Search_Test(String EmployeeName,String EmpolyeeID,String EmployeeSatus,
    		String Include,String SupervisorName,String JobTitle,String SubUnit) {
    	
    	log.infoLogs("User Enters employee name ");
    	executes.HighLightWebElement(Employee_Name_Input,driver); 
    	Employee_Name_Input.sendKeys(EmployeeName);
    	
    	log.infoLogs("User enters employee id");
    	executes.HighLightWebElement(Employee_Id_Input,driver); 
    	Employee_Id_Input.sendKeys(EmpolyeeID);
    	
    	log.infoLogs("User Enters employee status");
    	executes.HighLightWebElement(Employment_Status_Input,driver); 
    	Employment_Status_Input.sendKeys(EmployeeSatus);
    	
    	log.infoLogs("User Enters include");
    	executes.HighLightWebElement(Include_Input,driver); 
    	Include_Input.sendKeys(Include);
    	
    	log.infoLogs("User Enter supervisor name");
    	executes.HighLightWebElement(Supervisor_Name_Input,driver); 
    	Supervisor_Name_Input.sendKeys(SupervisorName);
    	
    	log.infoLogs("User Enters job title");
    	executes.HighLightWebElement(Job_Title_Input,driver); 
    	Job_Title_Input.sendKeys(JobTitle);
    	
    	log.infoLogs("User Enters sub unit");
    	executes.HighLightWebElement(Sub_Unit_Input,driver); 
    	Sub_Unit_Input.sendKeys(SubUnit);
    	
    	log.infoLogs("User hits search button");
    	executes.HighLightWebElement(Search_Button,driver);
    	Search_Button.click();
    	
    	
    }
    public void SampleTest(String EmployeeName,String EmpolyeeID,String SupervisorName ) 
    {
    	log.infoLogs("User Enters employee name ");
    	executes.HighLightWebElement(Employee_Name_Input,driver); 
    	Employee_Name_Input.sendKeys(EmployeeName);
    	
    	log.infoLogs("User enters employee id");
    	executes.HighLightWebElement(Employee_Id_Input,driver); 
    	Employee_Id_Input.sendKeys(EmpolyeeID);
    	
    	log.infoLogs("User Enter supervisor name");
    	executes.HighLightWebElement(Supervisor_Name_Input,driver); 
    	Supervisor_Name_Input.sendKeys(SupervisorName);
    	
    	log.infoLogs("User hits search button");
    	executes.HighLightWebElement(Search_Button,driver);
    	Search_Button.click();
    }
    
    public void Select_PIM() {
    	log.infoLogs("User hits PIM Menu Option ");
    	executes.HighLightWebElement(PIM_Menu_Option,driver);
    	PIM_Menu_Option.click();
    }
    
    
}
