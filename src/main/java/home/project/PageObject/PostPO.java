package home.project.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PostPO {

    private static By postLink = By.xpath("//h2//a[contains(@href,'story')]");
    private static By tagsBlock = By.xpath("//div[contains(@class,'story__tags')]");
    private static By tagsInBlock = By.xpath("//div[contains(@class,'story__tags')]//a[@class='tags__tag']");
    private static By saveStory = By.xpath("//div[contains(@class,'story__save')]");
    private static By shareStory = By.xpath("//div[contains(@class,'story__share')]");
    private static By userLink = By.xpath("//div[contains(@class,'story__user')]//a[contains(@class,'user__nick')]");

    public static ElementsCollection postLinkList(){
        ElementsCollection linkList = $$(postLink);
        if (linkList.isEmpty()){
            System.out.println("No post on page");
        }
        return linkList;
    }

    public static ElementsCollection tagsBlockList(){
        ElementsCollection tBlockList = $$(tagsBlock);
        if (tBlockList.isEmpty()){
            System.out.println("No post on page");
        }
        return tBlockList;
    }

    public static ElementsCollection tagsList(){
        ElementsCollection tagsCollection = $$(tagsInBlock);
        if (tagsCollection.isEmpty()){
            System.out.println("No post on page");
        }
        return tagsCollection;
    }

    public static ElementsCollection saveStoryButton(){
        ElementsCollection saveStoryBtn = $$(saveStory);
        return saveStoryBtn;
    }

    public static WebElement shareStoryBtn(){
        WebElement shareStoryBtn = $(shareStory).should(Condition.appear);
        return shareStoryBtn;
    }

    public static ElementsCollection storyUserLink(){
        ElementsCollection storyUserLnk = $$(userLink);
        if (storyUserLnk.isEmpty()){
            System.out.println("No post on page");
        }
        return storyUserLnk;
    }

}
