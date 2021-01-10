package project.steps;

import com.codeborne.selenide.Condition;
import home.project.DB.UserDAO.HomeTableUserDAO;
import home.project.PageObject.AuthorizationFormPO;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.mockito.Mock;

import static home.project.PageObject.AuthorizationFormPO.*;

public class AuthorizationSteps{

    @Mock
    private HomeTableUserDAO homeTableUserDAO;
    AuthorizationFormPO authorizationFormPO = new AuthorizationFormPO();

    /**
     * Insert username and password in authorization form
     * @param username - username
     * @param password - password
     * @throws Exception
     */
    @Given("Insert username {string} and password {string} in authorization form")
    public void LoginInsertSteps(String username, String password) throws Exception{
        try {
            authorizationFormPO.username
                    .should(Condition.appear)
                    .sendKeys(username);
            authorizationFormPO.password
                    .sendKeys(password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Insert authorization data. Data getting from DB(using mock)
     * @throws Exception
     */
    @Given("Insert username and password in authorization form")
    public void LoginInsertSteps() throws Exception{
        try {
            String user = homeTableUserDAO.findData(1).getUsername();
            String pass = homeTableUserDAO.findData(1).getPass();
            System.out.println(user +"\n" + pass);
            authorizationFormPO.username
                    .should(Condition.appear)
                    .sendKeys(user);
            authorizationFormPO.password
                    .sendKeys(pass);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Insert registration data
     * @param username - username
     * @param password - password
     * @param phone - phone
     * @param email - email
     * @throws Exception
     */
    @Given("Insert username {string}, password {string}, phone {string}, email {string} in sign up form")
    public void SignupInsertSteps(String username, String password, String phone, String email) throws Exception{
        try {

            authorizationFormPO.username
                    .should(Condition.appear)
                    .sendKeys(username);
            authorizationFormPO.password
                    .sendKeys(password);
            authorizationFormPO.phone
                    .sendKeys(phone);
            authorizationFormPO.email
                    .sendKeys(email);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Click on submit button
     */
    @And("Submit authorization")
    public void ClickSubmit(){
        authorizationFormPO.submit
                .should(Condition.appear)
                .click();
        WaitLoad.WaitLoadPage();
    }

    /**
     * Click on registration button
     */
    @Given("Submit sign up")
    public void CliskSignUp(){
        authorizationFormPO.signup
                .should(Condition.appear)
                .click();
        WaitLoad.WaitLoadPage();
    }

}
