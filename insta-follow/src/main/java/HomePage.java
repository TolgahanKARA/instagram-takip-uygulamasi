import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    By instagramFromMeta = By.className("DINPA");
    By posts = By.cssSelector(".sqdOP.yWX7d._8A5w5.ZIAjV");
    
    public HomePage(WebDriver driver) {
        
        super(driver);
        
    }

    public boolean isHomePage() {
        
        return isDisplayed(instagramFromMeta);
        
    }

    public void selectedPost() {

        allPosts().get(0).click();

    }

    private List<WebElement>allPosts(){

        return findAll(posts);

    }
}
