package project.steps;

import home.project.DB.UserDAO.HomeTableUserDAO;
import home.project.DriverConfiguration.driverCreate;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Open site
 */
public class OpenSite {

    private HomeTableUserDAO homeTableUserDAO = new HomeTableUserDAO();
    driverCreate driverCreate = new driverCreate();

    /**
     * Get url from database and go to it
     * @throws Exception
     */
    @When("Open site")
    public void goToSite() throws Exception{
        try {
            getWebDriver().navigate().to(homeTableUserDAO.findData(1).getUrl());
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Given("Create copy {string} driver")
    public void setDriver(String driver){
        driverCreate.tearsUp(driver);
    }

    @Then("Close web driver copy")
    public void destroyDriver(){
        driverCreate.tearsDown();
    }

}
