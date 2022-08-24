package BDD.TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)

 //TODO  поменять на JDK8 \ прописать полный путь к файлу "Features"
@CucumberOptions(features = "Features", glue = {"BDD.StepDefinition"})

public class Runner {
}



