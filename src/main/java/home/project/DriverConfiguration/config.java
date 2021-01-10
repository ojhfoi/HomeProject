package home.project.DriverConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;
import java.util.logging.Logger;

public enum config {

    CHROME{
        @Override
        public WebDriver create() {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("browserName", "Chrome");
//            capabilities.setCapability("browserVersion", "");
//            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                    "enableVNC", true,
//                    "enableVideo", true
//            ));
//            RemoteWebDriver driver = null;
//            try {
//                driver = new RemoteWebDriver(
//                        URI.create("http://localhost:8080/wd/hub").toURL(),
//                        capabilities
//                );
//            } catch (MalformedURLException malformedURLException) {
//                System.out.println("Error");
//            }

            WebDriverManager.chromedriver().setup();
            ChromeOptions ch = new ChromeOptions();
            ch.addArguments("--incognito", "--window-size=1280,1024", "--no-sandbox");
//            ch.addArguments("--headless");
            return new ChromeDriver(ch);
//            return driver;
        }
    },
    FIREFOX{
        @Override
        public WebDriver create(){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions fo = new FirefoxOptions();
            fo.addArguments("--private", "--window-size=1280,1024", "--no-sandbox");
            fo.addArguments("--headless");
            return new FirefoxDriver(fo);
        }
    };

    public WebDriver create(){
        return null;
    }

}
