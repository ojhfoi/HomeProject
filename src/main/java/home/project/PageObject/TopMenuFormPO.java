package home.project.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 *Page object top menu form
 */
public class TopMenuFormPO {

    public SelenideElement hot = $x("//div[@data-feed-key='hot']/a");
    public SelenideElement newPost = $x("//div[@data-feed-key='new']/a");
    public SelenideElement community = $x("//div[@data-feed-key='communities']/a");

}
