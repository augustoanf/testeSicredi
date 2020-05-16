package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_definitions {
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "./src/webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,10);
	}

	@Given("^Quero simular um investimento na poupança no portal do Sicredi$")
	public void loadPage() throws Throwable {
		String titulo = "Simulador de Investimento - Poupança";
		String xpath = "//h2[contains(text(),'Simulador de Investimento - Poupança')]";
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath),titulo));
    }
	
	@Then("^Acesso o formulário de simulação como associado$")
    public void associateScroll() throws Throwable {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String xpathBotao = "//button[contains(@class,'btn btnAmarelo btnSimular')]";
		String xpathAssociado = " //input[@type='radio' and @value='paraVoce']";
		WebElement botao = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathBotao)));
		WebElement opcaoAssociado = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathAssociado)));
		js.executeScript("arguments[0].scrollIntoView(true);",botao);
		opcaoAssociado.click();
	}
	
	@When("^Preencho o formulário com valor válido para o campo \"([^\"]*)\" de \"([^\"]*)\"$")
    public void fillValidForm(String campo, String valor) throws Throwable {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(campo))).sendKeys(valor);
	}
	
	@Then("^Clico para simular$")
    public void simulateClick() throws Throwable {
		String buttonXpath = "//button[contains(@class,'btn btnAmarelo btnSimular')]";
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(buttonXpath)));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
	}

	@Then("^Vejo a tabela com resultados da simulação para \"([^\"]*)\" meses$")
    public void resultForm(String tempo) throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("blocoResultadoSimulacao")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='"+ tempo +" meses']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("valor")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("maisOpcoes")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("blocoResultadoSimulacao")));
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//table/*/*/*"), 10));
	}
	
	@When("^Preencho o formulário com valor inválido para o campo \"([^\"]*)\" de \"([^\"]*)\"$")
    public void fillInvalidForm(String campo, String valor) throws Throwable {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(campo))).sendKeys(valor);
	}

	@Then("^Vejo as mensagens que pedem valor válido$")
    public void invalidValuesMessage() throws Throwable {
    	String test_message = "Valor mínimo de 20.00";
		String xpathApplicationField = "//label[@id='valorAplicar-error']";
		String xpathInvestmentField = "//label[@id='valorInvestir-error']";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathApplicationField),test_message));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathInvestmentField),test_message));
    }
    
    @Then("^Fecho o browser$")
    public void browser_closure() throws Throwable {
    	driver.quit();
	}

	@After
	public void afterScenario() {
		driver.quit();
	}
}
