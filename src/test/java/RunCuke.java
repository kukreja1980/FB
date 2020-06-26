import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src\\test\\java\\Features",
        glue = "Steps",
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"}

)
public class RunCuke {


}
