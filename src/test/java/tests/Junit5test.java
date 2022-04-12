package tests;

import org.junit.jupiter.api.*;

public class Junit5test {

    @BeforeAll
     static  void  initDB () {
        System.out.println("### @BeforeAll");

    }


    @BeforeEach
    void openYaPage() {
        System.out.println("###    @BeforeEach");
 //       Selenide.open("http://ya.ru");
    }

    @AfterEach
    void close() {
        System.out.println("###    @AfterEach");
//        WebDriverRunner.closeWindow();
    }

    @AfterAll
    static  void  cleanDB () {
        System.out.println("### @AfterAll");

    }

    @Test
    void assertTest1() {
        System.out.println("###         @Test0");
        //... Поиск в новостях
    }

    @Test
    void assertTest2() {
        System.out.println("###         @Test1");
        //... Поиск в картинках
    }

    @Test
    void assertTest3() {
        System.out.println("###         @Test2");
        //... Поиск в новостях
    }

    @Test
    void assertTest4() {
        System.out.println("###         @Test3");
        //... Поиск в картинках
    }
}

