package tests;

import interfaces.PageAdInterface;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class ElementsRadioButtonTest extends BaseTest{
    @Test
    public void ElementsRadioButtonTest() {
        step1();
        step2();
    }

    @Step("1. Нажать на категорию \"Elements\" на главной странице, а после нажать на элемент \"Radio Button\" в открывшейся левой панели ")
    public void step1(){
        mainPage.ElementsClick();
        leftPanelFrame.RadioButtonLiClick();
    }
    @Step("2. Нажать на ярлык \"Yes\"")
    public void step2(){radioButtonPage.yesRadioInputClick();}
}
