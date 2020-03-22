package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private static By UserName=By.xpath("//input[@name='login']");
	private static By Password=By.xpath("//input[@name='password']");
	private static By loginLoc=By.xpath("//input[@name='DoLogin']");
	private static By AdminIcon=By.xpath("//img[@src='images/administration-button.gif']");
	private static By logOut=By.xpath("//a[contains(text(),'Logout')]");
	
	
	//scenario 1
	
	public static void enterUserName(WebDriver driver,String username)
	{
		driver.findElement(UserName).sendKeys(username);
	}
     public static void enterPassword(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     public static void clickOnLogin(WebDriver driver)
     {
    	 driver.findElement(loginLoc).click();
     }
     public static void ClickOnAdminIcon(WebDriver driver)
     {
    	 driver.findElement(AdminIcon).click();
     }
     public static void ClickOnLogOut(WebDriver driver)
     {
    	 driver.findElement(logOut).click();
     }
          
     //scenario 2
     public static void enterInvalidUser(WebDriver driver,String username)
     {
    	 driver.findElement(UserName).sendKeys(username);
     }
     public static void enterValidPass(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     
     
     //scenario 3
     public static void enterValidUserName(WebDriver driver,String username)
     {
    	 driver.findElement(UserName).sendKeys(username);
     }
     public static void enteInvalidPassword(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     
     
     //scenario 4
     public static void enterInValidUserName(WebDriver driver,String username)
     {
    	 driver.findElement(UserName).sendKeys(username);
     }
     public static void enteInvalidPass(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     
     

}
