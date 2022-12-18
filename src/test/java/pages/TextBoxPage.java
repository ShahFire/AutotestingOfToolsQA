package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    private static SelenideElement userName = $(By.xpath("//input[@id='userName']"));
    private static SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private static SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private static SelenideElement permanentAddress = $(By.xpath("//textarea[@id='permanentAddress']"));
    private static SelenideElement submitBtn = $(By.xpath("//button[@id='submit']"));

    public static void UserNameInput(String text) {userName.should(Condition.visible).val(text);}
    public static void UserEmailInput(String text) {userEmail.should(Condition.visible).val(text);}
    public static void CurrentAddressInput(String text) {currentAddress.should(Condition.visible).val(text);}
    public static void PermanentAddressInput(String text) {permanentAddress.should(Condition.visible).val(text);}
    public static void SubmitBtnClick() {submitBtn.should(Condition.visible).click();}

}
