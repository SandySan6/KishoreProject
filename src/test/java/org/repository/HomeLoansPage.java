package org.repository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class HomeLoansPage extends BaseClass {
public HomeLoansPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//span[@class='first__heading__text'])[3]")
private WebElement move_CalculatorandTools;

@FindBy(xpath="//a[.='How much could I borrow']")
private WebElement click_HowMuchCouldIBorrow;

public WebElement getMove_CalculatorandTools() {
	return move_CalculatorandTools;
}

public WebElement getClick_HowMuchCouldIBorrow() {
	return click_HowMuchCouldIBorrow;
}

}
