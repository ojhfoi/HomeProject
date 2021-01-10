package project.steps;

import com.codeborne.selenide.Condition;
import home.project.PageObject.TopMenuFormPO;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.And;

public class TopMenuSteps {

    TopMenuFormPO topMenuFormPO = new TopMenuFormPO();

    /**
     * Click on hot story link
     * @throws Exception
     */
    @And("Go to hot post")
    public void goToHotStory() throws Exception{
        try {
            topMenuFormPO.hot
                    .should(Condition.appear)
                    .click();
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
            topMenuFormPO.newPost
                    .should(Condition.appear)
                    .click();
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
            topMenuFormPO.community
                    .should(Condition.appear)
                    .click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
