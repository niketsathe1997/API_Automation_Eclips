import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Tests_GET {

	@Test
	public void test_01() {
		
		
		
		
		given().
		accept(ContentType.XML)
		.get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data.first_name", hasItem("George"));
	}
}
