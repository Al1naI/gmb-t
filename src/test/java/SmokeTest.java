import javax.validation.constraints.AssertTrue;

import Steps.BrowserSteps;
import gmdAndPoints.admAndPoints;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseTest;
import io.qameta.allure.Feature;
import org.junit.Test;
import ru.testit.annotations.WorkItemIds;
import utils.Locators;

import static Steps.BrowserSteps.closeBrowser;
import static Steps.BrowserSteps.openAdm;


@Feature("Смок-тесты")
public class SmokeTest extends BaseTest {


    @WorkItemIds("111")
    @Test
    public void checkAuthorizationTest() {
        WebDriver driver = new ChromeDriver();
        Act(() -> {
            driver.manage().window().maximize();
            driver.get(admAndPoints.adm);
            WebElement loginInput = driver.findElement(By.id("loginform-username"));
            loginInput.sendKeys("admin");
            WebElement passwordInput = driver.findElement(By.id("loginform-password"));
            passwordInput.sendKeys("123456");
            WebElement enterBtn = driver.findElement(By.xpath("//*[text()='Войти']"));
            enterBtn.click();
        });
        Assert(() -> {
            wait(10000);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, admAndPoints.adm + admAndPoints.index);
        });
        Cleanup(() -> {
            driver.close();
        });
    }

}
