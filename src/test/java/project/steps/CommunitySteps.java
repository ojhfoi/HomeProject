package project.steps;

import com.codeborne.selenide.Condition;
import home.project.PageObject.CommunityPage;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.Given;

import static home.project.PageObject.CommunityPage.*;

public class CommunitySteps {

    CommunityPage communityPage = new CommunityPage();

    /**
     * Search community by name
     * @param communityName
     * @throws Exception
     */
    @Given("Search community {string} by name")
    public void searchCommunity(String communityName) throws Exception{
        try {
            communityPage.search
                    .should(Condition.appear)
                    .sendKeys(communityName);
            communityPage.searchSubmit
                    .click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Select community by name in community list
     * @param communityName
     * @throws Exception
     */
    @Given("Select community by name {string} from community list")
    public void selectCommunity(String communityName) throws Exception{
        try {
            WaitLoad.WaitLoadPage();
            communityPage.communities
                    .findBy(Condition.text(communityName))
                    .should(Condition.appear)
                    .click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Click on subscribe button in community
     * @throws Exception
     */
    @Given("Subscribe on community")
    public void subscribeOnCommunity() throws Exception{
        try {
            communityPage.subscribe
                    .should(Condition.appear)
                    .click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
