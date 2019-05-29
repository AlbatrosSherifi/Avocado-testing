package steps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.SignUpPage;

public class SignUpSteps extends ScenarioSteps {

    SignUpPage signUpPage;

    public void enterDetails() {

        signUpPage.waitForVisibility(signUpPage.getNameInput()).type("NewUser");
        signUpPage.waitForVisibility(signUpPage.getEmailInput()).type("test+124@email.com");
        signUpPage.waitForVisibility(signUpPage.getPasswordInput()).type("password");
        signUpPage.waitForVisibility(signUpPage.getPasswordConfirmationInput()).type("password");
        signUpPage.waitForVisibility(signUpPage.getRegisterButton()).click();
    }
}
