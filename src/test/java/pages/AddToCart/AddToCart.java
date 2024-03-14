package pages.AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class AddToCart extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AddToCart.class);
    public static AddToCart instance;

    private AddToCart() {

    }

    public static AddToCart getInstance() {
        AddToCart instance = null;
        if (instance == null) {
            instance = new AddToCart();
        }

        return instance;

    }

    private By CategoriiProduse = By.id("menu-holder");
    private By Decline = By.id("CybotCookiebotDialogBodyButtonDecline");
    private By CeasuriGPS = By.xpath("//span[text()='Ceasuri & GPS-uri']");
    private By closeNews = By.xpath("//button[@class='needsclick klaviyo-close-form kl-private-reset-css-Xuajs1']");
    private By CeasuriSport = By.xpath("//div[@class='content-img-title']//span[text()='Ceasuri sport']");
    private By CeasuriSportDama = By.xpath("//div[@class='content-img-title']//span[text()='Ceasuri sport dama']");
    private By FiltruProducator = By.xpath("//div[@data-role='title' and text()='Producator']");
    private By CheckBoxSunto = By.xpath("//a/span[text()='Suunto']");
    private By CeasVisiniu = By.xpath("//h2/a[text()='Ceas Suunto Vertical Sapphire Visiniu']");
    private By CheckStoc = By.xpath("//div[@class='stock in-stoc-furnizor']");
    private By AdaugaInCos = By.xpath("//span[text()='Adauga in cos']");
    private By VeziCos = By.xpath("//button[@title='Vezi Cos']");

    public void clickCategoriiProduse() {
        LOG.info("click on Categorii de produse");
        driver.findElement(Decline).click();
//        driver.findElement(closeNews).click();
//        driver.findElement(CategoriiProduse).click();
    }

    public void clickCeasuriGPS(){
        LOG.info("click on Ceasuri&GPS-uri");
        driver.findElement(CeasuriGPS).click();
    }

    public void clickCeasuriSport(){
        LOG.info("Click on Ceasuri Sport");
        driver.findElement(closeNews).click();
        driver.findElement(CeasuriSport).click();
        driver.findElement(CeasuriSportDama).click();
        driver.findElement(FiltruProducator).click();
        driver.findElement(CheckBoxSunto).click();
        driver.findElement(CeasVisiniu).click();
    }

    public boolean verificaStoc(){
        LOG.info("Verifica daca este in stocul furnizorului");
        return driver.findElement(CheckStoc).isDisplayed();
    }

    public void clickAdaugaInCos(){
        LOG.info("Click adauga in cos");
        driver.findElement(AdaugaInCos).click();
        driver.findElement(VeziCos).click();

    }

}