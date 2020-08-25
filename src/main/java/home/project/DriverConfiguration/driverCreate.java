package home.project.DriverConfiguration;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.webdriver.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;
import org.mockito.MockitoAnnotations;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static org.mockito.Mockito.mockitoSession;

public class driverCreate extends WebDriverFactory {

    private static String myBrowser = null;

    @Before
    public static void tearsUp(){
        myBrowser = System.getProperty("browser");
        if (myBrowser == null){
            myBrowser = "CHROME";
        }
        setWebDriver(config.valueOf(myBrowser.toUpperCase()).create());

        SelenideLogger.addListener(
                "AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @After
    public static void tearsDown(){
        if (getWebDriver() != null) {
            getWebDriver().quit();
        }
    }
}
