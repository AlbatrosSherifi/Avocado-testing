package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.DashboardSteps;
import steps.HomeSteps;
import steps.SignUpSteps;

public class SignUpStepDefinitions {

    @Steps
    SignUpSteps signUpSteps;
    @Steps
    HomeSteps homeSteps;

    @Given("^user is on sign up page$")
    public void userIsOnSignUpPage() {
        homeSteps.navigateToSignUpPage();
    }

    @When("^user enters details$")
    public void userEntersDetails()  {
        signUpSteps.enterDetails();
    }
}
