import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.Assert.assertTrue;

public class YoutubePage {
    public void youtubeInPageIsOpen(){
        switchTo().window(1);
        assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains("youtube.com"));
    }
}
