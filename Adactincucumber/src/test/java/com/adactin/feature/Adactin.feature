Feature: Hotel Booking In Adactin Application

Scenario: User Login In The Web Application
Given user Launch the Url in Adactin Web Appliction
When user Enter the Username in Username Field
And user Enter the Password in Password Field
Then user click the Login Button And It Navigate To Search Hotel Page

Scenario: User Search the Hotel in Search Hotel Page
When user Select the Hotel Location in Location dropdown
And user Select the Hotel  in hotel dropdown
And user Select the Roomtype in Room-Type dropdown
And user Select Number Of Rooms  in Number Of Rooms dropdown
And user Enter the Check-In Date  in Check-In Date Field
And user Enter the Check-Out Date  in Check-Out Date Field
And user Select the how many Adults per room in Adults per Room dropdown
And user Select the how many Child per room in Child per Room dropdown
Then user Click the Search Button And It Navigate To Select Hotel Page

Scenario: User Select the Hotel in Select Hotel page
When user Click the Hotel in Hotel name Radio Button
Then user Click the Contine Button And It Navigate to Book A Hotel Page 

Scenario: User Book A Hotel in Book Hotel Page
When user Enter the Firstname in the Firstname Field
And user Enter the Lastname in the Lastname Field
And user Enter the Address in the Address Field
And user Enter the Credit card Number in Credit card Number Field
And user Select the Credit Card Type in Credit Card Type Dropdown
And user Select the Expiry Month and Year in the Expiry Month and Year Dropdown
And user Enter the CVV Number in CVV number Field
Then user Click Book Now Button And It Navigate to Booking Confirmation Page
