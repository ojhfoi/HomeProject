package project.steps;

import home.project.DB.UserDAO.HomeTableUserDAO;
import home.project.WaitLoad.WaitLoad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.mockito.Mock;

import static home.project.PageObject.AuthorizationFormPO.*;

public class AuthorizationSteps{

    @Mock
    private HomeTableUserDAO homeTableUserDAO;

    /**
     * Insert username and password in authorization form
     * @param username - username
     * @param password - password
     * @throws Exception
     */
    @Given("Insert username {string} and password {string} in authorization form")
    public void LoginInsertSteps(String username, String password) throws Exception{
        try {
            usernameInput().sendKeys(username);
            passwordInput().sendKeys(password);
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
            usernameInput().sendKeys(user);
            passwordInput().sendKeys(pass);
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
            usernameInput().sendKeys(username);
            passwordInput().sendKeys(password);
            phoneInput().sendKeys(phone);
            emailInp().sendKeys(email);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Click on submit button
     */
    @And("Submit authorization")
    public void ClickSubmit(){
        submitButton().click();
        WaitLoad.WaitLoadPage();
    }

    /**
     * Click on registration button
     */
    @Given("Submit sign up")
    public void CliskSignUp(){
        signupButton().click();
        WaitLoad.WaitLoadPage();
    }

}
