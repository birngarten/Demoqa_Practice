package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class Card01_Elements01_TextBox_Page {
    public Card01_Elements01_TextBox_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='card-up']")
    public WebElement elementsCard;

    @FindBy(xpath = "//span[.='Text Box']")
    public WebElement textBoxLink;

    @FindBy(xpath = "//label[@class='form-label']")
    public List<WebElement> textBoxElementsList;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitButton;

}
