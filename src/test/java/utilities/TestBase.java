package utilities;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import pages.Card01_Elements01_TextBox_Page;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public Card01_Elements01_TextBox_Page cardElements;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        Driver.getDriver().get(ConfigReader.getProperty("demoqa_url"));

        cardElements = new Card01_Elements01_TextBox_Page();
        actions = new Actions(Driver.getDriver());
        wait = new WebDriverWait(Driver.getDriver(),20);

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
