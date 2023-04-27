package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;

import java.util.Map;

import static pages.locator.*;

public class MyStepdefs extends Base {
    @Given("user on {string}")
    public void userOn(String url) {
        driver.get(url);
    }

    @When("user click Login Sign button")
    public void userClickLoginSignButton() {
        click(lLoginLink);
    }

    @And("user login with the following credentials")
    public void userLoginWithTheFollowingCredentials(DataTable table) {
        Map<String, String> map=table.asMap();
        sendKeys(lLoginEmail,map.get("username"));
        sendKeys(lLoginPassword, map.get("password"));
        click(lLoginButton);
    }

    @Then("login should be successfull")
    public void loginShouldBeSuccessfull() {
        visible(lLoginProfileLink);
    }
}
