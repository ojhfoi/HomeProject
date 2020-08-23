package home.project.PageObject;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationFormPO {

    //Input type object
    private static By username = By.xpath("//div[contains(@class,'tab_visible')]//input[@name='username']");
    private static By password = By.xpath("//div[contains(@class,'tab_visible')]//input[@name='password']");
    private static By phone = By.xpath("//div[contains(@class,'tab_visible')]//input[@name='phone']");
    private static By email = By.xpath("//div[contains(@class,'tab_visible')]//input[@name='email']");


    //Button and link type object
    private static By submit = By.xpath("//div[contains(@class,'tab_visible')]//button");
    private static By signup = By.xpath("//div[contains(@class,'tab_visible')]//span[@data-to='signup']");

    public static WebElement usernameInput(){
        WebElement usernameInp = $(username).should(Condition.appear);
        return usernameInp;
    }

    public static WebElement passwordInput(){
        WebElement passInp = $(password).should(Condition.appear);
        return passInp;
    }

    public static WebElement phoneInput(){
        WebElement phoneInp = $(phone).should(Condition.appear);
        return phoneInp;
    }

    public static WebElement emailInp(){
        WebElement emailInp = $(email).should(Condition.appear);
        return emailInp;
    }

    public static WebElement submitButton(){
        WebElement submButt = $(submit).should(Condition.appear);
        return submButt;
    }

    public static WebElement signupButton(){
        WebElement signupButt = $(submit).should(Condition.appear);
        return signupButt;
    }

}
