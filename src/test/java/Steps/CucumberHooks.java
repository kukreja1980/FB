//package Steps;
//
//import PageObjects.FBLoginPage;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//public class CucumberHooks {
//
//    public static WebDriver driver;
//    public static FBLoginPage lp;
//    public Scenario scenario;
//    @Before
//    public void setup(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kukre\\eclipse-mavenTests\\PageObject\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        lp = new FBLoginPage(driver);
//    }
//
//    @After
//    public void teardown(Scenario scenario) throws IOException {
//        if (scenario.isFailed()){
//            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(srcFile, new File("C:\\Users\\kukre\\IdeaProjects\\FB\\"
//                    +scenario.getName()+".jpg"));
//        }
//        driver.quit();
//    }
//}
