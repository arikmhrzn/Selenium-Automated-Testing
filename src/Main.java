import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");




        WebDriver driver = new ChromeDriver ();

        System.setProperty ("webdriver.chrome.driver", System.getProperty ("user.dir")+"/chromedriver.exe");
        driver.manage().window().maximize();

        driver.get ("http://newtours.demoaut.com/mercurywelcome.php");

        //Locators

        driver.findElement (By.name ("userName")).sendKeys ("mercury");

        driver.findElement (By.name ("password")).sendKeys ("mercury");

        driver.findElement (By.cssSelector ("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input[type=image]")).click ();

        driver.findElement (By.cssSelector ("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > input[type=radio]:nth-child(2)")).click ();

        driver.findElement (By.name ("fromPort")).click ();

        Select select = new Select(driver.findElement (By.name ("fromPort")));

        select.selectByValue ("Sydney");

        driver.findElement (By.name ("toPort")).click ();

        Select select1 = new Select(driver.findElement (By.name ("toPort")));

        select1.selectByValue ("London");

        driver.findElement (By.cssSelector ("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=radio]:nth-child(4)")).click ();

        driver.findElement (By.name ("findFlights")).click ();

        driver.findElement (By.xpath ("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).click ();

        driver.findElement (By.name ("passFirst0")).sendKeys ("Arik");

        driver.findElement (By.name ("passLast0")).sendKeys ("Maharjan");

        driver.findElement (By.cssSelector ("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(7) > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text]")).sendKeys ("346712353245");

        driver.findElement (By.name ("ticketLess")).click ();

        driver.findElement (By.name ("buyFlights")).click ();










        //close browser


        //driver.close ();




    }


}
