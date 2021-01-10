package home.project.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Paje Object in authorization form
 */
public class AuthorizationFormPO {

    //Input type object
    public SelenideElement username = $x("//div[contains(@class,'tab_visible')]//input[@name='username']");
    public SelenideElement password = $x("//div[contains(@class,'tab_visible')]//input[@name='password']");
    public SelenideElement phone = $x("//div[contains(@class,'tab_visible')]//input[@name='phone']");
    public SelenideElement email = $x("//div[contains(@class,'tab_visible')]//input[@name='email']");


    //Button and link type object
    public SelenideElement submit = $x("//div[contains(@class,'tab_visible')]//button");
    public SelenideElement signup = $x("//div[contains(@class,'tab_visible')]//span[@data-to='signup']");

}
