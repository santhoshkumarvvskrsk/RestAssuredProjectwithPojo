package APIAutomationRestAssured.ApiRestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.*;

public class Test03_Put {

	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		JSONObject category = new JSONObject();
		category.put("id",15);
		category.put("name", "santhosh");
		JSONObject tags = new JSONObject();
		tags.put("id",20);
		tags.put("name","santhosh");
		Object [] tag = new Object[1];
		tag[0] = tags;
		String [] photourls = new String[1];
		photourls[0]="string";
		
//		System.out.println(Arrays.toString(photourls));
		
		request.put("id", 2);
		request.put("name","cattie");
		request.put("category", category);
		request.put("status","available");
		request.put("tags",tag);
		request.put("photoUrls", photourls);
		

		System.out.println(request);
		System.out.println(request.toJSONString());
		
//		Response response = given().get("https://petstore.swagger.io/v2/store/inventory").
//				then().statusCode(200).contentType("application/json").extract().response();
//		
//		System.out.println(response.asString());

//		
		Response response = given().
		contentType("application/json").
		accept("application/json").
		body(request.toString()).
		when().
		post("https://petstore.swagger.io/v2/store/inventory").
		then().statusCode(405).extract().response();
//		
//		System.out.println(response.asString());

	}

}
