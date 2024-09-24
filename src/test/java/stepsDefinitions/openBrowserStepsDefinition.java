package stepsDefinitions;

import Driver.GoogleChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import steps.goPage;

public class openBrowserStepsDefinition {

    @After
    public void tearDown(){
        GoogleChromeDriver.quitBroser();
    }

    @Given("The user enter the page")

    public void theUserEnterThePage() {

      goPage.opBrowser("https://demo.realworld.io/#/");
    }

}