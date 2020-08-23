package project.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static home.project.PageObject.PostPO.*;

public class PostSteps {

    @Given("Select post by num {int}")
    public void goToPost(int postNum) throws Exception{
        try{
            postLinkList().get(postNum-1).should(Condition.appear).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void selectTags(String tags) throws Exception{
        try {
            tagsList().findBy(Condition.text(tags)).should(Condition.appear).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("Save post number {int}")
    public void clickSaveBtn(int postNum) throws Exception{
        try {
            saveStoryButton().get(postNum-1).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("Click on share button and copy link")
    public void shareBtnClick() throws Exception{
        try {
            shareStoryBtn().click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Given("Click on author link on post by number {int}")
    public void goToStoryAuthor(int postNum) throws Exception{
        try{
            storyUserLink().get(postNum-1).should(Condition.appear).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
