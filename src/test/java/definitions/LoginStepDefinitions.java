package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.DashboardSteps;
import steps.HomeSteps;
import steps.LoginSteps;

/**
 * Created by Ardit Podrimaj
 */

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;
    @Steps
    HomeSteps homeSteps;
    @Steps
    DashboardSteps dashboardSteps;

    @Given("^user with email \"([^\"]*)\" and password \"([^\"]*)\" is logged in$")
    public void userWithEmailAndPasswordIsLoggedIn(String email, String password) {
        homeSteps.navigateToLoginPage();
        loginSteps.login(email, password);
    }

    @Then("^user should see dashboard$")
    public void userShouldSeeDashboard() {
        dashboardSteps.verifyUserIsLoggedIn();
    }
}