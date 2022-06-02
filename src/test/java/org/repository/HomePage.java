package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);

	}
	@CacheLookup
	@FindBy(xpath="(//a[contains(@class,'primary__nav__trigger ')])[1]")
	private WebElement click_personal;

	@FindBy(xpath = "//span[text()='Home loans']")
	private WebElement click_HomeLoan;

	public WebElement getClick_personal() {
		return click_personal;
	}

	public WebElement getClick_HomeLoan() {
		return click_HomeLoan;
	}

}
