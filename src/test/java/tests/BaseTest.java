package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.AddToCart.AddToCart;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.SearchAndFav.SearchAndFav;
import pages.SignInPage.SignInPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public AddToCart addToCart = AddToCart.getInstance();
    public SearchAndFav searchAndFav = SearchAndFav.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}