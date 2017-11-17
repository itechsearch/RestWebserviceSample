package com.itechserach.company.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;



public class MyStepdefs {

        @When("^we call rest service with companyId (\\d+)$")
        public void getrestService(Integer input) throws Throwable {
            System.out.println("------------->Called when");

        }

    @Given("^company details are loaded in db$")
    public void companyDetailsAreLoadedInDb() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("---> Create given step def");
    }
}

