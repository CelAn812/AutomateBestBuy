package bestBuy;

import base.TestBase;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static base.TestBase.driver;

public class BestBuyHomePage extends TestBase {
//1)navigate to BestBuy

    public static void searchBox() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("gh-search-input")).sendKeys("samsung galaxy s22");
        Thread.sleep(3000);
        driver.findElement(By.className("header-search-button")).click();
        String actualText = driver.findElement(By.xpath("//div[@class='title-wrapper title']")).getText();
        String expectedText = "Results for \"samsung galaxy s22\".";
        Assert.assertEquals(actualText, expectedText, "result doesn't match");
    }

    public static void searchBoxClearAndResearch() throws InterruptedException {
        searchBox();
        driver.findElement(By.id("header-clear-search-icon")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("gh-search-input")).sendKeys("iphone 13");
        Thread.sleep(5000);
        driver.findElement(By.className("header-search-button")).click();
        String actualText = driver.findElement(By.xpath("//div[@class='title-wrapper title']")).getText();
        String expectedText = "Results for \"iphone 13\" in All Cell Phones with Plans.Search all categories instead.";
        Assert.assertEquals(actualText, expectedText, "result doesn't match");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Search all categories instead.")).click();
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.xpath("//div[@class='title-wrapper title']")).getText();
        String expectedResult = "Results for \"iphone 13\".";
        Assert.assertEquals(actualResult, expectedResult, "result doesn't match");
    }

    public static void menuDealsGeneral() throws InterruptedException {
        driver.findElement(By.cssSelector(".hamburger-menu")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@class='liDropdownList '][1]")).click();
        Thread.sleep(3000);
    }

    public static void menuDealsSpecific() throws InterruptedException {
        menuDealsGeneral();
        driver.findElement(By.xpath("//h3[text()='Deals']/following::li[1]")).click();
        String expectedTitleDeals = "Top Deals and Featured Offers on Electronics - Best Buy";
        String actualTTileDeals = driver.getTitle();
        Assert.assertEquals(actualTTileDeals, expectedTitleDeals, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuDealsGeneral();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h3[text()='Deals']/following::li[2]")).click();
        String expectedTitleDealOfDay = "Deal of the Day: Electronics Deals - Best Buy";
        String actualTTileDealDealOfDAy = driver.getTitle();
        Assert.assertEquals(actualTTileDealDealOfDAy, expectedTitleDealOfDay, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuDealsGeneral();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h3[text()='Deals']/following::li[3]")).click();
        String expectedTitleDealTotalTech = "Top Deals on Totaltech - Best Buy";
        String actualTTileDealDealTotalTech = driver.getTitle();
        Assert.assertEquals(expectedTitleDealTotalTech, actualTTileDealDealTotalTech, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuDealsGeneral();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h3[text()='Deals']/following::li[4]")).click();
        String expectedTitleDealStudents = "Top Deals on Back to School Tech - Best Buy";
        String actualTTileDealDealStudent = driver.getTitle();
        Assert.assertEquals(actualTTileDealDealStudent, expectedTitleDealStudents, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuDealsGeneral();
        Thread.sleep(3000);
        WebElement clearanceNMore = driver.findElement(By.xpath("//h3[text()='Deals']/following::li[29]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clearanceNMore);
        Thread.sleep(3000);
        clearanceNMore.click();
        String expectedTitleDealClearance = "Best Buy Outlet: Refurbished and Clearance Electronics";
        String actualTTileDealDealClearance = driver.getTitle();
        Assert.assertEquals(actualTTileDealDealClearance, expectedTitleDealClearance, "wrong page");
    }

    public static void menuSupportNServices() throws InterruptedException {
        driver.findElement(By.cssSelector(".hamburger-menu")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@class='liDropdownList '][2]")).click();
        Thread.sleep(3000);
    }

    public static void menuSupportNServicesSpecific() throws InterruptedException {
        menuSupportNServices();
        driver.findElement(By.xpath("//h3[text()='Support & Services']/following::li[6]")).click();
        String expectedTitleConsultation = "Best Buy Home: Virtual and In-Home Consultation - Best Buy";
        String actualTTileConsultation = driver.getTitle();
        Assert.assertEquals(actualTTileConsultation, expectedTitleConsultation, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuSupportNServices();
        Thread.sleep(3000);
        WebElement tvServices = driver.findElement(By.xpath("//h3[text()='Support & Services']/following::li[9]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tvServices);
        tvServices.click();
        String expectedTitleTv = "TV & Home Theater Services: Geek Squad - Best Buy";
        String actualTTileTv = driver.getTitle();
        Assert.assertEquals(actualTTileTv, expectedTitleTv, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuSupportNServices();
        Thread.sleep(3000);
        WebElement close = driver.findElement(By.xpath("//button[@class='c-button-unstyled close-button-sidecar']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", close);
        Thread.sleep(3000);
        close.click();
        driver.navigate().refresh();
        driver.navigate().back();
    }

    public static void menuBrands() throws InterruptedException {
        driver.findElement(By.cssSelector(".hamburger-menu")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@class='liDropdownList '][3]")).click();
        Thread.sleep(3000);
    }

    public static void menuBrandsSpecific() throws InterruptedException {
        menuBrands();
        driver.findElement(By.xpath("//h3[text()='Brands']/following::li[2]")).click();
        String expectedTitleApple = "Apple Brand Store: Apple Products - Best Buy";
        String actualTTileApple = driver.getTitle();
        Assert.assertEquals(actualTTileApple, expectedTitleApple, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuBrands();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h3[text()='Brands']/following::li[3]")).click();
        String expectedTitleSamsung = "Samsung Store – Best Buy";
        String actualTTileSamsung = driver.getTitle();
        Assert.assertEquals(actualTTileSamsung, expectedTitleSamsung, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuBrands();
        Thread.sleep(3000);
        WebElement dell = driver.findElement(By.xpath("//a[text()='Dell']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dell);
        dell.click();
        String expectedDell = "Dell Computers - Best Buy";
        String actualTTileDell = driver.getTitle();
        Assert.assertEquals(actualTTileDell, expectedDell, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
        menuBrands();
        Thread.sleep(3000);
        WebElement camera = driver.findElement(By.linkText("Camera Experience Shop"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", camera);
        Thread.sleep(3000);
        camera.click();
        String expectedCamera = "Camera Experience Shop: Photography & Camera Store – Best Buy";
        String actualTTileCamera = driver.getTitle();
        Assert.assertEquals(actualTTileCamera, expectedCamera, "wrong page");
        Thread.sleep(3000);
        driver.navigate().back();
    }

    public static void menuCellPhones() throws InterruptedException {
        driver.findElement(By.cssSelector(".hamburger-menu")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-id='node-525']")).click();
        Thread.sleep(3000);
    }

    public static void menuCellPhonesSpecific() throws InterruptedException {
        menuCellPhones();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Unlocked Phones")).click();
        String expectedTitlePhones = "Unlocked Phones: Unlocked Smartphones - Best Buy";
        String actualTitlePhones = driver.getTitle();
        Assert.assertEquals(actualTitlePhones, expectedTitlePhones, "wrong page");
        menuCellPhones();
        WebElement allPhones = driver.findElement(By.partialLinkText("All Cell Ph"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allPhones);
        Thread.sleep(2000);//arguments[0].scrollIntoView(true);
        allPhones.click();
        String expectedTitleAllCell = "Cell Phones: Smartphones and Mobile Phones - Best Buy";
        String actualTitleAllCell = driver.getTitle();
        Assert.assertEquals(actualTitleAllCell, expectedTitleAllCell, "wrong page");
    }

    //Top Deals
    public static void topDeals() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
        String expectedPageTitle = "Top Deals and Featured Offers on Electronics - Best Buy";
        Thread.sleep(3000);
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "wrong page");
        Thread.sleep(3000);
//        String value=driver.findElement(By.xpath("//div[@class='flex-carousel-arrow-right ']")).getCssValue("button");
//        System.out.println("value="+value);
//        while(value==null){
//            driver.findElement(By.xpath("//div[@class='flex-carousel-arrow-right ']")).click();
//            value=driver.findElement(By.xpath("//div[@class='flex-carousel-arrow-right ']")).getCssValue("button");
//        }
//        System.out.println("value="+value);
        for (int i = 0; i <= 2; i++) {
            driver.findElement(By.xpath("//div[@class='flex-carousel-arrow-right ']")).click();
            Thread.sleep(2000);
        }
//        Assert.assertFalse(driver.findElement(By.xpath("//div[@class='flex-carousel-arrow-right ']")).isEnabled());
        Thread.sleep(2000);
        WebElement clearances = driver.findElement(By.cssSelector("img[alt$=' Clearance, open-box and more.']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clearances);
        Thread.sleep(2000);
        clearances.click();
        String expectedTitle = "Best Buy Outlet: Refurbished and Clearance Electronics";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public static void dealOfTheDay() throws InterruptedException {
        driver.findElement(By.linkText("Deal of the Day")).click();
        Thread.sleep(4000);
        String expectedTitle = "Deal of the Day: Electronics Deals - Best Buy";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "wrong page");
        Thread.sleep(3000);
        WebElement backToSchool = driver.findElement(By.xpath("//a[contains(text(),'Check out our Back to School ')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", backToSchool);
        Thread.sleep(2000);
        backToSchool.click();
        Thread.sleep(3000);
        String expectedBackSchoolTile = "Top Deals on Back to School Tech - Best Buy";
        String actualBackSchoolTile = driver.getTitle();
        Assert.assertEquals(actualBackSchoolTile, expectedBackSchoolTile, "wrong page");
    }

    public static void totalTechMember() throws InterruptedException {
        driver.findElement(By.linkText("Totaltech Membership")).click();
        Thread.sleep(3000);
        String expectedTitle = "Best Buy Totaltech™ – Best Buy";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "wrong page");
        Thread.sleep(3000);
        WebElement exclusivePrices = driver.findElement(By.xpath("//a[text()='Access to exclusive Totaltech member prices.']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", exclusivePrices);
        Thread.sleep(3000);
        exclusivePrices.click();
        String expectedExclusiveTitle = "Top Deals on Totaltech - Best Buy";
        String actualExclusiveTitle = driver.getTitle();
        Assert.assertEquals(actualExclusiveTitle, expectedExclusiveTitle);
        Thread.sleep(2000);
    }

    public static void creditCards() throws InterruptedException {
        driver.findElement(By.linkText("Credit Cards")).click();
        Thread.sleep(3000);
        String expectedTitle = "Best Buy Credit Card: Rewards & Financing";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "wrong page");
        Thread.sleep(3000);
        WebElement table = driver.findElement(By.xpath("//table[@aria-label='Comparing our Cards']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", table);
        Thread.sleep(3000);
        List<WebElement> tableRows = new ArrayList<>();
        tableRows = driver.findElements(By.xpath("//table[@aria-label='Comparing our Cards']/tbody/tr"));
        int expectedNumberOfRows = 8;
        int actualNumberOfElements = tableRows.size();
        Assert.assertEquals(actualNumberOfElements, expectedNumberOfRows, "wrong number of rows");
    }

    public static void giftCards() throws InterruptedException {
        driver.findElement(By.xpath("//ul[@class='bottom-nav-left']/li[6]")).click();
        Thread.sleep(3000);
        String expectedTitle = "Gifts Cards and E-Gift Cards - Best Buy";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "wrong page");
        Thread.sleep(3000);
        WebElement warning = driver.findElement(By.cssSelector("div.col-xs-9"));
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", warning);
        String expectedWarningText = "Don't become a victim of gift card fraud.\n" +
                "We want to help you recognize and avoid gift card scams. Check out these tips and resources explaining more about this growing issue.\n" +
                "Learn more about gift card fraud";
        String actualWarningText = warning.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualWarningText,expectedWarningText,"wrong warning");
        Thread.sleep(3000);
    }
    public static void giftIdeas() throws InterruptedException {
        driver.findElement(By.linkText("Gift Ideas")).click();
        String expectedTitle="Gift Ideas 2022: Best Gifts to Give This Year - Best Buy";
        Thread.sleep(3000);
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");
        Thread.sleep(3000);
    }
    public static void moreHealthNWellness() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='More']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.scroll-container>div:nth-child(1)>ul>li:first-of-type")).click();
        Thread.sleep(3000);
        String expectedTitle="Health & Wellness Solutions & Technology - Best Buy";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");
        Thread.sleep(3000);

    }
    public static void moreOutlet() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='More']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.scroll-container>div:nth-child(1)>ul>li:last-of-type")).click();
        Thread.sleep(3000);
        String expectedTitle="Best Buy Outlet: Refurbished and Clearance Electronics";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");
        Thread.sleep(3000);

    }
    public static void moreClose() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='More']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.scroll-container>div:nth-child(2)>button")).click();
        Thread.sleep(3000);
        String expectedTitle="Best Buy | Official Online Store | Shop Now & Save";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");
        Thread.sleep(3000);

    }
    public static void backToSchoolDeals() throws InterruptedException{
        driver.findElement(By.cssSelector("div.flyout-button-wrapper.utility-nav-drawer.bottom-left-links>button>span")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.scroll-container>div:nth-child(1)>ul>li:nth-child(1)")).click();
        Thread.sleep(3000);
        String expectedTitle="Top Deals on Back to School Tech - Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void backToSchoolCollegeResources() throws InterruptedException{
        driver.findElement(By.cssSelector("div.flyout-button-wrapper.utility-nav-drawer.bottom-left-links>button>span")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.scroll-container>div:nth-child(1)>ul>li:nth-child(2)")).click();
        Thread.sleep(3000);
        String expectedTitle="Back to School Deals: Best Buy Student Hub";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void backToSchoolK12Tech() throws InterruptedException{
        driver.findElement(By.cssSelector("div.flyout-button-wrapper.utility-nav-drawer.bottom-left-links>button>span")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.scroll-container>div:nth-child(1)>ul>li:nth-child(3)")).click();
        Thread.sleep(3000);
        String expectedTitle="Parent Hub - Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void backToSchoolClose() throws InterruptedException{
        driver.findElement(By.cssSelector("div.flyout-button-wrapper.utility-nav-drawer.bottom-left-links>button>span")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.scroll-container>div:nth-child(2)")).click();
        Thread.sleep(3000);
        String expectedTitle="Best Buy | Official Online Store | Shop Now & Save";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void bestBuyLogo() throws InterruptedException {
        driver.findElement(By.xpath("//a[@title='BestBuy.com']")).click();
        Thread.sleep(3000);
        String expectedTitle="Best Buy | Official Online Store | Shop Now & Save";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");
    }
    public static void accountSignIn() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        Thread.sleep(3000);
        String expectedTitle="Sign In to Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void accountCreateAccount() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Create Account']")).click();
        Thread.sleep(3000);
        String expectedTitle="Best Buy: Create an Account";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void accountAccount() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.account-menu>ul>li:nth-child(2)>a")).click();
        Thread.sleep(3000);
        String expectedTitle="Sign In to Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void accountOrdersNPurchases() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@class='display-account-menu']/li[2]/a")).click();
        Thread.sleep(3000);
        String expectedTitle="Sign In to Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void accountYourProducts() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@class='display-account-menu']/li[3]/a")).click();
        Thread.sleep(3000);
        String expectedTitle="Sign In to Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void accountPaymentMethods() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@class='display-account-menu']/li[4]/a")).click();
        Thread.sleep(3000);
        String expectedTitle="Sign In to Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }

    public static void accountProtectionPlans() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//ul[@class='display-account-menu']/li[5]/a")).click();
        Thread.sleep(3000);
        String expectedTitle="Sign In to Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void accountDigitalLibrary() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//ul[@class='display-account-menu']/li[6]/a")).click();
        Thread.sleep(3000);
        String expectedTitle="Sign In to Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");

    }
    public static void accountFreeHomeConsultation() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(3000);
        WebElement reeHomeConsultation=driver.findElement(By.xpath("//ul[@class='display-account-menu']/li[8]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reeHomeConsultation);
        Thread.sleep(3000);
        reeHomeConsultation.click();
        Thread.sleep(3000);
        String expectedTitle="Best Buy Home: Virtual and In-Home Consultation - Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");
        Thread.sleep(6000);
    }
    public static void accountAccountSettings() throws InterruptedException{
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(3000);
        WebElement accountSettings=driver.findElement(By.cssSelector("div.account-menu>ul>li:last-of-type>a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountSettings);
        Thread.sleep(3000);
        accountSettings.click();
        Thread.sleep(3000);
        String expectedTitle="Sign In to Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong page");
        Thread.sleep(6000);
    }
    public static void userAddsToCart() throws InterruptedException {
        searchBox();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Galaxy S22 Series']")).click();
        Thread.sleep(4000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        String expectedTitle="Samsung Galaxy S22 Series - Best Buy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"wrong product is selected");
        driver.findElement(By.xpath("//a[text()='Shop Galaxy S22 Ultra']")).click();
        Thread.sleep(3000);
       WebElement addToCart= driver.findElement(By.cssSelector("div>button.c-button.c-button-primary.c-button-lg.c-button-block.c-button-icon.c-button-icon-leading.add-to-cart-button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCart);
        Thread.sleep(3000);
        addToCart.click();
    }
}
