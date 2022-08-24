package parentTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;
//import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;




public class ParentTest {

    public WebDriver webDriver;
    public GooglePage googlePage;
    //public LoginPage loginPage; //for BDD


    public ParentTest() {

    }
    @Before
    public void setUp() {
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webDriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        googlePage = new GooglePage(webDriver);
        //loginPage = new LoginPage(webDriver); //for BDD
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    }
