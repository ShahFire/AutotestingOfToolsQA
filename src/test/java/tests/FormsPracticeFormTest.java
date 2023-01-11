package tests;

import interfaces.PageAdInterface;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class FormsPracticeFormTest extends BaseTest{
    @Test
    public void FormsPracticeFormTest() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
        step7();
        step8();
        //step9();    Раскомментировать только в том случае, если файл EmperorOfMankind.jpg был добавлен по пути "C:\"
        step10();
        step11();
        step12();
        step13();
        step14();
    }

    private String emperorJpg = "C://EmperorOfMankind.jpg";
    @Step("1. Нажать на категорию \"Forms\" на главной странице, а после нажать на элемент \"Practice Form\" в открывшейся левой панели элементов")
    public void step1(){
        mainPage.FormsClick();
        leftPanelFrame.PracticeFormLiClick();
    }
    @Step("2. Ввести значение \"Артур\" в поле \"First Name\", а также значение \"Хушвахтович\" в поле \"Last Name\" ")
    public void step2(){
        practiceFormPage.FirstNameInput("Артур");
        practiceFormPage.LastNameInput("Хушвахтович");
    }
    @Step("3. Ввести значение \"shah-fire@mail.ru\" в поле \"Email\" ")
    public void step3(){practiceFormPage.UserEmailInput("shah-fire@mail.ru");}
    @Step("4. Нажать на ярлык \"Male\"")
    public void step4(){
        practiceFormPage.GenderOtherClick();
        practiceFormPage.GenderFemaleClick();
        practiceFormPage.GenderMaleClick();
    }
    @Step("5. Ввести значение \"9103742831\" в поле \"Mobile\"")
    public void step5(){practiceFormPage.UserNumberInput("9103742831");}
    @Step("6. Ввести значение \"05 Jan 2003\" в поле \"Date of Birth\"")
    public void step6(){practiceFormPage.DateOfBirthInput("05 Jan 2003");}
    @Step("7. Ввести значение \"Social Studies\" в поле \"Subjects\"")
    public void step7(){practiceFormPage.SubjectsInput("Social Studies");}
    @Step("8. Нажать на ярлыки \"Sports\", \"Reading\" и \"Music\"")
    public void step8(){
        practiceFormPage.HobbiesCheckbox1Click();
        practiceFormPage.HobbiesCheckbox2Click();
        practiceFormPage.HobbiesCheckbox3Click();
    }
    @Step("9. Вставить файл \"EmperorOfMankind.jpg\" в поле для ввода файлов \"uploadPicture\"")
    public void step9(){
        practiceFormPage.UploadPicture(emperorJpg);
    }
    @Step("10. Ввести значение \"147 Lenin Street\" в текстовую область \"Current Address\" ")
    public void step10(){practiceFormPage.AddressInput("147 Lenin Street");}
    @Step("11. Ввести значение \"NCR\" в поле \"Select State\"")
    public void step11(){practiceFormPage.StateSelectInput("NCR");}
    @Step("12. Ввести значение \"Noida\" в поле \"Select City\"")
    public void step12(){practiceFormPage.CitySelectInput("Noida");}
    @Step("13. Нажать на кнопку \"Submit\"")
    public void step13(){practiceFormPage.SubmitBtnClick();}
    @Step("14. Нажать на кнопку \"Close\"")
    public void step14(){automationPracticeFormFrame.closeLargeModalBtnClick();}
}
