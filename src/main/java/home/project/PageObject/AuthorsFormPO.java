package home.project.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AuthorsFormPO {

    private static By filter = By.xpath("//div[contains(@class,'menu_horizontal')]//a[@class='menu__item']");
    private static By sortPost = By.xpath("//div[contains(@class,'menu_horizontal')]//a[contains(@aria-label,'Сортировать')]");

    public static ElementsCollection filterList(){
        ElementsCollection filtList = $$(filter);
        if (filtList.isEmpty()){
            System.out.println("Filter not found!");
        }
        return filtList;
    }

    public static WebElement sortPostButton(){
        WebElement sortButt = $(sortPost).should(Condition.appear);
        return sortButt;
    }
}
