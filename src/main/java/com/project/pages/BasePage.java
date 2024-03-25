package com.project.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	 WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
public  void ImplicityWait(WebElement Element,String Value) {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
	wait.until(ExpectedConditions.visibilityOf(Element)).sendKeys(Value);
}
	
public  void ImplicityWait_for_click(WebElement Element) {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
	wait.until(ExpectedConditions.visibilityOf(Element)).click();
}	

}
