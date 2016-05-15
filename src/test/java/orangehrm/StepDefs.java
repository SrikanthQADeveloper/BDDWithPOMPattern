package orangehrm;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class StepDefs {

    public static WebDriver Driver;
    @Before
    public void startBrowser() {
        Driver=new FirefoxDriver();
        Driver.get("http://sbtechnos11.trial52.orangehrmlive.com");
        Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Driver.manage().window().maximize();
    }

    @After
    public void stopBrowser() {
        Driver.quit();
    }


        @Given("^Admin is on login page$")
        public void AdminOnLoginPage() throws Throwable {
            Assert.assertTrue(Driver.findElement(By.id("btnLogin")).isDisplayed());

        }

        @When("^Admin enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
        public void ShouldEnterUsernameAndPassword(String Username, String Password) throws Throwable {
            Driver.findElement(By.name("txtUsername")).sendKeys(Username);
            Driver.findElement(By.name("txtPassword")).sendKeys(Password);


        }
        @And("^Admin selects login$")
        public void AdminSelectsLogin() throws Throwable {
            Driver.findElement(By.name("Submit")).click();

        }

        @Then("^Admin should login successfully$")
        public void ShouldLoginSuccessfully() throws Throwable {
            Assert.assertTrue(Driver.findElement(By.cssSelector(".firstLevelMenu ")).isDisplayed());



        }

        @And("^Admin should see welcome message as \"([^\"]*)\"$")
        public void ShouldSeeWelcomeMessage(String Message) throws Throwable {
            Assert.assertEquals(Message, Driver.findElement(By.id("welcome")).getText());


        }

    }












