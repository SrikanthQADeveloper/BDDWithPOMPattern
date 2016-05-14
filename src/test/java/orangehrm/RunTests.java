package orangehrm;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"html:target/CucumberReports"},tags="@login", features={"src/resources"})
public class RunTests {
}
