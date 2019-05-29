package steps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.DashboardPage;

public class LogoutSteps extends ScenarioSteps {

    DashboardPage dashboardPage;


    public void logout() {
        dashboardPage.waitForVisibility(dashboardPage.getUserNameLabel()).click();
        dashboardPage.waitForVisibility(dashboardPage.getLogoutButton()).click();
    }
}
