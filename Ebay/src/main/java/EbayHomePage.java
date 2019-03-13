import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage extends BaseCode {

    @FindBy(id="id=gh-logo")
    private WebElement mainLogo;

    @FindBy(id="gh-ac")
    private WebElement search;

    @FindBy(id = "id=gh-btn")
    private WebElement motorList;

    @FindBy(linkText = "My eBay")
    private WebElement personalAccount;

    @FindBy(linkText = "Sell")
    private WebElement transactions;


}
