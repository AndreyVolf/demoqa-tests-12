package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static  void  setUP() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest(){


        open("/text-box");

        $("[id=userName]").setValue("Dron storm");
        $("[id=userEmail]").setValue("dron@storm.com");
        $("[id=currentAddress]").setValue("Sum street 1");
        $("[id=permanentAddress]").setValue("Another street 2");
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text("Dron storm"), text("dron@storm.com"), text("Sum street 1"),
         text("Another street 2"));

    }

}
