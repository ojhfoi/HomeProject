package project.steps;

import home.project.DB.UserDAO.HomeTableUserDAO;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Open site
 */
public class OpenSite {

    private HomeTableUserDAO homeTableUserDAO = new HomeTableUserDAO();

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

}
