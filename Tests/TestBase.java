import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver = null;

    @Before
    public void initialize() throws IOException{
        System.setProperty ("webdriver.chrome.driver", System.getProperty ("user.dir")+"/chromedriver");

        driver = new ChromeDriver ();

        // TO maximize browser
        driver.manage ().window ().maximize ();

        //Impliment wait time
        driver.manage ().timeouts ().implicitlyWait (10,TimeUnit.SECONDS);

        //Opening the browser
        driver.get ("https://www.facebook.com/");


    }
    @After
    public void tearDown(){
        driver.close ();
    }
}



