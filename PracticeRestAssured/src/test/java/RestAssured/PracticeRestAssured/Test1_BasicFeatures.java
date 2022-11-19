package RestAssured.PracticeRestAssured;

import org.apache.http.cookie.Cookie;
import org.testng.annotations.Test;
import static io.restassured.path.json.JsonPath.*;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
//import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;
import io.restassured.module.jsv.JsonSchemaValidationException;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher;
//import io.restassured.response.Response;
//import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.path.json.JsonPath.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;


public class Test1_BasicFeatures {
//  @Test
//  public void testStatusCode() {
//	  given().get("https://jsonplaceholder.typicode.com/posts/3").then().statusCode(200);
//  }
//  
//  @Test
//  public void testlogging() {
//	  given().get("https://jsonplaceholder.typicode.com/posts/3").then().statusCode(200).log().all();
//  }
//  
//  @Test
//  public void testequaltofunction() {
//	  given().get("https://jsonplaceholder.typicode.com/posts/3").
//	  then().body("title",equalTo("ea molestias quasi exercitationem repellat qui ipsa sit aut"));
//  }
//  
//  @Test
//  public void testHasItemfunction() {
//	  given().get("https://jsonplaceholder.typicode.com/posts/").
//	  then().body("title",hasItems("ea molestias quasi exercitationem repellat qui ipsa sit aut","qui est esse"));
//  }
  
//  @Test
//  public void testxmlstatuscode() {
//	  given().
//	  get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10").
//	  then().body("CUSTOMER.ID",equalTo("10")).
//	  log().all();
//  }
//
//  @Test
//  
//  public void testMultipleContent() {
//	  
////	  given().
////	  get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10").
////	  then().
////	  body("CUSTOMER.ID",equalTo("10")).body("CUSTOMER.FIRSTNAME",equalTo("Sue")).
////	  body("CUSTOMER.LASTNAME",equalTo("Fuller")).
////	  body("CUSTOMER.CITY",equalTo("Dallas"));
//	  
//	  //rootPath is used to reduce the entire path while validating the response as below:
//	  given().
//	  get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10").
//	  then().
//	  rootPath("CUSTOMER").
//	  body("ID",equalTo("10")).body("FIRSTNAME",equalTo("Sue")).
//	  body("LASTNAME",equalTo("Fuller")).
//	  body("CITY",equalTo("Dallas"));
//	  	  
//  }
//  
//  @Test
//  
//  public void testCompleteTextInOneGo() {
//	  given().
//	  get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10").
//	  then().body("CUSTOMER.text()",equalTo("10SueFuller135 Upland Pl.Dallas")).log().all();
//  }
//  
//
//@Test
//  
//  public void testxpath1() {
//	  given().
//	  get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10").
//	  then().
//	  root("").
//	  body(hasXPath("/CUSTOMER/FIRSTNAME",containsString("Sue")));
//  }
//  
//@Test
//
////public void testxpath2() {
//	  given().
//	  get("http://www.thomas-bayer.com/sqlrest/INVOICE/").
//	  then().body(hasXPath("/INVOICEList/INVOICE[text()='40']")).log().all();
//}

//@Test
//
//public void testrootPath() {
//	  given().
//	  get("https://reqres.in/api/users/2").
//	  then().
//	  rootPath("data").
//	  body("last_name",equalTo("Weaver")).
//	  detachRootPath("data").
//	  body("support.text",equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"));
//	  
//}

//@Test
//public void testparameterapi() {
//	
//	given().
//	header("Content-type", "text/html").
//	param("name","morpheus").
//	param("job","leader").
//	when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
//}

//@Test
//public void testGetResponseAsString() {
//	String responseString = get("https://reqres.in//api/users?page=2").asString();
//	System.out.println(responseString);
//}

//	@Test
//	public void testGetResponseAsString() throws IOException {
//		InputStream responseString = get("https://reqres.in//api/users?page=2").asInputStream();
//		System.out.println(responseString.toString().length());
//		responseString.close();
//	}
//	
	
//	@Test
//	public void testGetResponseAsByteArray() {
//		byte [] bytearray = get("https://reqres.in//api/users?page=2").asByteArray();
//		System.out.println(bytearray.length);
//		
//	}
	
//@Test
// public void testExtractDetailsUsingPath() {
//	String val =
//			when().get("https://reqres.in/api/users/2").
//			then().
//			contentType(ContentType.JSON).
//			body("data.first_name",equalTo("Janet")).
//			extract().path("data.avatar");
//	
//	System.out.println(val.toString());
//}
//	
//	@Test
//	public void testExtractDetailsUsingResponse() {
//		Response res = when().
//						get("https://reqres.in/api/users/2").then().extract().response();
//		System.out.println("response of request is --"+ res.asString());
//		
//	}

//	@Test
//  public void testContentType() {
//	  given().get("https://jsonplaceholder.typicode.com/posts/3").then().statusCode(200).contentType(ContentType.JSON);
//  }

//	 @Test
//	  public void testStatusCode() {
//		  given().get("https://reqres.in/api/users/2").
//		  then().
//		  assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("RestAssured/PracticeRestAssured/testschema.json"));
//	  }

//	 @Test
//	 public void testhasItems() {
//		 given().
//		 get("https://reqres.in/api/users?page=2").
//		 then().
//		 body("data.first_name",hasItems("Lindsay","Tobias")).log().all();
//	 }
	
