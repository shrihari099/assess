package com.B.pages;

import org.openqa.selenium.By;

import com.A.common.BaseClass;

public class InfosysPage {
	BaseClass call_driverclass=new BaseClass();
	
	private By highlocator=By.
			xpath("//div[text()='High']//following-sibling::div");
	private By Lowlocator=By.
			xpath("//div[text()='Low']//following-sibling::div");

	public String high()  {
		
		return call_driverclass.getDriver().findElement(highlocator).getText();
	}
	public String low()  {
		
		return	call_driverclass.getDriver().findElement(Lowlocator).getText();
	}
}
