package runnerPage;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "Feature",
		glue = "stepsPage",
		tags = "@screenshot",
		plugin= {"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"}
		
		)


public class RunnerEngvid extends AbstractTestNGCucumberTests {
	

}
