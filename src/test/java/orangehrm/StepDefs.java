package orangehrm;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 08/05/2016.
 */
public class StepDefs {

    public static WebDriver driver;
    @Before
    public void startBrowser()
    {
        driver=new FirefoxDriver();
        driver.get("http://srikanthgoudm99-001-site1.smarterasp.net/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void stopBrowser()
    {
        driver.quit();
    }

}
