package home.project.DriverConfiguration;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.webdriver.WebDriverFactory;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class driverCreate extends WebDriverFactory {

    public void tearsUp(String myBrowser){
//        String myBrowser = System.getProperty("browser");
//        if (myBrowser == null){
//            myBrowser = "CHROME";
//        }
        setWebDriver(config.valueOf(myBrowser.toUpperCase()).create());

        SelenideLogger.addListener(
                "AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    public void tearsDown(){
        if (getWebDriver() != null) {
            getWebDriver().quit();
        }
    }
}
