package project.steps;

import com.codeborne.selenide.Condition;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static home.project.PageObject.CommentForm.*;

public class CommentSteps {

    /**
     * Set plus on comment in Story
     * @param commentNum
     */
    @Then("Set plus on {int} comment")
    public void SetCommentPlus(int commentNum){
        getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Set<String> handles = getWebDriver().getWindowHandles();
        List<String> handleList = new ArrayList<String>(handles);
        getWebDriver().switchTo().window(handleList.get(0));
        getWebDriver().close();
        getWebDriver().switchTo().window(handleList.get(1));
        commentPlusButton().get(commentNum-1).should(Condition.appear).click();
        WaitLoad.WaitLoadPage();
    }

    /**
     * Set minus on comment in story
     * @param commentNum
     */
    @Then("Set minus on {int} comment")
    public void SetCommentMinus(int commentNum){
        getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        Set<String> handles = getWebDriver().getWindowHandles();
//        List<String> handleList = new ArrayList<String>(handles);
//        getWebDriver().switchTo().window(handleList.get(0));
//        getWebDriver().close();
//        getWebDriver().switchTo().window(handleList.get(1));
        commentMinusButton().get(commentNum-1).should(Condition.appear).click();
        WaitLoad.WaitLoadPage();
    }

}
