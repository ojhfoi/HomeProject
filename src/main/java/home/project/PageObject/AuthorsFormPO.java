package home.project.PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Page Object on Author form
 */
public class AuthorsFormPO {

    public ElementsCollection filter = $$x("//div[contains(@class,'menu_horizontal')]//a[@class='menu__item']");
    public SelenideElement sortPost = $x("//div[contains(@class,'menu_horizontal')]//a[contains(@aria-label,'Сортировать')]");
}
