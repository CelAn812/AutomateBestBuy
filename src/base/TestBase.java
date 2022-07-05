package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;
    String browserName="chrome";
    String url="https://www.bestbuy.com/";

    //    static String browserName;
    @BeforeTest
    public void setUpAutomation() {

        System.out.println("********** Automation Started ************");
    }

    @AfterTest(alwaysRun = true)
    public void tearDownAutomation() throws InterruptedException {
//        Thread.sleep(6000);
//        driver.close();
        System.out.println("********** Automation Ended ************");
    }

    @BeforeTest
    public void setUp() {
        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else if (this.browserName == "firefox") {
            setUpFireFoxBrowser();
        }
        driver.get(this.url);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
//        driver.manage().deleteAllCookies();
    }

    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../AutomateBestBuy/browserDrivers/chromeWebDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();

    }

    public static void setUpFireFoxBrowser() {
        String fireFoxDriverPath = "../AutomateBestBuy/browserDrivers/chromeWebDriver/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
        driver = new FirefoxDriver();
    }
}
