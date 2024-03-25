package com.project.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.Accessproperties;




public class Loginpage {
	
	

	public Loginpage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
  WebDriver driver;

  @FindBy (xpath="//input[@name='username']")    public  WebElement Username_Input; 
  @FindBy (xpath="//input[@name='password']")    public  WebElement Password_Input;
  @FindBy (xpath="//button[text()=' Login ']")   public  WebElement Login_Button;
   
 
    
   
    public   void Enter_Username() {
    	Username_Input.sendKeys(Accessproperties.GettingValues("UserName"));
    }
    
    public   void Enter_Password() {
    	Password_Input.sendKeys(Accessproperties.GettingValues("Password"));
    }
    
    public   void Hit_Login_Button() {
    	Login_Button.click();
    }
    

}
