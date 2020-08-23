package home.project.PageObject;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class CommentForm {

    private static By commentPlus = By.xpath("//div[contains(@class,'comment') and contains(@title,'Поставить плюсик')]");
    private static By commentMinus = By.xpath("//div[contains(@class,'comment') and contains(@title,'Поставить минус')]");

    public static ElementsCollection commentPlusButton(){
        ElementsCollection commPlusBtn = $$(commentPlus);
        return commPlusBtn;
    }

    public static ElementsCollection commentMinusButton(){
        ElementsCollection commMinusBtn = $$(commentMinus);
        return commMinusBtn;
    }

}
