package GoogleTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import parentTest.ParentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class GoogleTest extends ParentTest {
    WebDriver webDriver;
    @Test
    public void googleTest () {


     googlePage.openGooglePage();
     googlePage.enterTextForGooglePage("Maven selenium java");
     googlePage.clickOnSubmit();

    }
}
