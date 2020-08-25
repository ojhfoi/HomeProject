package project.steps;

import com.codeborne.selenide.Condition;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static home.project.PageObject.PostPO.*;

public class PostSteps {

    /**
     * Select story by number and click on
     * @param postNum
     * @throws Exception
     */
    @Given("Select post by num {int}")
    public void goToPost(int postNum) throws Exception{
        try{
            WaitLoad.WaitLoadPage();
            postLinkList().get(postNum-1).should(Condition.appear).click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Select story tags
     * @param tags
     * @throws Exception
     */
    public void selectTags(String tags) throws Exception{
        try {
            WaitLoad.WaitLoadPage();
            tagsList().findBy(Condition.text(tags)).should(Condition.appear).click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Select story by number and
     * click on save story button
     * @param postNum
     * @throws Exception
     */
    @And("Save post number {int}")
    public void clickSaveBtn(int postNum) throws Exception{
        try {
            WaitLoad.WaitLoadPage();
            saveStoryButton().get(postNum-1).click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Click on share button
     * @throws Exception
     */
    @Then("Click on share button and copy link")
    public void shareBtnClick() throws Exception{
        try {
            shareStoryBtn().click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Select and go to story author
     * @param postNum
     * @throws Exception
     */
    @Given("Click on author link on post by number {int}")
    public void goToStoryAuthor(int postNum) throws Exception{
        try{
            WaitLoad.WaitLoadPage();
            storyUserLink().get(postNum-1).should(Condition.appear).click();
            WaitLoad.WaitLoadPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
