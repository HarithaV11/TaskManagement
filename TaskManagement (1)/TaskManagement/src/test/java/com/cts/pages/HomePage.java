package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private static By myAdminLoc=By.xpath("//img[@src='images/administration-button.gif']");
	public static void clickOnMyAccountIcon(WebDriver driver)
	{
		driver.findElement(myAdminLoc).click();
	}


}
