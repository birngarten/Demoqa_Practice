package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Card01_Elements01_TextBox_Test extends TestBase {

    @BeforeMethod
    public void setUp(){
        cardElements.elementsCard.click();
    }

    @Test
    public void TC_01(){
//      User clicks Elements card then "Text Box"

        cardElements.textBoxLink.click();
    }

    @Test
    public void TC_02(){
//       User verifies User Form has headers "Full Name", "Email", "Current Address", "Permanent Address"

        cardElements.textBoxLink.click();

        String [] expectedUserForm = {"Full Name", "Email", "Current Address", "Permanent Address"};
        List<String> list = new ArrayList<>();
        for (String a: expectedUserForm){
            list.add(a);
        }

        List<String> textBoxList = new ArrayList<>();
        for (WebElement w: cardElements.textBoxElementsList ){
            textBoxList.add(w.getText());
        }
        Assert.assertEquals(list,textBoxList);
      
    }

    @Test
    public void TC_03(){
//        User verifies that data can be entered into textboxes
        cardElements.textBoxLink.click();
        for (WebElement w: cardElements.textBoxElementsList){
            Assert.assertTrue(w.isEnabled());
        }

    }

    @Test
    public void TC_04(){
//        The user verifies that the button is clickable.
        cardElements.textBoxLink.click();
            Assert.assertTrue(cardElements.submitButton.isEnabled());

    }
}
