package project.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static home.project.PageObject.AuthorsFormPO.*;

public class AuthorsSteps {

    @Then("Set filter by filter name {string}")
    public void setFilter(String filterName){
        filterList().findBy(Condition.text(filterName)).should(Condition.appear).click();
    }

    @Given("Set sort post filter")
    public void setSortPostFilter(){
        sortPostButton().click();
    }

}
