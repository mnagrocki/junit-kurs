import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testy
{
    private WebDriver  driver;
    @Before
    public void setUp()
    {   System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnagr\\Documents\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to( "https://pl.m.wikipedia.org/");
    }
    @Test
    public void WikiTest()
    {

        Assert.assertEquals(driver.getTitle(),  "Wikipedia, wolna encyklopedia");

    }
    @After
    public  void tearDown()
    {
        driver.quit();
    }

}
