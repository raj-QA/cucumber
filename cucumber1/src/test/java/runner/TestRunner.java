package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\JavaPrograms\\cucumber1\\src\\main\\resources\\req.feature", glue = "stepdefination")
public class TestRunner {

}
