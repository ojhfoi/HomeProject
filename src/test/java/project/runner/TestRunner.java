package project.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"project.steps", "home.project"},
        tags = "",
        plugin = {"pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
