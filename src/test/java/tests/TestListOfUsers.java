package tests;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
public class TestListOfUsers {

	@Test
	public void testListofUsers() {
		baseURI = "https://reqres.in";
		
		given().
		when().
		get("/api/users?page=2").
		then().
		body("data[3].first_name",equalTo("Byron"))
		.body("data.first_name",hasItems("Michael","Lindsay","Tobias"));
	}
}
