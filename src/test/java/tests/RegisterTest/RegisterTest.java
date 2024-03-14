package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);


    @Test

    public void register(){

        String Prenume = "Ion";
        String nume = "Popescu";
        String email = "popescuion@gmail.com";
        String parola = "12345parola";
        String confirmarea = "12345parola";

        LOG.info("click close Newsletter");
        signInPage.clickCloseNews();


        LOG.info("click sign in button");
        signInPage.clickSignIn();


        LOG.info("click Creeaza un cont nou");
        registerPage.clickCreeazaUnContNou();

        LOG.info("input Registration Form");
        signInPage.clickCloseNews();
        registerPage.inputRegisterForm(Prenume, nume, email, parola, confirmarea);

        LOG.info("Termeni si Conditii");
        registerPage.clickTermeniSiConditii();

        LOG.info("Creeaza un cont nou");
        registerPage.clickCreeazaUnCont();

        LOG.info("Check if the text is displayed");
        Assert.assertTrue(registerPage.checkAcestCampEsteObligatoiu(),"Text is not displayed");



    }



}