package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import frames.LeftPanelFrame;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class SelenideCollectionTest extends BaseTest{
    @Test
    public  void openAllLi1() {
        step1();
        step2();
    }

    @Step("1. Нажать на категорию \"Forms\" на главной странице")
    public void step1(){
        mainPage.FormsClick();
    }
    @Step("2. Перебрать все элементы левой панели")
    public void step2(){
        LeftPanelFrame.EnumerationLeftPanelElements();
    }
}
