package project.steps;

import static home.project.PageObject.AuthorizationFormPO.*;

public class AuthorizationSteps {

    public void LoginInsertSteps(String username, String password) throws Exception{
        try {
            usernameInput().sendKeys(username);
            passwordInput().sendKeys(password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

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

    public void ClickSubmit(){
        submitButton().click();
    }

    public void CliskSignUp(){
        signupButton().click();
    }

}
