package project.steps;

import com.codeborne.selenide.Condition;
import home.project.PageObject.AuthorsFormPO;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static home.project.PageObject.AuthorsFormPO.*;

public class AuthorsSteps {

    AuthorsFormPO authorsFormPO = new AuthorsFormPO();

    /**
     * Set filter on author page
     * @param filterName
     */
    @Then("Set filter by filter name {string}")
    public void setFilter(String filterName){
        WaitLoad.WaitLoadPage();
        authorsFormPO.filter.
                findBy(Condition.text(filterName))
                .should(Condition.appear)
                .click();
    }

    /**
     * Sort author story
     */
    @Given("Set sort post filter")
    public void setSortPostFilter(){
        authorsFormPO.sortPost
                .should(Condition.appear)
                .click();
        WaitLoad.WaitLoadPage();
    }

}
