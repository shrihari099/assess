package com.B.pages;

import org.openqa.selenium.By;

import com.A.common.BaseClass;

public class HomePage {
	BaseClass obj =new BaseClass();
	private By searchlocator=By.id("search-stock-input");
	
	private By inputcompanylocator=By.
			xpath("//span[text()='Infosys Ltd']");

	public void searchinput() {
		obj.getDriver().findElement(searchlocator).sendKeys("Infosys Ltd");
	}
	public void inputcompany() {
		obj.getDriver().findElement(inputcompanylocator).click();
	}
	
}
