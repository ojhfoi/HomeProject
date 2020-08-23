package project.steps;

import io.cucumber.java.en.When;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class OpenSite {

    @When("Open site")
    public void goToSite() throws Exception{
        try {
            getWebDriver().navigate().to("https://pikabu.ru/");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
