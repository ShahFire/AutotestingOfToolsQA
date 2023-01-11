package tests;

import interfaces.PageAdInterface;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class ElementsCheckBoxTest extends BaseTest implements PageAdInterface {
    @Test
    public void ElementsTextBoxTest() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
    }

    @Step("1. Нажать на категорию \"Elements\" на главной странице, а после нажать на элемент \"Check Box\" в открывшейся левой панели ")
    public void step1(){
        mainPage.ElementsClick();
        leftPanelFrame.CheckBoxLiClick();
    }
    @Step("2. Нажать на кнопку с изображением \"+\"")
    public void step2(){checkBoxPage.expandAllBtnClick();}
    @Step("3. Нажать на ярлык \"React\"")
    public void step3(){checkBoxPage.reactSpanClick();}
    @Step("4. Нажать на ярлык \"Notes\"")
    public void step4(){checkBoxPage.notesSpanClick();}
    @Step("5. Нажать на ярлык \"Private\"")
    public void step5(){checkBoxPage.privateSpanClick();}
    @Step("6. Нажать на ярлык \"Excel File.doc\"")
    public void step6(){checkBoxPage.excelFileSpanClick();}
    @Step("7. Нажать на кнопку с изображением \"-\"")
    public void step7(){checkBoxPage.collapseAllBtnClick();}
}
