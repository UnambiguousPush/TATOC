import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature", /*dryRun = true, */ glue = {"CUCUMBER"}, monochrome = true, plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"})
public class JUnitRunnerTest {

}