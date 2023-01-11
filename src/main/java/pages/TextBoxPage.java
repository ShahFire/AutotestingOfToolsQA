package pages;

import selenideElements.Button;
import selenideElements.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenideElements.Textarea;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    public Input userName = new Input("userName");
    public Input userEmail = new Input("userEmail");
    public Textarea currentAddress = new Textarea("currentAddress");
    public Textarea permanentAddress = new Textarea("permanentAddress");
    public Button submitBtn = new Button("submit");

    public void UserNameInput(String text) {userName.val(text);}
    public void UserEmailInput(String text) {userEmail.val(text);}
    public void CurrentAddressInput(String text) {currentAddress.val(text);}
    public void PermanentAddressInput(String text) {permanentAddress.val(text);}
    public void SubmitBtnClick() {submitBtn.click();}

}
