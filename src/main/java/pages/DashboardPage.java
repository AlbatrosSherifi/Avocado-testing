package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class DashboardPage extends AbstractPage {

    @FindBy(css = ".navbar-link")
    WebElementFacade userNameLabel;

    @FindBy(css = "[href='http://127.0.0.1:8000/logout']")
    WebElementFacade logoutButton;


}
