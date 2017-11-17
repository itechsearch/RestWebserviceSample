package com.itechserach.company.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-junit-report/cucumber"},
features = "D:\\TestProjects\\CompanyDetails\\src\\test\\resources\\feature",glue = "com.itechsearch.company.steps")
public class RunCukesTest {
}