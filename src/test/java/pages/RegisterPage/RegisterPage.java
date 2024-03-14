package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        RegisterPage instance = null;
        if (instance == null) {
            instance = new RegisterPage();

        }
        return instance;
    }

    private By CreeazaUnContNou = By.xpath("//span[text()='Creeaza un cont']");
    private By Decline = By.id("CybotCookiebotDialogBodyButtonDecline");
    private By Prenume = By.id("firstname");
    private By Nume = By.id("lastname");
    private By Email = By.id("email_address");
    private By Parola = By.xpath("//input[@title = 'Parola']");
    private By ConfirmaParola = By.id("password-confirmation");
    private By TermeniSiConditii = By.id("i_agree_new");
    private By CreeazaUnCont = By.xpath("//span[text()='Creeaza un cont']");
    private By AcestaEsteUnCampObligatoriu = By.id("recaptcha-validate--error");



    public void clickCreeazaUnContNou(){
        LOG.info("click Creeaza un cont nou");
        driver.findElement(Decline).click();
        driver.findElement(CreeazaUnContNou).click();
    }

    public void inputRegisterForm(String prenume, String nume, String email, String parola, String confirmare){
        LOG.info("input Registration Page");
        driver.findElement(Prenume).sendKeys(prenume);
        driver.findElement(Nume).sendKeys(nume);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Parola).sendKeys(parola);
        driver.findElement(ConfirmaParola).sendKeys(confirmare);
    }

    public void clickTermeniSiConditii(){
        LOG.info("clickTermeniSiConditii");
        driver.findElement(TermeniSiConditii).click();
    }

   public boolean checkAcestCampEsteObligatoiu(){
        LOG.info("check if the field is displayed");
        return driver.findElement(AcestaEsteUnCampObligatoriu).isDisplayed();

    }

    public void clickCreeazaUnCont(){
        LOG.info("click Creeaza un cont");
        driver.findElement(CreeazaUnCont).click();
    }


    }






