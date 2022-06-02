package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class PowerCalcPage extends BaseClass {
public PowerCalcPage() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(xpath="(//label[@class='btn'])[1]")
private WebElement btnSingle; 

@FindBy(xpath="(//label[@class='btn'])[2]")
private WebElement btnJoint; 

@FindBy(xpath="//select[@title='Number of dependants']")
private WebElement numberOfDependants; 

@FindBy(xpath="(//label[@class='btn'])[3]")
private WebElement HomeToLiveInBtn;

public WebElement getHomeToLiveInBtn() {
	return HomeToLiveInBtn;
}
@FindBy(xpath="(//label[text()='Your annual income (before tax)']/following::input)[1]")
private WebElement annualIncome; 

@FindBy(xpath="(//label[text()='Your annual other income (optional)']/following::input)[1]")
private WebElement otherIncome; 

@CacheLookup
@FindBy(xpath="(//label[text()='Monthly living expenses ']/following::input)[1]")
private WebElement monthlyLivingExpenses; 

@FindBy(xpath="(//label[text()[normalize-space()='Current home loan monthly repayments']]/following::input)[1]")
private WebElement currentHomeLoanMonthlyRepayments;

@FindBy(xpath="(//label[text()='Other monthly commitments']/following::input)[1]")
private WebElement otherMonthlyCommitments;

@FindBy(xpath="(//label[text()='Other loan monthly repayments']/following::input)[1]")
private WebElement otherLoanMonthlyRepayments;

@FindBy(xpath="//label[text()='Total credit card limits']/following::input")
private WebElement totalCreditCardLimits;

@FindBy(xpath="//button[contains(@class,'btn btn--action')]")
private WebElement workOutHowMuchICouldBorrowBtn;

@FindBy(xpath="(//button[@class='start-over'])[1]")
private WebElement startOverBtn;


public WebElement getStartOverBtn() {
	return startOverBtn;
}

public WebElement getWorkOutHowMuchICouldBorrowBtn() {
	return workOutHowMuchICouldBorrowBtn;
}

public WebElement getOtherLoanMonthlyRepayments() {
	return otherLoanMonthlyRepayments;
}

public WebElement getTotalCreditCardLimits() {
	return totalCreditCardLimits;
}

public WebElement getOtherMonthlyCommitments() {
	return otherMonthlyCommitments;
}

public WebElement getBtnSingle() {
	return btnSingle;
}

public WebElement getBtnJoint() {
	return btnJoint;
}

public WebElement getNumberOfDependants() {
	return numberOfDependants;
}

public WebElement getAnnualIncome() {
	return annualIncome;
}

public WebElement getOtherIncome() {
	return otherIncome;
}

public WebElement getMonthlyLivingExpenses() {
	return monthlyLivingExpenses;
}

public WebElement getCurrentHomeLoanMonthlyRepayments() {
	return currentHomeLoanMonthlyRepayments;
} 





}
