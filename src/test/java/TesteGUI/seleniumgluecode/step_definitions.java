package TesteGUI.seleniumgluecode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_definitions {
	private String timeValue = "100";

    public static WebDriver driver;
    @Given("^That I want to simulate a savings investment$")
    public void loadPage() throws Throwable {     
    	System.setProperty("webdriver.chrome.driver","./src/webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		String title = "Simulador de Investimento - Poupança";
		String xpath = "//h2[contains(text(),'Simulador de Investimento - Poupança')]";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath),title));
    }
    
    @Then("^I access the simulation form as an associate$")
    public void associateScroll() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,10);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String buttonXpath = "//button[contains(@class,'btn btnAmarelo btnSimular')]";
		String radioXpath = " //input[@type='radio' and @value='paraVoce']";
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(buttonXpath)));
		WebElement radio = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(radioXpath)));
		js.executeScript("arguments[0].scrollIntoView(true);",button);
		radio.click();
	}
	
	@When("^I fill the form with valid values$")
    public void fillValidForm() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement applicationValueField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("valorAplicar")));
		applicationValueField.sendKeys("200000");
		WebElement investmentValueField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("valorInvestir")));
		investmentValueField.sendKeys("10000");
		WebElement timeField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tempo")));
		timeField.sendKeys(timeValue);
	}
	
	@Then("^I click to simulate$")
    public void simulateClick() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,10);
		String buttonXpath = "//button[contains(@class,'btn btnAmarelo btnSimular')]";
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(buttonXpath)));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
	}

	@Then("^I see the simulation result form$")
    public void resultForm() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("blocoResultadoSimulacao")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='"+ timeValue +" meses']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("valor")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("maisOpcoes")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("blocoResultadoSimulacao")));
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//table/*/*/*"), 10));
	}
	
	@When("^I fill the form with invalid values$")
    public void fillInvalidForm() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement applicationValueField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("valorAplicar")));
		applicationValueField.sendKeys("200");
		WebElement investmentValueField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("valorInvestir")));
		investmentValueField.sendKeys("100");
		WebElement timeField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tempo")));
		timeField.sendKeys(timeValue);
	}

	@Then("^I see the invalid values message$")
    public void invalidValuesMessage() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver,10);
    	String test_message = "Valor mínimo de 20.00";
		String xpathApplicationField = "//label[@id='valorAplicar-error']";
		String xpathInvestmentField = "//label[@id='valorInvestir-error']";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathApplicationField),test_message));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathInvestmentField),test_message));
    }
    
    @Then("^I close the browser$")
    public void browser_closure() throws Throwable {
    	driver.quit();
    }
}
