package longVeg;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by Mike on 22-Aug-16.
 * Steps to support RunLogOnTest
 */
public class LogOnTestSteps {

    private static final Logger LOGGER = Logger.getLogger(LogOnTestSteps.class.getName());

    @Given("^The system is available for use$")
    public void the_system_is_available_for_use() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\Saltech\\ATF\\src\\test\\resources\\SeleniumDriver\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());


        //options for chrome driver - not linked to selenium grid
      /*  ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        capabilities.setCapability("chrome.binary", "<Path to binary>");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        webDriver = new ChromeDriver(capabilities);

      */

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.close();

        //throw new PendingException();
    }

    @When("^I enter my valid user name and password$")
    public void i_enter_my_valid_user_name_and_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The system should authenticate$")
    public void the_system_should_authenticate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^display the relevant home page$")
    public void display_the_relevant_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^An invalid user name and password is entered$")
    public void an_invalid_user_name_and_password_is_entered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The system should not authenticate the user$")
    public void the_system_should_not_authenticate_the_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^display an error message$")
    public void display_an_error_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^allow the user to re-enter the credentials$")
    public void allow_the_user_to_re_enter_the_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
