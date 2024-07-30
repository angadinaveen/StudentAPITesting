package com.StudentAPITesting;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class APITesting extends ExtentReportListner{
	
	@Test
	public void getAPITest() {
		given()
		.get("http://localhost:8090/student-api/")
		.then()
		.statusCode(200).log().all();
		test.log(LogStatus.PASS, "Get API  testing completed");
	}
	
	@Test
	public void postAPITest() {
		given()
		.when()
		.post("http://localhost:8090/student-api/");
		test.log(LogStatus.PASS, "Post API testing completed");
	}

}
