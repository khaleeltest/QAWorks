@Contactus @test
Feature: Contact Us Page
  As an end user
  I want a contact us page
  So that I can find out more about QAWorks exciting services

  Scenario: Valid Submission
    Given I am on the QAWorks Site
    When I navigate to Contact us page
    And I should be able to contact QAWorks with the following information
      | name    | j.Bloggs         6                        |
      | email   | j.Bloggs@qaworks.com                      |
      | message | please contact me I want to find out more |
#    Then I should see a confirmation message sent


  Scenario: Form Validation
    Given I am on the QAWorks Site
    When I navigate to Contact us page
    And I submit the blank form
    Then I should be able to see the corresponding error messages
      | name    | Your name is required        |
      | email   | An Email address is required |
      | message | Please type your message     |


  Scenario: EmailId Validation
    Given I am on the QAWorks Site
    When I navigate to Contact us page
    And I fill invalid email invalid in the form
    Then I should be able to see the error message as Invalid Email Address


