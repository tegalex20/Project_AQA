package pages;

import libs.WebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {

    WebDriver webDriver;
    Logger logger;
    WebElements webElements;



    public ParentPage(WebDriver webDriver){
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webElements = new WebElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    //метод открытия страниц
    public void open (String url){
        try {
            webDriver.get(url);
            logger.info("Page was opened"+ url);
        }
        catch (Exception e){
            logger.error("Page can't opened" + url);
            Assert.fail("Page can't opened" + url);
        }
    }
}
