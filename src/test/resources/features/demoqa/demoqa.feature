
@happyPath
Feature: Check the working of the demoQa site.

@tag1
Scenario: Try to register using the registration form in the site.
Given I am able to launch the demoQa site
When I click on the registration button
	And fill in the demoQa registration form
Then I should be able to submit the form.