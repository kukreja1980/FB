package Steps;

import PageObjects.FBLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    public static WebDriver driver;
    public static FBLoginPage lp;
    public Scenario scenario;
    @Before
    public void setup(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kukre\\eclipse-mavenTests\\PageObject\\chromedriver.exe");
 //       driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        lp = new FBLoginPage(driver);
    }

    @After
    public void teardown(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("C:\\Users\\kukre\\IdeaProjects\\FB\\"
                    +scenario.getName()+".jpg"));
        }
        driver.quit();
    }

    @Given("User is on FB Home Page")
    public void userIsOnFBHomePage() {
        driver.get("http://www.facebook.com");
    }

    @When("User enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String arg0, String arg1) {
        lp.usernameFn().sendKeys(arg0);
        lp.passwordFn().sendKeys(arg1);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        lp.loginBtnFn().click();
    }

    @Then("user is able to login")
    public void userIsAbleToLogin() throws InterruptedException {
        Thread.sleep(5000);
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Facebook2"));
    }

    @And("FB Home page is displayed")
    public void fbHomePageIsDisplayed() {
    }

    @Given("User is on some Home Page")
    public void userIsOnSomeHomePage() {
        System.out.println("I am on some home page");
    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
        System.out.println("I entered following for username and password " + arg0 +" and " + arg1);
    }

    @Then("system prints out the credentials")
    public void systemPrintsOutTheCredentials() {
        System.out.println("I displayed credentials above");
    }
}
