package tests.AddToCartTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class AddToCartTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(AddToCartTest.class);

    @Test
    public void addToCart() {

        String email = "floryalexe@gmail.com";
        String password = "12345Parola";


        LOG.info("click close Newsletter");
        signInPage.clickCloseNews();


        LOG.info("click sign in button");
        signInPage.clickSignIn();

        LOG.info("Insert 'Email'");
        signInPage.insertemail(email, password);

        LOG.info("click Autentificare");
        signInPage.clickAutentificare();

        LOG.info("click on Categorii de produse");
        addToCart.clickCategoriiProduse();


        LOG.info("click on Ceasuri&GPS-uri");
        addToCart.clickCeasuriGPS();


        LOG.info("Click on Ceasuri Sport");
        addToCart.clickCeasuriSport();

//        LOG.info("verifica stocul");
//        Assert.assertTrue(addToCart.verificaStoc(),"Stocul nu este afisat");

        LOG.info("Adauga in cos");
        addToCart.clickAdaugaInCos();

    }


}
