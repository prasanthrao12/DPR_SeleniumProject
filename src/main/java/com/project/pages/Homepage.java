package com.project.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    
    /*
     * HOME Page 
     * Below are element present in Homepage. 
     *
     * 
     */
    @FindBy (xpath="//div/label[text()='Employee Name']/parent::div/following-sibling::div/div/div/input")      
    public  WebElement Employee_Name_Input;
    
    @FindBy (xpath="//div/label[text()='Employee Id']/parent::div/following-sibling::div/input")                
    public  WebElement Employee_Id_Input;
    
    @FindBy (xpath="")    
    public  WebElement Employment_Status_Input;
    
    @FindBy (xpath="")    
    public  WebElement Include_Input;
    
    @FindBy (xpath="//div/label[text()='Supervisor Name']/parent::div/following-sibling::div/div/div/input")    
    public  WebElement Supervisor_Name_Input;
    
    @FindBy (xpath="//label[text()='Job Title']/parent::div/following-sibling::div/div/div/div/following-sibling::div/i")    
    public  WebElement Job_Title_Arrow_BTN;
    
    @FindBy (xpath="")    
    public  WebElement Sub_Unit_Input;
    
    @FindBy (xpath="//button[@type='submit']")    
    public  WebElement Search_Button;
    
    @FindBy (xpath="//ul/li/a/span[text()='PIM']")   
    public  WebElement PIM_Menu_Option;
    
    @FindBy (xpath="(//div/i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")    
    public  WebElement Emplotee_status_dropdownarrow;
    
    @FindBy (xpath="(//div[@class='oxd-select-text--after'])[2]")    
    public  WebElement Include_dropdownarrow;
    
    //this method is for Employee_status 
    public void Employee_status_dropdown(String statusvalue) {
    	log.infoLogs("User clicks on dropdown ");
    	executes.HighLightWebElement(Emplotee_status_dropdownarrow,driver); 
    	Emplotee_status_dropdownarrow.click();
    	
    	
    	List<WebElement>elementlist=driver.findElements(By.xpath("//div[@role='listbox']//div"));
    	
    	for(int i=0;i<elementlist.size();i++) 
    	{	
    	String values=	elementlist.get(i).getText();
    	WebElement ele=elementlist.get(i);
         if(values.equalsIgnoreCase(statusvalue)) {
        	 
        	 ele.click();
        	 log.infoLogs("User selected "+statusvalue+" from the dropdown");
         }
    	System.out.println(values);
    	}
    }
    
    public void Include_DropDown(String includes) {
    	
    	
    	log.infoLogs("User hits include dropdown ");
    	executes.HighLightWebElement(Include_dropdownarrow,driver);
    	Include_dropdownarrow.click();
    	List <WebElement>ele=driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div"));
    	for(int i=0;i<ele.size();i++) {
    		
    		String includeoption=ele.get(i).getText();
    		
    		if(includeoption.equalsIgnoreCase(includes)) {
    			ele.get(i).click();
    			log.infoLogs("User selected "+includes+" from the dropdown");
    		}
    		
    	}
    	
    	
    }
    public  void Job_Title_dropdown(String jobtitle) {
    	
    	//driver.navigate().refresh();
    	log.infoLogs("User hits job title arrow  ");
    	//executes.HighLightWebElement(Job_Title_Arrow_BTN,driver); 
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Job_Title_Arrow_BTN));
    	element.click();
    	//Job_Title_Arrow_BTN.click();
    	
    	
    	List<WebElement> ele=driver.findElements(By.xpath("//div[@role='listbox']/div"));
    	 
    	for(int i=0;i<ele.size();i++) {
           String jobtitles=ele.get(i).getText();
           
           System.out.println(jobtitles);
           if(jobtitles.equalsIgnoreCase(jobtitle)) {
        	   
        	   ele.get(i).click();
        	   log.infoLogs("user selected option"+jobtitle+" from dropdown");
           }
           	
    		
    	}
    	
    	
    }
   
    
    public void SampleTest(String EmployeeName,String EmpolyeeID, String SupervisorName,String statusoption2,String Includes,String jobtitle) 
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
    	
    	
   
    	Employee_status_dropdown(statusoption2);
    	
    	Include_DropDown(Includes);
    	
    	Job_Title_dropdown(jobtitle);
    	
    	
    	//log.infoLogs("User hits search button");
    	//executes.HighLightWebElement(Search_Button,driver);
    	//Search_Button.click();
   
    	
    	
    }
    
    public void Select_PIM() {
    	log.infoLogs("User hits PIM Menu Option ");
    	executes.HighLightWebElement(PIM_Menu_Option,driver);
    	PIM_Menu_Option.click();
    }
    
    
}
