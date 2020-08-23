package home.project.DriverConfiguration;

import com.codeborne.selenide.webdriver.WebDriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class driverCreate extends WebDriverFactory {

    @BeforeSuite
    public static void tearsUp(){
        String br = System.getProperty("browser").toUpperCase();
        if (br == null){
            br = "CHROME";
        }
        setWebDriver(config.valueOf(br).create());
    }

    @AfterSuite
    public static void tearsDown(){
        if (getWebDriver() != null) {
            getWebDriver().quit();
        }
    }
}
