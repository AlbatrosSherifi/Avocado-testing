package steps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

public class HomeSteps extends ScenarioSteps {

    HomePage homePage;

    public void navigateToLoginPage() {
        homePage.waitForVisibility(homePage.getLoginButton()).click();
    }

    public void navigateToSignUpPage() {
        homePage.getSignUpButton().click();
    }
}
