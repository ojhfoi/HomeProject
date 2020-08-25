package project.steps;

import com.codeborne.selenide.Condition;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.Given;

import static home.project.PageObject.CommunityPage.*;

public class CommunitySteps {

    /**
     * Search community by name
     * @param communityName
     * @throws Exception
     */
    @Given("Search community by name {string}")
    public void searchCommunity(String communityName) throws Exception{
        try {
            searchInput().sendKeys(communityName);
            searchSubmitBtn().click();
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
            communitiesList().findBy(Condition.text(communityName)).should(Condition.appear).click();
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
            subscribeButton().click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
