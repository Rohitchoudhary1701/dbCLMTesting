package testingDB;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class dbCLMStepDefinition {


       @Test
		public void getDetails()
		{
		
    	   RestAssured.baseURI= "https://getNaceDetails";
    	   
		
		String response= given().log().all().queryParam("Order", "398481").when().get()
		.then().assertThat().log().all().statusCode(200).extract()
	              .response().asString();
		
		JsonPath js=new JsonPath(response);
		
		Assert.assertEquals(1, js.getInt("level"));
		Assert.assertEquals("A", js.getString("Code"));
		Assert.assertEquals(" ", js.getString("Parent"));
		Assert.assertEquals("AGRICULTURE,FORESTRY AND FISHING", js.getString("Description"));
		Assert.assertEquals("This section includes the exploitation of vegetal and animal natural resources,comprising the activities of growing crops,raising and breeding of animals,harvesting of timber and other plants,animals or animal products from a farm or their natural habitats", js.getString("Description"));
		Assert.assertEquals(" ", js.getString("This item includes"));
		Assert.assertEquals(" ", js.getString("Rulings"));
		Assert.assertEquals(" ", js.getString("This item excludes"));
		Assert.assertEquals("A", js.getString("Reference to ISICrev.4"));
		
	
		
		}
	}

