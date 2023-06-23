package com.swagLabsTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature",glue= {"com.swaglabsStepdef"})
//@CucumberOptions(features= {"features"},glue= {"swagLabsLogin"})
public class SwagLabRun {

}
