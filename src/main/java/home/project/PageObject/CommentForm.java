package home.project.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Page Object Comment list Form
 */
public class CommentForm {

    private static By commentPlus = By.xpath("//div[contains(@class,'comment') and contains(@title,'Поставить плюсик')]");
    private static By commentMinus = By.xpath("//div[contains(@class,'comment') and contains(@title,'Поставить минус')]");
    private static By refreshComment = By.xpath("//div[contains(@class,'navigator__refresh')]");
    private static By allComments = By.xpath("//a[@data-id='all']");

    public static ElementsCollection commentPlusButton(){
        ElementsCollection commPlusBtn = $$(commentPlus);
        return commPlusBtn;
    }

    public static ElementsCollection commentMinusButton(){
        ElementsCollection commMinusBtn = $$(commentMinus);
        return commMinusBtn;
    }

    public static WebElement refreshBtn(){
        WebElement refreshCommentBtn = $(refreshComment).should(Condition.appear);
        return refreshCommentBtn;
    }

}
