package tests;

import commonElements.LeftPanelElement;
import io.qameta.allure.Step;
import pages.CheckBoxPage;
import pages.MainPage;

public class ElementsCheckBoxTest {
    @Step("1. Нажать на категорию \"Elements\" на главной странице, а после нажать на элемент \"Check Box\" в открывшейся левой панели ")
    public static void step1(){
        MainPage.ElementsClick();
        LeftPanelElement.CheckBoxLiClick();
    }
    @Step("2. Нажать на кнопку с изображением \"+\"")
    public static void step2(){CheckBoxPage.expandAllBtnClick();}
    @Step("3. Нажать на ярлык \"React\"")
    public static void step3(){CheckBoxPage.reactSpanClick();}
    @Step("4. Нажать на ярлык \"Notes\"")
    public static void step4(){CheckBoxPage.notesSpanClick();}
    @Step("5. Нажать на ярлык \"Private\"")
    public static void step5(){CheckBoxPage.privateSpanClick();}
    @Step("6. Нажать на ярлык \"Excel File.doc\"")
    public static void step6(){CheckBoxPage.excelFileSpanClick();}
    @Step("7. Нажать на кнопку с изображением \"-\"")
    public static void step7(){CheckBoxPage.collapseAllBtnClick();}
}
