import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OtherProfilePage extends BasePage{

    By optionButton = By.className("VMs3J");
    By folpofolButtons = By.className("Y8-fY");

    public OtherProfilePage(WebDriver driver) {

        super(driver);

    }

    public boolean isOtherProfilePage() {

        waiting(optionButton,5);
        return isDisplayed(optionButton);

    }

    public void selectedFollowers() {

        selectedFollowButton().get(1).click();

    }

    private List<WebElement> selectedFollowButton(){

        return findAll(folpofolButtons);

    }
}
