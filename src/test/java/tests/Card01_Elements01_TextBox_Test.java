package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Card01_Elements01_TextBox_Test extends TestBase {


    @Test
    public void TC_01(){
//      User clicks Elements card then "Text Box"
        cardElements.elementsCard.click();
        cardElements.textBoxLink.click();
    }

    @Test
    public void TC_02(){
//       User verifies User Form has headers "Full Name", "Email", "Current Address", "Permanent Address"

        cardElements.elementsCard.click();
        cardElements.textBoxLink.click();

        String [] expectedUserForm = {"Full Name", "Email", "Current Address", "Permanent Address"};
        List<String> list = new ArrayList<>();
        for (String a: expectedUserForm){
            list.add(a);
        }
        System.out.println("list = " + list);


        List<String> textBoxList = new ArrayList<>();
        for (WebElement w: cardElements.textBoxElementsList ){
            textBoxList.add(w.getText());
        }
        Assert.assertEquals(list,textBoxList);

        
      
    }

    @Test
    public void TC_03(){

    }

    @Test
    public void TC_04(){

    }



}
