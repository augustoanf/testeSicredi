package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features",
	plugin = {"pretty", "html:target/htmlreports"},
	glue= {"stepDefinitions"}
)

public class Teste_GUI {

}