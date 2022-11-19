package APIAutomationRestAssured.ApiRestAssured;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;

import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;


public class GetAPI {

	public static void main(String[] args) {
		/** 
		 * given()
		 * 
		 * when()
		 * 
		 * Then()
		 * 
		 * */
		System.out.println("First API TC");
	    RestAssured.given().param("page", "2").auth().none()
		.header("Content-Type","application/JSON").contentType(ContentType.JSON)
		.when().get("https://reqres.in/api/users")
		.then().statusCode(200).body("page",Matchers.equalTo(2));
		
//		System.out.println("Executed Successfully");
		

	}

}
