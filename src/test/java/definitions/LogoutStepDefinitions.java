package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LogoutSteps;

public class LogoutStepDefinitions {

    @Steps
    LogoutSteps logoutSteps;

    @When("^user logs out$")
    public void userLogsOut()  {
        logoutSteps.logout();
    }
}
