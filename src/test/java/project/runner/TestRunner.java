package project.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"project.steps", "home.project"},
        tags = "@test",
        plugin = {"pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
