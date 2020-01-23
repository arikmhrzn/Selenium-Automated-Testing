import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class LogInPageTest extends TestBase {

    @Test
    public void init() throws Exception{

        LogInPage logInPage = PageFactory.initElements (driver,LogInPage.class);

        logInPage.typePassword ("Addict.maharjan");
        logInPage.typeUserName ("addict.maharjan");
        logInPage.clickOnLogInButton ();


}
}