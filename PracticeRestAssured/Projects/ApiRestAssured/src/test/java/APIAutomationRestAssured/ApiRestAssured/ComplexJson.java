package APIAutomationRestAssured.ApiRestAssured;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;

import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;


import APIAutomationRestAssured.ApiRestAssured.Courses.ApiAutomation;
import APIAutomationRestAssured.ApiRestAssured.Courses.MobileAutomation;
import APIAutomationRestAssured.ApiRestAssured.Courses.WebAutomation;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ComplexJson {

	public static void main(String[] args) {
		
		List<WebAutomation> webs = new ArrayList<WebAutomation>();
		Courses.WebAutomation sel = new Courses.WebAutomation();
		sel.setCourseTitle("Selenium");
		sel.setPrice(4000);
		
		Courses.WebAutomation pro = new Courses.WebAutomation();
		pro.setCourseTitle("Protractor");
		pro.setPrice(5000);
		
		webs.add(sel);webs.add(pro);
		
		List<ApiAutomation> apis = new ArrayList<ApiAutomation>();
		Courses.ApiAutomation ra = new Courses.ApiAutomation();
		ra.setCourseTitle("RestAssure");
		ra.setPrice(5000);
		
		Courses.ApiAutomation sa = new Courses.ApiAutomation();
		sa.setCourseTitle("SOAP API Automation");
		sa.setPrice(5000);
		
		apis.add(sa); apis.add(ra);
		
		List<MobileAutomation> moa = new ArrayList<MobileAutomation>();
		Courses.MobileAutomation apm = new Courses.MobileAutomation();
		apm.setCourseTitle("Apium"); apm.setPrice(5000);
		moa.add(apm);
		
		
		Courses courses = new Courses();
		courses.setWebAutomation(webs);
		courses.setApiAutomation(apis);
		courses.setMobileAutomation(moa);
		ServiceDetailsPojo sdp = new ServiceDetailsPojo();
		
		
		
		sdp.setInstructor("Subhasish");
		sdp.setUrl("softwaretestingandautomation.com");
		sdp.setServices("Software Testing");
		sdp.setExpertise("Testing");
		sdp.setCourses(courses);
		sdp.setLinkedin("linkedinId");
		
	
		
      Response response = given().param("page", "2").auth().none()
			.header("Content-Type","application/JSON").contentType(ContentType.JSON)
			.when()
		    .body(sdp).log().all()
			.post("https://reqres.in/api/users");
//		System.out.println("Post Response is "+ response);

	}

}
