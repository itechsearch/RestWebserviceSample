package com.itechsearch.runner.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature")
public class CucumberRunner {
}
*/

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/feature/Company.feature", glue="src\\test\\java\\com\\itechserach\\company\\steps")
public class CucumberRunner {



}