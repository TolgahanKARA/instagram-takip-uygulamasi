import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class Test_Login_Follow extends BaseTest{

    LoginPage loginPage;
    PopupPage closePopup;
    HomePage homePage;
    OtherProfilePage otherProfilePage;
    GoToOtherProfilePage goToOtherProfilePage;

    @Test
    @Order(1)
    public void logIn() throws IOException {

        loginPage = new LoginPage(driver);
        loginPage.logIn();
        closePopup = new PopupPage(driver);
        closePopup.closeInformation();
        closePopup.closeNotifications();
        homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.isHomePage(),
                "you are not homepage");

    }

    @Test
    @Order(2)
    public void selectPost(){

        homePage.selectedPost();
        otherProfilePage = new OtherProfilePage(driver);
        Assertions.assertTrue(otherProfilePage.isOtherProfilePage(),
                "you are not other profile page");

    }

    @Test
    @Order(3)
    public void selectOtherFollowers() throws IOException {

        otherProfilePage.selectedFollowers();
        Assertions.assertTrue(closePopup.isFollowersPopup(),
                "you are not see followers popup");
        closePopup.saveFollowers();

    }

    @Test
    @Order(4)
    public void goToProfile() throws IOException {

        goToOtherProfilePage = new GoToOtherProfilePage(driver);
        goToOtherProfilePage.goToProfile();
        //goToOtherProfilePage.toDoOtherProfilePage();

    }

}
