package tests;

import commonElements.LeftPanelElement;
import io.qameta.allure.Step;
import pages.MainPage;
import pages.RadioButtonPage;

public class ElementsRadioButtonTest {
    @Step("1. Нажать на категорию \"Elements\" на главной странице, а после нажать на элемент \"Radio Button\" в открывшейся левой панели ")
    public static void step1(){
        MainPage.ElementsClick();
        LeftPanelElement.RadioButtonLiClick();
    }
    @Step("2. Нажать на ярлык \"Yes\"")
    public static void step2(){RadioButtonPage.yesRadioInputClick();}
}
