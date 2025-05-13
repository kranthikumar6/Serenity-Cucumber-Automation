package starter.definitions;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import starter.pages.ApiPage;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiSteps {

    @Steps
    ApiPage apiPage;

    @Given("user sets the base url for random user api")
    public void setBaseUrlForRandomUserAPI() {
        apiPage.setBaseURI();
    }

    @Then("check user gets success response from api request")
    public void userGetsSuccessResponse() {
        assertThat(apiPage.verifyApiResponse()).isEqualTo(200);
    }

    @Then("user generates the random details from response")
    public void generateRandomUserDetailsFromResponse() {
        apiPage.printRandomUserDetails();
    }
}
