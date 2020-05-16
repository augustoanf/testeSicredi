package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features",
	plugin = { "pretty", "html:target/htmlreports" },
	glue= {"seleniumgluecode"}
)

public class TesteGUI {

}