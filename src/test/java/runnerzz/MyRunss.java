package runnerzz;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="MyFeat", glue="steDefsss", plugin={"pretty","json:target/cucumber.json","html:target/cucumber-htmlreport.html"})
public class MyRunss {

}
