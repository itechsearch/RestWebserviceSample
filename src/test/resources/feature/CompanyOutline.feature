
Feature: Testing all company rest service


    Scenario Outline: Get a company details with outline
      Given company details are loaded in db
      When we call rest service with companyId <number>
      Then result should be exactly
      Examples:
      |number|
      |1      |
      |2      |
      |3      |



