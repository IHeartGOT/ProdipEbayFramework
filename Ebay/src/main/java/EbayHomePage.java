import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage extends BaseCode {

    @FindBy(xpath="//a[@title='Sign In']")
    private WebElement signInTab;

    @FindBy(name = "search")
    private WebElement contactUsTab;

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

//    @FindBy(xpath = "//a[@title='Women']")
}
