
@happyPath
Feature: Check the working of the demoQa site.

@tag1
Scenario: Try to register using the registration form in the site.

Given I am able to launch the demoQa site with title:
|title|
|Demoqa \| Just another WordPress site|

When I click on the registration button I get a page with title:
|title|
|Registration \| Demoqa|
	And fill in the demoQa registration form with: 
	|firstName|lastName|martialStatus|hobby  |country  |phoneNumber|userName |password |confirmPassword|
	|Sandipan |Bhatta  |married      |reading|India    |6184130226 |sandy123 |test123  |test123        |
	|Sandipam |Bhatta  |single       |dance	 |Australia|6184131226 |sandy124 |test1234 |test1234       |
	|Sandipaj |Bhatta  |divorced     |reading|Holland  |6184140226 |sandy143 |test1235 |test1235       |
	|Sandipak |Bhatta  |married      |cricket|Iceland  |6184130426 |sandy53  |test1236 |test1236       |
	|Sandipal |Bhatta  |divorced     |reading|India    |6184136226 |sandy1235|test1237 |test1237       |
	
Then I on clicking submit I should get email error messege:
|errorMessege            |
|* This field is required|