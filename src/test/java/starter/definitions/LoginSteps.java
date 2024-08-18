package starter.definitions;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.pages.LoginPage;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends PageObject {

    @Steps
    LoginPage loginPage;

    @Given("user has launched facebook url")
    public void launchGoogleUrl() {
        loginPage.launchUrlInChrome();
    }

    @When("user validates the page title")
    public void validatePageTitle() {
        loginPage.verifyPageTitle();
    }

    @Then("user validates the search in google")
    public void validateGoogleSearch() {
        assertThat(loginPage.validateFacebookLogin()).isTrue();
    }
}