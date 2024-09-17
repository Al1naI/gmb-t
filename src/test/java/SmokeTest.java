import utils.BaseTest;
import io.qameta.allure.Feature;
import org.junit.Test;
import ru.testit.annotations.WorkItemIds;

import static Steps.BrowserSteps.closeBrowser;
import static Steps.BrowserSteps.openAdm;


@Feature("Смок-тесты")
public class SmokeTest extends BaseTest {


    @WorkItemIds("111")
    @Test
    public void checkAuthorizationTest() {
        Arrange(() -> {
            openAdm();
        });
        Act(() -> {
        });
        Assert(() -> {
        });
        Cleanup(() -> {
            closeBrowser();
        });
    }

}
