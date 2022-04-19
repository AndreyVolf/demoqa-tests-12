package docs;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;


public class CssXpathcTestxamples1 {

    String firstName = "Dron",
            lastName = "storm",
            email = "dron@storm.com";

    String expectedFullName = format ("%s %s", firstName, lastName);


    @BeforeAll
    static  void   BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }


    @Test
    //void parameters() {
    void parameters(){
        String foto = "Lesson_2.JPG";

        open("/automation-practice-form");

        open("/automation-practice-form");

        $("[id=firstName]").setValue("firstName");
        $("[id=lastName]").setValue("storm");
        $("[id=userEmail]").setValue("email");
        $("[class=custom-control-label]").click();
        $("[id=userNumber]").setValue("896721888");
        $("[id=dateOfBirthInput]").click(); // Ввод даты рождения
        $(".react-datepicker__month-select").selectOption("October"); //Выбор месяца
        $(".react-datepicker__year-select").selectOption("1993"); //Выбор года
        $("[aria-label$='October 27th, 1993']").click();
        $("[id=subjectsInput]").setValue("Maths").pressEnter();
        $(byText("Sports")).click();
        $("[id=uploadPicture]").uploadFromClasspath(foto); //Выбор картинки
        $("[id=currentAddress]").setValue("Stalin street 37"); //Ввод улицы
        $("[id=state]").click(); // Выбор государства
        $(byText("NCR")).click();
        $("[id=city]").click(); // Выбор города
        $(byText("Delhi")).click();
        $("[id=submit]").click(); //Подтверждение регистрации


      //  $("[id=output]"
                $(".table-responsive").shouldHave(text("firstName"),text("lastNAme"), text("email"), text("896721888"),
                text("Maths"),text("Stalin street 37"),text("NCR"),text("Delhi"));

        $("#closeLargeModal").click();


    }
}
