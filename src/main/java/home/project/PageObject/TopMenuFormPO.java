package home.project.PageObject;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class TopMenuFormPO {

    private static By hot = By.xpath("//div[@data-feed-key='hot']/a");
    private static By newPost = By.xpath("//div[@data-feed-key='new']/a");
    private static By community = By.xpath("//div[@data-feed-key='communities']/a");

    public static WebElement hotLink(){
        WebElement hotLnk = $(hot).should(Condition.appear);
        return hotLnk;
    }

    public static WebElement newPostLink(){
        WebElement newPostLnk = $(newPost).should(Condition.appear);
        return newPostLnk;
    }

    public static WebElement communityLink(){
        WebElement communityLnk = $(community).should(Condition.appear);
        return communityLnk;
    }

}
