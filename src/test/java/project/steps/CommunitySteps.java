package project.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;

import static home.project.PageObject.CommunityPage.*;

public class CommunitySteps {
    @Given("Search community by name {string}")
    public void searchCommunity(String communityName) throws Exception{
        try {
            searchInput().sendKeys(communityName);
            searchSubmitBtn().click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Given("Select community by name {string} from community list")
    public void selectCommunity(String communityName) throws Exception{
        try {
            communitiesList().findBy(Condition.text(communityName)).should(Condition.appear).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Given("Subscribe on community")
    public void subscribeOnCommunity() throws Exception{
        try {
            subscribeButton().click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
