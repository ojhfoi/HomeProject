package home.project.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

/**
 * Community form page object
 */
public class CommunityPage {

    public SelenideElement search = $x("//div[@class='main']//input[@name='q']");
    public SelenideElement searchSubmit = $x("//div[@class='main']//button[@type='submit']");
    public ElementsCollection communities = $$x("//section[contains(@class,'communities')]//div[@class='community__title']//a");
    public SelenideElement subscribe = $x("//div[contains(@class,'community-header')]//button[not(contains(@class,'dot'))]");

}
