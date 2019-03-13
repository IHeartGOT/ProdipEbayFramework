import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestEbay extends BaseCode{

    String homepageUrl = "http://www.ebay.com";
    EbayHomePage homePage;


    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, EbayHomePage.class);
    }

    @Test
    public void testUserCanNavigateToHomePage() {
        String homepageTitle = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
        Assert.assertEquals(this.driver.getTitle(), homepageTitle);
    }

    /*@Test
    public void testUserCanNavigateToTheSignInPage() {
        this.homePage.;
        String signInPageUrl =
                "http://www.hbo.com";
        Assert.assertEquals(this.driver.getCurrentUrl(), signInPageUrl);
    }
*/
   /* @Test
    public void testUserCanSearchForDresses() {
        this.homePage.searchFor("dresses");
    }*/

}

