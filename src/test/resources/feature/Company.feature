Feature: Testing all company rest service

  Scenario: Get a company details
    Given company details are loaded in db
    When we call rest service with companyId 1
    Then result should be exactly