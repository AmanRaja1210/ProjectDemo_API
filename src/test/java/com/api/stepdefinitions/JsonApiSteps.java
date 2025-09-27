package com.api.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class JsonApiSteps {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private Response response;

    @When("I send a GET request to {string}")
    public void iSendAGetRequestTo(String endpoint) {
        response = RestAssured.get(BASE_URL + endpoint);
    }

    @When("I send a POST request to {string} with body:")
    public void iSendAPostRequestToWithBody(String endpoint, String body) {
        response = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(body)
                .when()
                .post(BASE_URL + endpoint);
    }

    @When("I send a PUT request to {string} with body:")
    public void iSendAPutRequestToWithBody(String endpoint, String body) {
        response = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(body)
                .when()
                .put(BASE_URL + endpoint);
    }

    @When("I send a PATCH request to {string} with body:")
    public void iSendAPatchRequestToWithBody(String endpoint, String body) {
        response = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(body)
                .when()
                .patch(BASE_URL + endpoint);
    }

    @When("I send a DELETE request to {string}")
    public void iSendADeleteRequestTo(String endpoint) {
        response = RestAssured.delete(BASE_URL + endpoint);
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int expectedStatus) {
        Assert.assertEquals(response.statusCode(), expectedStatus, "Unexpected status code!");
    }

    @Then("the response should contain {string}")
    public void theResponseShouldContain(String key) {
        String body = response.getBody().asString();
        Assert.assertTrue(body.contains(key), "Response body does not contain: " + key);
    }
}
