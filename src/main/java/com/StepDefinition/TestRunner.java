package com.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features",glue="com.StepDefinition",plugin= {"html:target","rerun:src/main/resources/failed.txt"}
                  ,dryRun=false ,tags= {"@sanity"})
public class TestRunner {


	
	
}
