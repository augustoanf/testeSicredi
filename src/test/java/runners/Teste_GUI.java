package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features",
	plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
	glue= {"glue_code"}
)

public class Teste_GUI {
}