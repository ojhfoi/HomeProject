package home.project.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

/**
 * Page Object Comment list Form
 */
public class CommentForm {

    public SelenideElement commentPlus = $x("//div[contains(@class,'comment') and contains(@title,'Поставить плюсик')]");
    public SelenideElement commentMinus = $x("//div[contains(@class,'comment') and contains(@title,'Поставить минус')]");
    public SelenideElement refreshComment = $x("//div[contains(@class,'navigator__refresh')]");
    public SelenideElement allComments = $x("//a[@data-id='all']");

}
