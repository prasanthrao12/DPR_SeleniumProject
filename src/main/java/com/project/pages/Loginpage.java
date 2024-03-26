package com.project.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.Accessproperties;
import utilies.Js_Executor;
import utilies.LogUtils;




public class Loginpage {
	
	

	public Loginpage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
  WebDriver driver;

  @FindBy (xpath="//input[@name='username']")    public  WebElement Username_Input; 
  @FindBy (xpath="//input[@name='password']")    public  WebElement Password_Input;
  @FindBy (xpath="//button[text()=' Login ']")   public  WebElement Login_Button;
   
  Js_Executor executes=new Js_Executor();
  LogUtils log=new LogUtils(); 
   
    public   void Enter_Username() {
    	log.infoLogs("User Entered username in the username field");
    	executes.HighLightWebElement(Username_Input,driver);
    	Username_Input.sendKeys(Accessproperties.GettingValues("UserName"));
    }
    
    public   void Enter_Password() {
    	log.infoLogs("User Entered password in the Password field");
    	executes.HighLightWebElement(Password_Input,driver);
    	Password_Input.sendKeys(Accessproperties.GettingValues("Password"));
    }
    
    public   void Hit_Login_Button() {
    	log.infoLogs("User hitsthe Login button field");
    	executes.HighLightWebElement(Login_Button,driver);
    	Login_Button.click();
    }
    
    public   void Enter_Username(String username) {
    	log.infoLogs("User Entered username in the username field");
    	executes.HighLightWebElement(Username_Input,driver);
    	Username_Input.sendKeys(username);
    }
    
    public   void Enter_Password(String Password) {
    	log.infoLogs("User Entered password in the Password field");
    	executes.HighLightWebElement(Password_Input,driver);
    	Password_Input.sendKeys(Password);
    }
   
   
    public void Login_Tests(String username,String Password) {
    	Enter_Username(username);
    	Enter_Password(Password);
    	Hit_Login_Button();
    }
}
