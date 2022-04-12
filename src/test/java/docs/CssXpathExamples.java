package docs;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;




public class CssXpathExamples {
    @BeforeAll
    static  void  setUP() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }


    @Test
    //void CssXpathExamples() {
    void fillFormTest(){


        open("/automation-practice-form");

        $("[id=userName]").setValue("Dron");
        $("[id=lastName]").setValue("storm");
        $("[id=userEmail]").setValue("dron@storm.com");
        $("[class=custom-control-label]").click();
        $("[class=mr-sm-2 form-control]").setValue("896721888");
        $("[id=dateOfBirthInput]").selectOption("Apr");
        $("[id=subjectsWrapper]").setValue("Maths");
        $("[class=custom-control custom-checkbox custom-control-inline]").click();
        $("[id=uploadPicture]").click();
        $("[id=currentAddress-label]").setValue("Hallo");
        $("[class=css-1g6gooi]").setValue("NCR");
        $("[css-1uccc91-singleValue]").setValue("Delhi");


        $("[id=output]").shouldHave(text("Dron"),text("storm"), text("dron@storm.com"), text("896721888"),
                text("Maths"),text("Hallo"),text("NCR"),text("Delhi"));




    }
}
