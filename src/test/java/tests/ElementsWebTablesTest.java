package tests;

import commonElements.LeftPanelElement;
import io.qameta.allure.Step;
import pages.MainPage;
import pages.WebTablesPage;
import pages.WebTablesRegistrationPage;

public class ElementsWebTablesTest {
    @Step("1. Нажать на категорию \"Elements\" на главной странице, а после нажать на элемент \"Web Tables\" в открывшейся левой панели ")
    public static void step1(){
        MainPage.ElementsClick();
        LeftPanelElement.WebTablesLiClick();
    }
    @Step("2. Нажать на кнопку \"Edit\" первой строки таблицы")
    public static void step2(){WebTablesPage.EditRecord1Click();}
    @Step("3. Заменить значение поля \"First Name\" на значение \"Артур\"")
    public static void step3(){WebTablesRegistrationPage.FirstNameInput("Артур");}
    @Step("4. Заменить значение поля \"LastName\" на значение \"Хушвахтович\"")
    public static void step4(){WebTablesRegistrationPage.LastNameInput("Хушвахтович");}
    @Step("5. Заменить значение поля \"Email\" на значение \"shah-fire@mail.ru\"")
    public static void step5(){WebTablesRegistrationPage.UserEmailInput("shah-fire@mail.ru");}
    @Step("6. Заменить значение поля \"Age\" на значение \"19\"")
    public static void step6(){WebTablesRegistrationPage.AgeInput("19");}
    @Step("7. Заменить значение поля \"Salary\" на значение \"0\"")
    public static void step7(){WebTablesRegistrationPage.SalaryInput("0");}
    @Step("8. Заменить значение поля \"Department\" на значение \".Net\"")
    public static void step8(){WebTablesRegistrationPage.DepartmentInput(".Net");}
    @Step("9. Нажать на кнопку \"Submit\"")
    public static void step9(){WebTablesRegistrationPage.SubmitBtnClick();}
    @Step("10. Нажать на кнопку \"Delete\" третьей строки таблицы")
    public static void step10(){WebTablesPage.DeleteRecord3Click();}
    @Step("11. Нажать на кнопку \"Delete\" второй строки таблицы")
    public static void step11(){WebTablesPage.DeleteRecord2Click();}
}
