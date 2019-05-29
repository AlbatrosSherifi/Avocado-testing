package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by Ardit Podrimaj
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    HomePage homePage;

    public void login(String email, String password){
        loginPage.waitForVisibility(loginPage.getEmailInput()).type(email);
        loginPage.waitForVisibility(loginPage.getPasswordInput()).type(password);
        loginPage.waitForVisibility(loginPage.getLoginButton()).click();
    }
}