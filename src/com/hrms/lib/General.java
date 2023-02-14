package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import com.hrms.utility.Log;


public class General extends Global{
	//To provide all re-usable fun: of whole application
	public void openApplication() {
	System.setProperty("Webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened"); //console
	Reporter.log("Application opened"); //html report
	Log.info("Application opened"); //logfile
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application Closed");	}
	public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	Log.info("Login completed");
	}
	public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	//System.out.println("logout completed");
	System.out.println("logout completed");
	Log.info("logout completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into frame");
		Log.info("Entered into frame");
		}
		public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from frame");
		}
		public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("new Emp Added");
		Log.info("new Emp Added");
	}
}