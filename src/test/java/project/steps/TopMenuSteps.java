package project.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;

import static home.project.PageObject.TopMenuFormPO.*;

public class TopMenuSteps {

    @And("Go to hot post")
    public void goToHotStory() throws Exception{
        try {
            hotLink().click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("Go to new post")
    public void goToNewsStory() throws Exception{
        try {
            newPostLink().click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("Go to community")
    public void goToCommunity() throws Exception{
        try {
            communityLink().click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
