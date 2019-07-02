package com.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src/main/resources/failed.txt",glue="com.StepDefinition",plugin= {"html:target"}
                  ,tags= {"@sanity"})
public class TestRerun {

}
