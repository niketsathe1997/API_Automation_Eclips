import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_GET {
	
	@Test
	void test() {
		Response res = get("https://reqres.in/api/users?page=2");
		
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody().asString());
		System.out.println(res.asString());
		
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}
	@Test
	void Test_02() {
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
	}

