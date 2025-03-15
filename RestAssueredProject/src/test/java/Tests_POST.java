import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
   

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Tests_POST {

	
	@Test
	public void Test_3() {
		
		Map<String, Object>map = new HashMap<String,Object>();
		
		map.put("name","Niket");
		map.put("job", "study");
		JSONObject request = new JSONObject(map);
		//System.out.println(request);
		
		given().
		//header("Content-Type", "application/json").
		//contentType(ContentType.JSON).
		accept(ContentType.XML).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
	}
}
