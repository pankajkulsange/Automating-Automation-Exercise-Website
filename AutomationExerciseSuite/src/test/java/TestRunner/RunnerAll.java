package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Features"},
glue= {"StepDef"},
plugin= {"pretty","html:target/htmlreport.html"})
public class RunnerAll {
	

}
