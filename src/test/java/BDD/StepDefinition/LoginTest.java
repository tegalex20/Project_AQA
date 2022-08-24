package BDD.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class LoginTest   {

    WebDriver webDriver;

    @Given("^Open the Chrome and launch the application$")
    public void open_the_chrome_and_launch_the_application () throws Throwable{
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webDriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openStackoverflowUrl("https://stackoverflow.com");
        System.out.println("This step open the Chrome and launch the application ");
    }

    @When("^Click to link log in$")
    public void click_to_link_log_in () throws Throwable{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickToLinkLogIn();
        System.out.println("This step click to link log in");


    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable{
        LoginPage loginPage = new LoginPage(webDriver);

        //TODO:  удалить мою почту и пароль из этого метода
        loginPage.setUserNameAndPassword("tegalex2003@gmail.com", "*****");
        System.out.println("This step enter the Username and Password on login page");
    }

    @Then("^Click button submit$")
    public void click_button_submit () throws Throwable{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickButtonSubmit();
        webDriver.quit();
        System.out.println("This step click button submit");
    }

}
