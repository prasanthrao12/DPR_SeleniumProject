package com.project.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

    public static  WebDriver createDriver(String browserType,String URl) 
    {
        WebDriver driver;
        
        switch (browserType.toLowerCase()) {
            case "chrome":
            	System.setProperty("webdriver.chrome.driver", "D:\\Myspace\\DPRSeleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
      driver.get(URl);
       return driver; 
    }
    
    public static WebDriver getDriver() {
    	WebDriver driver;
    	System.setProperty("webdriver.chrome.driver", "D:\\Myspace\\DPRSeleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    	
		return driver;
    	
    }
}
