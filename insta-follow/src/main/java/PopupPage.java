import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class PopupPage extends BasePage{

    Scroll scroll;
    FileReaderAndWriter fileReaderAndWriter;
    int sayac = 0;
    By InformationPopupClose = By.className("yWX7d");
    By saveYourLoginInfo = By.className("olLwo");
    By notificationLogoLocator = By.className("G3yoz");
    By notificationCloseButton = By.className("HoLwm");
    By followersPopup = By.cssSelector(".pbNvD.fPMEg");
    By followersPopupScroll = By.className("isgrP");
    By followersName = By.cssSelector("._7UhW9.xLCgt.qyrsm.KV-D4.se6yk.T0kll");

    public PopupPage(WebDriver driver) {

        super(driver);
        scroll = new Scroll(driver);
        fileReaderAndWriter = new FileReaderAndWriter(driver);

    }

    public void closeInformation() {

        waiting(saveYourLoginInfo,4);
        click(InformationPopupClose);

    }

    public void closeNotifications() {

        waiting(notificationLogoLocator,4);
        click(notificationCloseButton);

    }

    public boolean isFollowersPopup() {

        waiting(followersPopup,4);
        return isDisplayed(followersPopup);
        
    }

    public void saveFollowers() throws IOException {

        click(followersPopupScroll);
        for (WebElement followerName: findAll(followersName)) {

            //FileReaderAndWriter.writer(followerName.getText() + "\n");
            fileReaderAndWriter.createFile("NameFollowwer");
            System.out.println(followerName.getText());
            fileReaderAndWriter.writer(followerName.getText() + "\n");
            fileReaderAndWriter.writerClose();
        }


    }

    private List<WebElement> allFollowerName(){

        return findAll(followersName);

    }
}
