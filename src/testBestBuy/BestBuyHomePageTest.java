package testBestBuy;

import base.TestBase;
import bestBuy.BestBuyHomePage;
import org.testng.annotations.Test;

import static bestBuy.BestBuyHomePage.*;

public class BestBuyHomePageTest extends TestBase {

    @Test
    public static void testSearchBox() throws InterruptedException {
        searchBox();
    }

    @Test
    public static void testSearchBoxClearAndResearch() throws InterruptedException {
        searchBoxClearAndResearch();
    }
    @Test
    public static void testMenuDeals() throws InterruptedException {
        menuDealsGeneral();
    }
    @Test
    public static void testMenuDealsSpecific() throws InterruptedException {
        menuDealsSpecific();
    }
    @Test
    public static void testMenuSupportNServices() throws InterruptedException {
        menuSupportNServices();
    }
    @Test
    public static void testMenuSupportNServicesSpecific() throws InterruptedException {
     menuSupportNServicesSpecific();
    }
    @Test
    public static void testMenuBrands() throws InterruptedException{
        menuBrands();
    }
    @Test
    public static void testMenuBrandsSpecific() throws InterruptedException{
        menuBrandsSpecific();
    }
    @Test
    public static void testMenuCellPhones() throws InterruptedException{
       menuCellPhones();
    }
    @Test
    public static void testMenuCellPhonesSpecific() throws InterruptedException{
        menuCellPhonesSpecific();
    }
    @Test
    public static void testTopDeals() throws InterruptedException{
        topDeals();
    }
    @Test
    public static void testDealOfTheDay() throws InterruptedException {
        dealOfTheDay();
    }
    @Test
    public static void testTotalTechMember() throws InterruptedException {
    totalTechMember();
    }
    @Test
    public static void testCreditCards() throws InterruptedException {
     creditCards();
    }
    @Test
    public static void testGiftCards() throws InterruptedException {
     giftCards();
    }
    @Test
    public static void testGiftIdeas() throws InterruptedException {
        giftIdeas();
    }
    @Test
    public static void testMoreHealthNWellness() throws InterruptedException{
        moreHealthNWellness();
    }
    @Test
    public static void testMoreOutlet() throws InterruptedException{
        moreOutlet();
    }
    @Test
    public static void testMoreClose() throws InterruptedException{
        moreClose();
    }
    @Test
    public static void testBackToSchoolDeals() throws InterruptedException{
        backToSchoolDeals();
    }
    @Test
    public static void testBackToSchoolCollegeResources() throws InterruptedException{
        backToSchoolCollegeResources();
    }
    @Test
    public static void testBackToSchoolK12Tech() throws InterruptedException{
        backToSchoolK12Tech();
    }
    @Test
    public static void testBackToSchoolClose() throws InterruptedException{
        backToSchoolClose();
    }
    @Test
    public static void testBestBuyLogo() throws InterruptedException {
        bestBuyLogo();
    }
    @Test
    public static void testAccountSignIn() throws InterruptedException{
        accountSignIn();
    }
    @Test
    public static void testAccountCreateAccount() throws InterruptedException{
        accountCreateAccount();
    }
    @Test
    public static void testAccountAccount() throws InterruptedException{
        accountAccount();
    }
    @Test
    public static void testAccountAccountSettings() throws InterruptedException{
        accountAccountSettings();
    }
    @Test
    public static void testAccountOrdersNPurchases() throws InterruptedException{
        accountOrdersNPurchases();
    }
    @Test
    public static void testAccountYourProducts() throws InterruptedException{
        accountYourProducts();
    }
    @Test
    public static void testAccountPaymentMethods() throws InterruptedException{
        accountPaymentMethods();
    }
    @Test
    public static void testAccountProtectionPlans() throws InterruptedException{
       accountProtectionPlans();
    }
    @Test
    public static void testAccountDigitalLibrary() throws InterruptedException{
        accountDigitalLibrary();
    }
    @Test
    public static void testAccountFreeHomeConsultation() throws InterruptedException{
        accountFreeHomeConsultation();
    }
    @Test
    public static void testUserAddsToCart() throws InterruptedException {
        userAddsToCart();
    }
}
