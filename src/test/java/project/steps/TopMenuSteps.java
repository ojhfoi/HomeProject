package project.steps;

import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;

import static home.project.PageObject.TopMenuFormPO.*;

public class TopMenuSteps {

    /**
     * Click on hot story link
     * @throws Exception
     */
    @And("Go to hot post")
    public void goToHotStory() throws Exception{
        try {
            hotLink().click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Click on new story link
     * @throws Exception
     */
    @And("Go to new post")
    public void goToNewsStory() throws Exception{
        try {
            newPostLink().click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Click on community link
     * @throws Exception
     */
    @And("Go to community")
    public void goToCommunity() throws Exception{
        try {
            communityLink().click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
