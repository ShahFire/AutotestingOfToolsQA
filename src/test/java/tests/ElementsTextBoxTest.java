package tests;

import commonElements.LeftPanelElement;
import io.qameta.allure.Step;
import pages.MainPage;
import pages.TextBoxPage;

public class ElementsTextBoxTest {
    @Step("1. Нажать на категорию \"Elements\" на главной странице, а после нажать на элемент \"Text Box\" в открывшейся левой панели ")
    public static void step1(){
        MainPage.ElementsClick();
        LeftPanelElement.TextBoxLiClick();
    }
    @Step("2. Ввести значение \"Шодиев Артур\" в поле \"Full Name\"")
    public static void step2(){TextBoxPage.UserNameInput("Шодиев Артур");}
    @Step("3. Ввести значение \"shah-fire@mail.ru\" в поле \"Email\" ")
    public static void step3(){TextBoxPage.UserEmailInput("shah-fire@mail.ru");}
    @Step("4. Ввести значение \"Комтрома, Ленина 147, 29\" в текстовую область \"Current Address\" ")
    public static void step4(){TextBoxPage.CurrentAddressInput("Комтрома, Ленина 147, 29");}
    @Step("5. Ввести значение \"Шарья, Калинина 14\" в текстовую область \"Permanent Address\" ")
    public static void step5(){TextBoxPage.PermanentAddressInput("Шарья, Калинина 14");}
    @Step("6. Нажать на кнопку \"Submit\"")
    public static void step6(){TextBoxPage.SubmitBtnClick();}
}
