package tests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestPost {

	@Test
	public void testPost() {
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "ali");
//		map.put("job", "tester");
//		System.out.println(map);
		
		JSONObject reqBody = new JSONObject();
		reqBody.put("name", "ali");
		reqBody.put("job", "tester");
		System.out.println(reqBody);
		
		baseURI ="https://reqres.in";
		
		given().
		header("x-api-key","reqres-free-v1").
		body(reqBody.toJSONString()).
		when().
		post("/api/users").
		then().
		statusCode(201).
		log().all();		
	
	}
	
}
