package Steps;

import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.WebDriverRunner;
import gmdAndPoints.admAndPoints;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class BrowserSteps {
    static WebDriver cd = new ChromeDriver();

    @Step("Открыть браузер")
    public static void openBrowser(String string) {
        cd.manage().window().maximize();
        cd.get(string);
    }

    @Step("Открыть админку")
    public static void openAdm() {
        openBrowser(admAndPoints.adm);
    }

    @Step("Закрыть браузер")
    public static void closeBrowser() {
        cd.close();
    }

    public static void checkCurrentUrl(String url) {
        assertThat(WebDriverRunner.getWebDriver()
                .getCurrentUrl(), containsString(url));
    }
}
