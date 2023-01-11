package tests;

import interfaces.PageAdInterface;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class ElementsWebTablesTest extends BaseTest{
    @Test
    public void ElementsWebTablesTest() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
        step7();
        step8();
        step9();
        step10();
        step11();
    }
    @Step("1. Нажать на категорию \"Elements\" на главной странице, а после нажать на элемент \"Web Tables\" в открывшейся левой панели ")
    public void step1(){
        mainPage.ElementsClick();
        leftPanelFrame.WebTablesLiClick();
    }
    @Step("2. Нажать на кнопку \"Edit\" первой строки таблицы")
    public void step2(){webTablesPage.EditRecord1Click();}
    @Step("3. Заменить значение поля \"First Name\" на значение \"Артур\"")
    public void step3(){webTablesRegistrationFrame.FirstNameInput("Артур");}
    @Step("4. Заменить значение поля \"LastName\" на значение \"Хушвахтович\"")
    public void step4(){webTablesRegistrationFrame.LastNameInput("Хушвахтович");}
    @Step("5. Заменить значение поля \"Email\" на значение \"shah-fire@mail.ru\"")
    public void step5(){webTablesRegistrationFrame.UserEmailInput("shah-fire@mail.ru");}
    @Step("6. Заменить значение поля \"Age\" на значение \"19\"")
    public void step6(){webTablesRegistrationFrame.AgeInput("19");}
    @Step("7. Заменить значение поля \"Salary\" на значение \"0\"")
    public void step7(){webTablesRegistrationFrame.SalaryInput("0");}
    @Step("8. Заменить значение поля \"Department\" на значение \".Net\"")
    public void step8(){webTablesRegistrationFrame.DepartmentInput(".Net");}
    @Step("9. Нажать на кнопку \"Submit\"")
    public void step9(){webTablesRegistrationFrame.SubmitBtnClick();}
    @Step("10. Нажать на кнопку \"Delete\" третьей строки таблицы")
    public void step10(){webTablesPage.DeleteRecord3Click();}
    @Step("11. Нажать на кнопку \"Delete\" второй строки таблицы")
    public void step11(){webTablesPage.DeleteRecord2Click();}
}
