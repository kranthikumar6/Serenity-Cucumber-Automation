package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import java.time.Duration;

public class LoginPage extends PageObject {

    String swagLabs = "https://www.saucedemo.com/v1/";

    @FindBy(xpath = "//input[@name='user-name']")
    WebElementFacade userNameInput;

    @FindBy(xpath = "//input[@name='password']")
    WebElementFacade passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElementFacade loginButton;

    @FindBy(xpath = "//div[@class='product_label']")
    WebElementFacade productsHeader;

    public void launchUrl() {
        getDriver().get(swagLabs);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofMillis(50000));
    }

    public String verifyPageTitle() {
        return getDriver().getTitle();
    }

    public void loginAsStandardUser() {
        userNameInput.waitUntilClickable().click();
        userNameInput.sendKeys("standard_user");
        passwordInput.waitUntilClickable().click();
        passwordInput.sendKeys("secret_sauce");
        loginButton.waitUntilClickable().click();
    }

    public String verifyProductsPageIsDisplayedAfterLogin() {
        return productsHeader.waitUntilVisible().getText();
    }
}