package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//наследуем от  ParentPage и подключаем вебдрайвер WebDriver
public class LoginPage extends ParentPage {

    public LoginPage (WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (xpath = ".//a[contains(text(),'Log in')]")
    private WebElement linkLogin;

    @FindBy (xpath = ".//input[@id='email']")
    private WebElement inputUsername;

    @FindBy (xpath = ".//input[@id='password']")
    private WebElement inputPassword;

    @FindBy (xpath = ".//button[@id='submit-button']")
    private WebElement buttonSubmit;

    public void clickToLinkLogIn(){
        webElements.clickOneElement(linkLogin);
    }

    public void openStackoverflowUrl (String url) { // инкапсуляция метода open()

        open(url);
    }

    public void setUserNameAndPassword(String username, String password){
        webElements.enterText(inputUsername, username);
        webElements.enterText(inputPassword, password);
    }

    public void clickButtonSubmit(){
        webElements.clickOneElement(buttonSubmit);

    }
}
