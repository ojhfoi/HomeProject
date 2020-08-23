package home.project.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CommunityPage {

    private static By search = By.xpath("//div[@class='main']//input[@name='q']");
    private static By searchSubmit = By.xpath("//div[@class='main']//button[@type='submit']");
    private static By communities = By.xpath("//section[contains(@class,'communities')]//div[@class='community__title']//a");
    private static By subscribe = By.xpath("//div[contains(@class,'community-header')]//button[not(contains(@class,'dot'))]");

    public static WebElement searchInput(){
        WebElement searchInp = $(search).should(Condition.appear);
        return searchInp;
    }

    public static WebElement searchSubmitBtn(){
        WebElement searchSbmtBtn = $(searchSubmit).should(Condition.appear);
        return searchSbmtBtn;
    }


    public static ElementsCollection communitiesList(){
        ElementsCollection communitiesLst = $$(communities);
        if(communitiesLst.isEmpty()){
            System.out.println("Not found communities on page!");
        }
        return communitiesLst;
    }

    public static WebElement subscribeButton(){
        WebElement subscribeBtn = $(subscribe).should(Condition.appear);
        return subscribeBtn;
    }

}
