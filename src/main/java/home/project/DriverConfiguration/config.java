package home.project.DriverConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public enum config {

    CHROME{
        @Override
        public WebDriver create(){
            WebDriverManager.chromedriver().setup();
            ChromeOptions ch = new ChromeOptions();
            ch.addArguments("--incognito", "--window-size=1280,1024", "--no-sandbox");
//            ch.addArguments("--headless");
            return new ChromeDriver(ch);
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
