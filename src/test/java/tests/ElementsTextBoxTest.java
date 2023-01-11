package tests;

import interfaces.PageAdInterface;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class ElementsTextBoxTest extends BaseTest{
    @Test
    public void ElementsCheckBoxTest() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
    }
    @Step("1. Нажать на категорию \"Elements\" на главной странице, а после нажать на элемент \"Text Box\" в открывшейся левой панели ")
    public void step1(){
        mainPage.ElementsClick();
        leftPanelFrame.TextBoxLiClick();
    }
    @Step("2. Ввести значение \"Шодиев Артур\" в поле \"Full Name\"")
    public void step2(){textBoxPage.UserNameInput("Шодиев Артур");}
    @Step("3. Ввести значение \"shah-fire@mail.ru\" в поле \"Email\" ")
    public void step3(){textBoxPage.UserEmailInput("shah-fire@mail.ru");}
    @Step("4. Ввести значение \"Комтрома, Ленина 147, 29\" в текстовую область \"Current Address\" ")
    public void step4(){textBoxPage.CurrentAddressInput("Комтрома, Ленина 147, 29");}
    @Step("5. Ввести значение \"Шарья, Калинина 14\" в текстовую область \"Permanent Address\" ")
    public void step5(){textBoxPage.PermanentAddressInput("Шарья, Калинина 14");}
    @Step("6. Нажать на кнопку \"Submit\"")
    public void step6(){textBoxPage.SubmitBtnClick();}
}
