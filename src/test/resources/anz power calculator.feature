Feature: to validate the anz power calculator application 

@tag1
Scenario: to navigate to power calculator page 
Given user opens google chrome browser 
When user enters url 
When user clicks on personal 
And user clicks on home loans 
And user mouse hover to calculators and tools 
And user clicks on how much do I borrow section
Then user will be navigated to power calculator page

@tag2
Scenario: to check the functionality of power calculator
Given In your details section user selects either single or joint button on application type
When user choose the number of dependants from the dependants drop down
And In property you like to buy section user selects the home to live in button
Then In your earnings section user enters some amount value in your annual income(before tax) container
And user enters som amount value in your annual other income(optional) container
And In your expenses section user enters some amount in Monthly living expenses container
And user enters some amount in Current home loan monthly repayments section
And user enters some amount in Other loan monthly repayments container
And user enters some amount in Other monthly commitments container
And user enters some amount in Total credit card limits container
Then user clicks on How much i could borrow button
And the estimation value should be shown
Then user need to click start over button 





