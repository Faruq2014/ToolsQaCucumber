Feature: End to end test

Scenario: Buying a product

Given User open google chrome web browser
And User go to web application
When User want to search for Dress
And User want to buy the first item
And User choose color White
And User choose size Small
And User choose QTY 1
And User add the product to the Cart
And user click on Cart
And User click on Proced to Checkout
And user input firstname Faruq
And user input lastname Molla
And user input country Bangladesh
And user input Street address 4317 S 12th. rd.
And user input Town/City Arlington
And user input State  VA
And user input Phone 5712759835
And user input email abc@gmail.com
And user select on agreed  button
And user click on Place order
Then user will find order confirmation page
And user will find thank you message
And user will find order number

