package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test

    public void signIn() {

        String email = "floryalexe@gmail.com";
        String password = "12345Parola";


        LOG.info("click close Newsletter");
        signInPage.clickCloseNews();

//        LOG.info("click NuMultumesc button");
//        signInPage.clickNuMultumesc();

        LOG.info("click sign in button");
        signInPage.clickSignIn();

        LOG.info("Insert 'Email'");
        signInPage.insertemail(email, password);


    }

}
