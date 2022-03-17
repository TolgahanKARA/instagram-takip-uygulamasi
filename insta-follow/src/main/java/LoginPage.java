import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By userNameLocator = By.name("username");
    By userPassportLocator = By.name("password");
    By loginButton = By.cssSelector(".sqdOP.L3NKy.y3zKF");
    By seePhone = By.className("nLFdg");

    public LoginPage(WebDriver driver) {

        super(driver);

    }

    public void logIn() {

        waiting(seePhone,5);
        click(userNameLocator);
        type(userNameLocator , "5343257568");
        click(userPassportLocator);
        type(userPassportLocator , "h3R_t3!?S4br|y#");
        click(loginButton);

    }
}
