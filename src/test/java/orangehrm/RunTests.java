package orangehrm;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 08/05/2016.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:target/CucumberReports"},tags="@login")
public class RunTests {
}
