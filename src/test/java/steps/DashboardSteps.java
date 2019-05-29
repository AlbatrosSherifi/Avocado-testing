package steps;

import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.Assertions;
import pages.DashboardPage;

public class DashboardSteps extends ScenarioSteps {

    DashboardPage dashboardPage;

    public void verifyUserIsLoggedIn() {
        Assertions.assertThat(dashboardPage.getUserNameLabel().getText().contains("Hey Albatros")).isTrue();
    }
}
