package home.project.PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PostPO {

    public ElementsCollection postLink = $$x("//h2//a[contains(@href,'story')]");
    public ElementsCollection tagsBlock = $$x("//div[contains(@class,'story__tags')]");
    public ElementsCollection tagsInBlock = $$x("//div[contains(@class,'story__tags')]//a[@class='tags__tag']");
    public ElementsCollection saveStory = $$x("//div[contains(@class,'story__save')]");
    public SelenideElement shareStory = $x("//div[contains(@class,'story__share')]");
    public ElementsCollection userLink = $$x("//div[contains(@class,'story__user')]//a[contains(@class,'user__nick')]");

}
