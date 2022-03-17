import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class GoToOtherProfilePage extends BasePage{

    FileReaderAndWriter fileReaderAndWriter;
//    By otherProfileName = By.cssSelector("._7UhW9.fKFbl.yUEEX.KV-D4.fDxYl");
//    By otherProfileFollowButton = By.cssSelector("._7UhW9.xLCgt.qyrsm.uL8Hv.T0kll");

    public GoToOtherProfilePage(WebDriver driver) {

        super(driver);
        fileReaderAndWriter = new FileReaderAndWriter(driver);

    }

    public FileReaderAndWriter fileReaderAndWriter(){

        return this.fileReaderAndWriter;

    }

    public void goToProfile() throws IOException {

        fileReaderAndWriter.readFile("NameFollowwer");
        fileReaderAndWriter.read();
        fileReaderAndWriter.writerClose();

    }

//    public void toDoOtherProfilePage(){
//
//        waiting(otherProfileName,5);
//        click(otherProfileFollowButton);
//
//    }

//    public void goToProfile(String text){
//
//        driver.get("https://www.instagram.com/" + text);
//
//    }
}
