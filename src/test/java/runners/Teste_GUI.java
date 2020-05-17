package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;

import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features",
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/htmlreports/report.html"},
	glue= {"glue_code"}
)

public class Teste_GUI {
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("target/htmlreports/config/report.xml"));
}
}