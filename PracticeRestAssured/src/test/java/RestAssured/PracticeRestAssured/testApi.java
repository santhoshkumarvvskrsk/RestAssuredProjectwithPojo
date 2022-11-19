package RestAssured.PracticeRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import org.json.simple.*;


public class testApi {
	
	@Test
	public void apitest() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("name", "somesh");
		json.put("job", "QA");
		request.body(json.toJSONString());
		
		Response res = request.post("https://reqres.in/api/users");
		int code = res.getStatusCode();
		Assert.assertEquals(code, 201);
		
		
	}

}
