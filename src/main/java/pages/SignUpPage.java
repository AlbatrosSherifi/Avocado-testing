package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class SignUpPage extends AbstractPage {

    @FindBy(id = "name")
    WebElementFacade nameInput;

    @FindBy(id = "email")
    WebElementFacade emailInput;

    @FindBy(id = "password")
    WebElementFacade passwordInput;

    @FindBy(id = "password_confirmation")
    WebElementFacade passwordConfirmationInput;

    @FindBy(css = ".button.is-success")
    WebElementFacade registerButton;
}
