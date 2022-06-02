$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/anz%20power%20calculator.feature");
formatter.feature({
  "name": "to validate the anz power calculator application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to navigate to power calculator page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user opens google chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_opens_google_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on personal",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_personal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on home loans",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_home_loans()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user mouse hover to calculators and tools",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_mouse_hover_to_calculators_and_tools()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on how much do I borrow section",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_how_much_do_I_borrow_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be navigated to power calculator page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_will_be_navigated_to_power_calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "to check the functionality of power calculator",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "In your details section user selects either single or joint button on application type",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.in_your_details_section_user_selects_either_single_or_joint_button_on_application_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the number of dependants from the dependants drop down",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_choose_the_number_of_dependants_from_the_dependants_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In property you like to buy section user selects the home to live in button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_property_you_like_to_buy_section_user_selects_the_home_to_live_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In your earnings section user enters some amount value in your annual income(before tax) container",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.in_your_earnings_section_user_enters_some_amount_value_in_your_annual_income_before_tax_container()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters som amount value in your annual other income(optional) container",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_som_amount_value_in_your_annual_other_income_optional_container()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In your expenses section user enters some amount in Monthly living expenses container",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_your_expenses_section_user_enters_some_amount_in_Monthly_living_expenses_container()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters some amount in Current home loan monthly repayments section",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_som_amount_in_Current_home_loan_monthly_repayments_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters some amount in Other loan monthly repayments container",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_some_amount_in_Other_loan_monthly_repayments_container()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters some amount in Other monthly commitments container",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_some_amount_in_Other_monthly_commitments_container()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters some amount in Total credit card limits container",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_some_amount_in_Total_credit_card_limits_container()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on How much i could borrow button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_How_much_i_could_borrow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the estimation value should be shown",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_estimation_value_should_be_shown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to click start over button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_need_to_click_start_over_button()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003cassertive\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat org.stepdefinition.StepDefinition.user_need_to_click_start_over_button(StepDefinition.java:146)\r\n\tat ✽.user need to click start over button(file:src/test/resources/anz%20power%20calculator.feature:27)\r\n",
  "status": "failed"
});
});