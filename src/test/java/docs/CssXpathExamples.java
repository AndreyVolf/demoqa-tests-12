package docs;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
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
    //void parameters() {
    void parameters(){


        open("/automation-practice-form");

        $("[id=firstName]").setValue("Dron");
        $("[id=lastName]").setValue("storm");
        $("[id=userEmail]").setValue("dron@storm.com");
        $("[class=custom-control-label]").click();
        $("[id=userNumber]").setValue("896721888");
        $(".react-datepicker__month-select").selectOption("July");
        $("[class=mt-2 row]").setValue("Maths");
        $("[class=custom-control custom-checkbox custom-control-inline]").click();
        $("[id=uploadPicture]").click();
        $("[id=currentAddress-label]").setValue("Hallo");
        $("[class=css-1g6gooi]").setValue("NCR");
        $("[css-1uccc91-singleValue]").setValue("Delhi");


        $("[id=output]").shouldHave(text("Dron"),text("storm"), text("dron@storm.com"), text("896721888"),
                text("Maths"),text("Hallo"),text("NCR"),text("Delhi"));




    }
}
