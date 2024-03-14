package tests.SearchAndFavTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.SearchAndFav.SearchAndFav;
import tests.BaseTest;

public class SearchAndFavTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchAndFavTest.class);

    @Test

    public void searchAndFav() {
        String email = "floryalexe@gmail.com";
        String password = "12345Parola";

        String OchelariSnowboard = "POC ZONULA BLUE";

        LOG.info("click close Newsletter");
        signInPage.clickCloseNews();


        LOG.info("click sign in button");
        signInPage.clickSignIn();

        LOG.info("Insert 'Email'");
        signInPage.insertemail(email, password);

        LOG.info("click Autentificare");
        signInPage.clickAutentificare();


        LOG.info("click Search Bar");
        searchAndFav.clickSearchAndFav(OchelariSnowboard);


    }
}
