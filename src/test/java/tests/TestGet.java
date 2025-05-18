package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestGet {

	@Test
	public void testGet() {
		baseURI = "https://reqres.in";
		
		//headers,authorization,body
		given().
		when().
		get("/api/users?page=2").
		then().
		statusCode(200).
		body("data[0].last_name",equalTo("Lawon")).
		body("data.last_name",hasItems("Lawson","Fergson","Funke")).
		log().all();	
		
	}
	
}
