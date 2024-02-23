package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {


    }

    public static SignInPage getInstance() {
        SignInPage instance = null;
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By clickSignIn = By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/ul[1]/li[1]/a");
    private By closeNews = By.xpath("//button[@aria-label='Close dialog 1']");
    private By nuMultumesc = By.id("onesignal-slidedown-cancel-button");
    private By InsertEmail = By.id("email");
    private By InsertPassword = By.xpath("//input[@type='password' and @title='Parola']");

    public void clickCloseNews() {
        LOG.info("click close newsletter button");
        driver.findElement(closeNews).click();
    }

    public void clickSignIn() {
        LOG.info("click SingIn button");
        driver.findElement(clickSignIn).click();
    }

    public void clickNuMultumesc(){
        LOG.info("click NuMultumesc button");
        driver.findElement(nuMultumesc).click();
    }

    public void insertemail(String email, String password) {
        LOG.info("Input 'Email adress' in field");
        driver.findElement(InsertEmail).sendKeys(email);
        driver.findElement(InsertPassword).sendKeys(password);

    }

}
