Feature: my validation on DemoWebShop


Background: Launch the DemoWebShop
Given application is lauched by user  

Scenario: user access to Registration in website
Given user verifies the DemoWebShop website 
And user clicks on SignUp button
When user enters proper information
Then clicks on submit button for Registration button
And clikcs on logout and close the browser
 
Scenario Outline: user access to Login for shopping
Given registered user clicks on Login link
Then he provides valid username "<username>"
And provides valid password "<password>"
Then verifies Login status

Examples: 
		|username|password|
		|lalitha|password123|
		|NamrataS|pass123|
		|snehalg|123456|

Scenario: user access to search item
Given  user types which item he want to buy
Then selects the product from options
And clicks on search button  
Then the item which user selected is displayed	

Scenario: user tries to access for payment without adding anything to cart
Given user does login
Then user searches the item he want to buy
Then user is unable to proceed further 