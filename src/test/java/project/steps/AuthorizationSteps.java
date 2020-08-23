package project.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static home.project.PageObject.AuthorizationFormPO.*;

public class AuthorizationSteps {

    @Given("Insert username {string} and password {string} in authorization form")
    public void LoginInsertSteps(String username, String password) throws Exception{
        try {
            usernameInput().sendKeys(username);
            passwordInput().sendKeys(password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Given("Inser username {string}, password {string}, phone {string}, email {string} in sign up form")
    public void SignupInsertSteps(String username, String password, String phone, String email) throws Exception{
        try {
            usernameInput().sendKeys(username);
            passwordInput().sendKeys(password);
            phoneInput().sendKeys(phone);
            emailInp().sendKeys(email);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("Submit authorization")
    public void ClickSubmit(){
        submitButton().click();
    }

    @Given("Submit sign up")
    public void CliskSignUp(){
        signupButton().click();
    }

}
