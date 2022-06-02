package org.stepdefinition;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.repository.HomeLoansPage;
import org.repository.HomePage;
import org.repository.PowerCalcPage;
import org.resources.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	HomePage p1;
	HomeLoansPage p2;
	PowerCalcPage p3;
	
	@Given("user opens google chrome browser")
	public void user_opens_google_chrome_browser() {
		launchBrowser();
	}

	@When("user enters url")
	public void user_enters_url() {
		launchUrl("https://www.anz.com.au/");
		maxWindow();
		impWait();
	}

	@When("user clicks on personal")
	public void user_clicks_on_personal() {
		 p1 = new HomePage();
		jclick(p1.getClick_personal());
	}

	@When("user clicks on home loans")
	public void user_clicks_on_home_loans() {
		impWait();
		WebElement homeLoan = p1.getClick_HomeLoan();
		moveToElement(homeLoan).click().perform();
		
	}

	@When("user mouse hover to calculators and tools")
	public void user_mouse_hover_to_calculators_and_tools() {
		 p2 = new HomeLoansPage();
		 WebElement calculatorandTools = p2.getMove_CalculatorandTools();
		 moveToElement(calculatorandTools);
	}

	@When("user clicks on how much do I borrow section")
	public void user_clicks_on_how_much_do_I_borrow_section() {
		impWait();
		p2.getClick_HowMuchCouldIBorrow().click();
	}
	
	
	@Then("user will be navigated to power calculator page")
	public void user_will_be_navigated_to_power_calculator_page() {
		String currentUrl = getCurrentUrl();
		Assert.assertEquals("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/", currentUrl);

	}

	@Given("In your details section user selects either single or joint button on application type")
	public void in_your_details_section_user_selects_either_single_or_joint_button_on_application_type() {
		 p3 = new PowerCalcPage();
		 p3.getBtnSingle().click();
	}

	@When("user choose the number of dependants from the dependants drop down")
	public void user_choose_the_number_of_dependants_from_the_dependants_drop_down() {
		Select select = new Select(p3.getNumberOfDependants());
		select.selectByIndex(0);
	}

	@When("In property you like to buy section user selects the home to live in button")
	public void in_property_you_like_to_buy_section_user_selects_the_home_to_live_in_button() {
		p3.getHomeToLiveInBtn().click();
	}

	@Then("In your earnings section user enters some amount value in your annual income\\(before tax) container")
	public void in_your_earnings_section_user_enters_some_amount_value_in_your_annual_income_before_tax_container() {
		WebElement sel = myTagName("select");
		goDown(sel);
		p3.getAnnualIncome().sendKeys("80000");
	}

	@Then("user enters som amount value in your annual other income\\(optional) container")
	public void user_enters_som_amount_value_in_your_annual_other_income_optional_container() {
		p3.getOtherIncome().sendKeys("10000");
	}

	@Then("In your expenses section user enters some amount in Monthly living expenses container")
	public void in_your_expenses_section_user_enters_some_amount_in_Monthly_living_expenses_container() {
		p3.getMonthlyLivingExpenses().sendKeys("500");
	}

	@Then("user enters some amount in Current home loan monthly repayments section")
	public void user_enters_som_amount_in_Current_home_loan_monthly_repayments_section() {
		p3.getCurrentHomeLoanMonthlyRepayments().sendKeys("0");
	}

	@Then("user enters some amount in Other loan monthly repayments container")
	public void user_enters_some_amount_in_Other_loan_monthly_repayments_container() {
		p3.getOtherLoanMonthlyRepayments().sendKeys("100");
	}

	@Then("user enters some amount in Other monthly commitments container")
	public void user_enters_some_amount_in_Other_monthly_commitments_container() {
		p3.getOtherMonthlyCommitments().sendKeys("0");
	}

	@Then("user enters some amount in Total credit card limits container")
	public void user_enters_some_amount_in_Total_credit_card_limits_container() {
		p3.getTotalCreditCardLimits().sendKeys("10000");
	}

	@Then("user clicks on How much i could borrow button")
	public void user_clicks_on_How_much_i_could_borrow_button() {
		p3.getWorkOutHowMuchICouldBorrowBtn().click();
	}
	
	@Then("the estimation value should be shown")
	public void the_estimation_value_should_be_shown() throws IOException, InterruptedException {
		WebElement genValue = myXpath("//span[@class='borrow__result__text__amount homeloan__borrow__text']");
		String value = genValue.getAttribute("value");
		ss("FinalShot");
		Thread.sleep(3000);
		//Assert.assertEquals("$528,000", value);
		
	}
	
	
	
	@Then("user need to click start over button")
	public void user_need_to_click_start_over_button() throws InterruptedException {
	    p3.getStartOverBtn().click();
	    Thread.sleep(3000);
		p3.getMonthlyLivingExpenses().sendKeys("1");
		p3.getWorkOutHowMuchICouldBorrowBtn().click();
		WebElement errorMsg = myXpath("//*[contains(text(),'Based on the details ')]");
		String errAttribute = errorMsg.getAttribute("aria-live");
		Assert.assertEquals("assertive", errAttribute);
		quit();
	}
	
}
