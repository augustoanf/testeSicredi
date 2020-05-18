package runners;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.module.jsv.*;

public class Teste_API {
	
	@Test
	public void statusCode() {
		System.out.println("-- Caso de teste: Validando o retorno da API com código de status 200. --");
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		Response response = requestSpecification.when()
			.get();
		Assert.assertEquals(200, response.statusCode());
		System.out.println("-- Caso de teste: Fim do teste de código de status 200. --\n");
	}

	@Test
	public void responseFormat() {
		System.out.println("-- Caso de teste: Validando o retorno da API está no formato JSON. --");
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		Response response = requestSpecification.when()
			.get();
		Assert.assertEquals(response.contentType(),"application/json");
		System.out.println("-- Caso de teste: Fim do teste de retorno em JSON. --\n");
	}

	@Test
	public void responseTime() {
		System.out.println("-- Caso de teste: Validando o retorno da API em tempo menor que 5000ms. --");
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		Response response = requestSpecification.when()
			.get();
		Assert.assertTrue("Longer than expected!", (response.getTime() < 5000));
		System.out.println("-- Caso de teste: Fim do teste de retorno em JSON. --\n");
	}

	@Test
	public void responseError() {
		System.out.println("-- Caso de teste: Validando o retorno da API sem erros. --");
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		Response response = requestSpecification.when()
			.get();
		Assert.assertEquals(response.getStatusLine(),"HTTP/1.1 200 OK");
		System.out.println("-- Caso de teste: Fim do teste de retorno da API sem erros. --\n");
	}

	@Test
	public void responseValues() {
		System.out.println("-- Caso de teste: Validando o retorno da API com os valores. --");
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		Response response = requestSpecification.when()
			.get();
		ArrayList<String> meses = new ArrayList<>();
		meses.add("112");
		meses.add("124");
		meses.add("136");
		meses.add("148");
		ArrayList<String> valor = new ArrayList<>();
		valor.add("2.802");
		valor.add("3.174");
		valor.add("3.564");
		valor.add("3.971");
		Assert.assertTrue(response.jsonPath().get("id").equals(1));
		Assert.assertTrue(response.jsonPath().get("meses").equals(meses));
		Assert.assertTrue(response.jsonPath().get("valor").equals(valor));
		System.out.println("-- Caso de teste: Fim do teste de retorno da API com os valores. --\n");
	}

	@Test
	public void validateSchema() {
		System.out.println("-- Caso de teste: Validando o retorno da API com o schema. --");
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		requestSpecification.when().get()
			.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		System.out.println("-- Caso de teste: Fim do teste de retorno da API com o schema. --\n");
	}
}