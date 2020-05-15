package TesteAPI;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.module.jsv.*;

public class TesteAPI {
	
	@Test
	public void statusCode() {
		
		System.out.println("*** Caso de teste: Validando o retorno da API com código de status 200. ***\n");
		
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";

		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		
		Response response = requestSpecification.when()
			.get();

		Assert.assertEquals(200, response.statusCode());
		
		System.out.println("\n*** Caso de teste: Fim do teste de código de status 200.***");
	}

	@Test
	public void responseFormat() {
		
		System.out.println("*** Caso de teste: Validando o retorno da API está no formato JSON. ***\n");
		
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";

		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		
		Response response = requestSpecification.when()
			.get();

		Assert.assertEquals(response.contentType(),"application/json");
		
		System.out.println("\n*** Caso de teste: Fim do teste de retorno em JSON.***");
	}

	@Test
	public void responseTime() {
		
		System.out.println("*** Caso de teste: Validando o retorno da API em tempo menor que 5000ms. ***\n");
		
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";

		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		
		Response response = requestSpecification.when()
			.get();

		Assert.assertTrue("Longer than expected!", (response.getTime() < 5000));
		
		System.out.println("\n*** Caso de teste: Fim do teste de retorno em JSON.***");
	}

	@Test
	public void responseError() {
		
		System.out.println("*** Caso de teste: Validando o retorno da API sem erros. ***\n");
		
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";

		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();
		
		Response response = requestSpecification.when()
			.get();

		Assert.assertEquals(response.getStatusLine(),"HTTP/1.1 200 OK");
		
		System.out.println("\n*** Caso de teste: Fim do teste de retorno da API sem erros.***");
	}

	@Test
	public void responseValues() {
		
		System.out.println("*** Caso de teste: Validando o retorno da API com os valores. ***\n");
		
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
		Assert.assertEquals(response.jsonPath().get("id"),1);
		Assert.assertEquals(response.jsonPath().get("meses"),meses);
		Assert.assertEquals(response.jsonPath().get("valor"),valor);
		
		System.out.println("\n*** Caso de teste: Fim do teste de retorno da API com os valores.***");
	}

	@Test
	public void validateSchema() {
		
		System.out.println("*** Caso de teste: Validando o retorno da API com o schema. ***\n");
		
		RestAssured.baseURI = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";

		RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation();

		requestSpecification.when().get()
			.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		
		System.out.println("\n*** Caso de teste: Fim do teste de retorno da API com o schema.***");
	}
}
