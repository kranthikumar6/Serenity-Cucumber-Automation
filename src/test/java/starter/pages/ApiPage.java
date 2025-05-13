package starter.pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class ApiPage {

    Response response;

    public void setBaseURI() {
        RestAssured.baseURI = "https://randomuser.me/api/";
    }

    public int verifyApiResponse() {
        response = SerenityRest.when().get().then().extract().response();
        return response.getStatusCode();
    }

    public void printRandomUserDetails() {
        System.out.println(response.getBody().asPrettyString());
    }
}
