import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class LogInPage {

    WebDriver driver;

    public LogInPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators

    //UserName locator
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement userName;

    //password locator
    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement passWord;

    //Login button
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement logInButton;



    public void typeUserName(String user) {

        userName.clear();
        userName.sendKeys(user);
    }

    public void typePassword(String pass){

        passWord.clear();
        passWord.sendKeys (pass);
    }

    public void clickOnLogInButton(){

        logInButton.sendKeys (Keys.RETURN);


    }
}
