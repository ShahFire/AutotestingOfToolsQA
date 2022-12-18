package tests;

import commonElements.LeftPanelElement;
import io.qameta.allure.Step;
import pages.AutomationPracticeFormPage;
import pages.MainPage;
import pages.PracticeFormPage;

public class FormsPracticeFormTest {
    static String emperorJpg = "C://EmperorOfMankind.jpg";
    @Step("1. Нажать на категорию \"Forms\" на главной странице, а после нажать на элемент \"Practice Form\" в открывшейся левой панели элементов")
    public static void step1(){
        MainPage.FormsClick();
        LeftPanelElement.PracticeFormLiClick();
    }
    @Step("2. Ввести значение \"Артур\" в поле \"First Name\", а также значение \"Хушвахтович\" в поле \"Last Name\" ")
    public static void step2(){
        PracticeFormPage.FirstNameInput("Артур");
        PracticeFormPage.LastNameInput("Хушвахтович");
    }
    @Step("3. Ввести значение \"shah-fire@mail.ru\" в поле \"Email\" ")
    public static void step3(){PracticeFormPage.UserEmailInput("shah-fire@mail.ru");}
    @Step("4. Нажать на ярлык \"Male\"")
    public static void step4(){
        PracticeFormPage.GenderOtherClick();
        PracticeFormPage.GenderFemaleClick();
        PracticeFormPage.GenderMaleClick();
    }
    @Step("5. Ввести значение \"9103742831\" в поле \"Mobile\"")
    public static void step5(){PracticeFormPage.UserNumberInput("9103742831");}
    @Step("6. Ввести значение \"05 Jan 2003\" в поле \"Date of Birth\"")
    public static void step6(){PracticeFormPage.DateOfBirthInput("05 Jan 2003");}
    @Step("7. Ввести значение \"Social Studies\" в поле \"Subjects\"")
    public static void step7(){PracticeFormPage.SubjectsInput("Social Studies");}
    @Step("8. Нажать на ярлыки \"Sports\", \"Reading\" и \"Music\"")
    public static void step8(){
        PracticeFormPage.HobbiesCheckbox1Click();
        PracticeFormPage.HobbiesCheckbox2Click();
        PracticeFormPage.HobbiesCheckbox3Click();
    }
    @Step("9. Вставить файл \"EmperorOfMankind.jpg\" в поле для ввода файлов \"uploadPicture\"")
    public static void step9(){
        PracticeFormPage.UploadPicture(emperorJpg);
    }
    @Step("10. Ввести значение \"147 Lenin Street\" в текстовую область \"Current Address\" ")
    public static void step10(){PracticeFormPage.AddressInput("147 Lenin Street");}
    @Step("11. Ввести значение \"NCR\" в поле \"Select State\"")
    public static void step11(){PracticeFormPage.StateSelectInput("NCR");}
    @Step("12. Ввести значение \"Noida\" в поле \"Select City\"")
    public static void step12(){PracticeFormPage.CitySelectInput("Noida");}
    @Step("13. Нажать на кнопку \"Submit\"")
    public static void step13(){PracticeFormPage.SubmitBtnClick();}
    @Step("14. Нажать на кнопку \"Close\"")
    public static void step14(){AutomationPracticeFormPage.closeLargeModalBtnClick();}
}
