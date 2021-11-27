package getRequest;

import org.testng.Assert;	
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testHttpCode() {
		
		Response resp = RestAssured.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=8f82f4c289eed0a534f89463711995db");
		
		int code = resp.getStatusCode();
		System.out.println("http response code is :"+code);
		Assert.assertEquals(code, 200);
		
	}
	
	@Test
	public void getBody() {
		
		
		Response resp = RestAssured.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=8f82f4c289eed0a534f89463711995db");
		
		String body = resp.asString();
		System.out.println("response body :"+body);
		
	}
}
