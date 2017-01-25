package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.GettingStartedScreen;

import static utils.DriverFactory.driver;

public class LoginSteps {

    GettingStartedScreen gettingStartedScreen;

    @After
    public void AfterScenario() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("^I am on the 'Sign In' screen$")
    public void i_am_on_the_Sign_In_screen() throws Throwable {
        gettingStartedScreen = new GettingStartedScreen();
    }

    @When("^I sign in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_sign_in_with_these_credentials(String username, String password) throws Throwable {
        gettingStartedScreen.logIntoTheApp(username, password);
    }

    @Then("^I am signed in successfully and I am taken to the lobby screen$")
    public void i_am_signed_in_successfully_and_I_am_taken_to_the_lobby_screen() throws Throwable {
        gettingStartedScreen.checkYouAreOnTheLobbyScreen();
    }
}