	/* Here we are adding length of all id in coming response */
//	@Test
//	public void testlengthofvariableinJson() {
//		 given().
//		 get("https://reqres.in/api/users?page=2").
//		 then().
//		 body("data.last_name*.length().sum()",greaterThan(200));
//	 }
	
	/* To get all attribute as List */
	
//	@Test
//	public void testlengthofvariableinJson() {
//		 String response =  get("https://reqres.in/api/users?page=2").asString();
//		 List<String> ls = from(response).getList("data.last_name");
//		 
//		 System.out.println("List Size is - "+ ls.size());
//		 
//		 for(String name: ls) {
//			 if(name.equals("Funke")) {
//				 System.out.println("Funke last name is existed");
//			 }
//		 }
//		 
//		
//	 }

/* To get as list and apply conditions to it
 * The groovy has an implicit variable called 'it' which represents the current item in the list
 */
//	@Test
//	public void testlengthofvariableinJson() {
//		 String response =  get("https://reqres.in/api/users?page=2").asString();
//		 List<String> ls = from(response).getList("response.data.findAll {it.last_name.length() > 5}.last_name");
//		 
//		 System.out.println(ls); 
//		
//	 }
	
	/* Tests related to Headers & Cookies & jsonpath
	 * 
	 */
//	@Test
	public void testJsonPath() {
		String response = when().get("https://reqres.in/api/users?page=2").then().extract().asString();
		List<Integer> ls = from(response).get("data.id");
		System.out.print(ls.size());
		
	}
	
	/* Extract response as string and Fetching further details using JSONPATH
	 * 
	 */
	
	//@Test
	public void testJsonPath2() {
		
		String json = 
				when().get("https://reqres.in/api/users?page=2").then().extract().asString();
		JsonPath jsp = new JsonPath(json).setRootPath("data");
		List <String> res = jsp.get("last_name");
		System.out.println(res.size());
		
		
	}
	 
	/* Get all the Headers */
	
	//@Test
	public void testResponseHeaders() {
		
		Response res = get("http://jsonplaceholder.typicode.com/photos");
		
		String strres = res.getHeader("CF-RAY");
		System.out.println("Header value is -"+strres);
		
		//to get all headers.
		Headers hes = res.getHeaders();
		
		for(Header headers: hes) {
			System.out.println(headers);
		}
		
		
	}
	
	/* To get Cookies*/
//	@Test
public void testCookies() {
		
		Response res = get("http://jsonplaceholder.typicode.com/photos");
		Map<String,String> cookies = res.getCookies();
		
		for(Map.Entry<String, String> entry: cookies.entrySet()) {
			System.out.println(entry.getKey()+":"+ entry.getValue());
		}
	}

	/* To get detailed about cookies 
@Test
	public void testdetailedCookies() {
		
		Response res = get("http://jsonplaceholder.typicode.com/photos");
//		Cookie a = res.getDetailedCookie("__cfduid");
		
//		Cookie ca =  (org.apache.http.cookie.Cookie) res.getDetailedCookie("__cfduid");
//		System.out.println("Detailed -"+ca.getExpiryDate());
//		System.out.println(ca.getExpiryDate());
//		System.out.println(ca.getValue());
		
		
	}*/
 
}
