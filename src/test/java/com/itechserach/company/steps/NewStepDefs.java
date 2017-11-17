package com.itechserach.company.steps;

import cucumber.api.java.en.Then;

public class NewStepDefs {
    @Then("^result should be exactly$")
    public void resultShouldBeExactly() throws Throwable {
        System.out.println("---> here then goes");
    }
}
