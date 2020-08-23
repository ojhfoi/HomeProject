package project.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;

import static home.project.PageObject.CommentForm.*;

public class CommentSteps {

    @Then("Set plus on {int} comment")
    public void SetCommentPlus(int commentNum){
        commentPlusButton().get(commentNum-1).should(Condition.appear).click();
    }

    @Then("Set minus on {int} comment")
    public void SetCommentMinus(int commentNum){
        commentMinusButton().get(commentNum-1).should(Condition.appear).click();
    }

}
