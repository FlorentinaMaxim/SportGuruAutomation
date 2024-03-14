package pages.SearchAndFav;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SearchAndFav extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(SearchAndFav.class);
    public static SearchAndFav instance;

    private SearchAndFav() {

    }

    public static SearchAndFav getInstance() {
        SearchAndFav instance = null;
        if (instance == null) {
            instance = new SearchAndFav();
        }
        return instance;
    }

    private By SearchBar = By.xpath("//input[@type='search']");
    private By Decline = By.id("CybotCookiebotDialogBodyButtonDecline");
    private By OChelariPoc = By.xpath("//div/img[@alt='Ochelari schi POC Zonula / Partly Sunny Blue']");
    private By AddToFavorite = By.xpath("//a[@class='action towishlist']");
    private By closeNews = By.xpath("//button[@class='needsclick klaviyo-close-form kl-private-reset-css-Xuajs1']");


    public void clickSearchAndFav(String OchelariSnowboard) {
        LOG.info("click Search Bar");
        driver.findElement(Decline).click();
        driver.findElement(SearchBar).click();
        driver.findElement(SearchBar).sendKeys(OchelariSnowboard);
        driver.findElement(OChelariPoc).click();
        driver.findElement(closeNews).click();
        driver.findElement(AddToFavorite).click();
    }
}
