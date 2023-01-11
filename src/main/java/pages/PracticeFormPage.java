package pages;

import selenideElements.Button;
import selenideElements.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import selenideElements.Label;
import selenideElements.Textarea;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage {
    public Input firstName = new Input("firstName");
    public Input lastName = new Input("lastName");
    public Input userEmail = new Input("userEmail");
    public Label genderMale = new Label("gender-radio-1", "for");
    public Label genderFemale = new Label("gender-radio-2", "for");
    public Label genderOther = new Label("gender-radio-3", "for");
    public Input userNumber = new Input("userNumber");
    public Input dateOfBirthInput = new Input("dateOfBirthInput");
    public Input subjectsInput = new Input("subjectsInput");
    public Label hobbiesCheckbox1 = new Label("hobbies-checkbox-1", "for");
    public Label hobbiesCheckbox2 = new Label("hobbies-checkbox-2", "for");
    public Label hobbiesCheckbox3 = new Label("hobbies-checkbox-3", "for");
    public Input uploadPicture = new Input("uploadPicture");
    public Textarea address = new Textarea("currentAddress");
    public Input stateSelectInput = new Input("react-select-3-input");
    public Input citySelectInput = new Input("react-select-4-input");
    public Button submitBtn = new Button("submit");

    public void FirstNameInput(String text) {firstName.val(text);}
    public void LastNameInput(String text) {lastName.val(text);}
    public void UserEmailInput(String text) {userEmail.val(text);}
    public void GenderMaleClick() {genderMale.click();}
    public void GenderFemaleClick() {genderFemale.click();}
    public void GenderOtherClick() {genderOther.click();}
    public void UserNumberInput(String text) {userNumber.val(text);}
    public void DateOfBirthInput(String text) {
        dateOfBirthInput.get().val(text);
        for(int i = 0; i < text.length(); i++)         //Это вынужденный костыль. Пременён, по причине завершения работы сайта при попытке очистки поля для ввода даты рождения
            dateOfBirthInput.get().sendKeys(Keys.LEFT);           //Тапаю влево ровно столько раз, сколько помещаю символов в value поля
        for(int i = 0; i < 21; i++)         //Удаляю старое значение с запасом
            dateOfBirthInput.get().sendKeys(Keys.BACK_SPACE);
        dateOfBirthInput.get().sendKeys(Keys.RETURN);
    }
    public void SubjectsInput(String text) {
        subjectsInput.val(text);
        subjectsInput.get().sendKeys(Keys.RETURN);
    }
    public void HobbiesCheckbox1Click() {hobbiesCheckbox1.click();}
    public void HobbiesCheckbox2Click() {hobbiesCheckbox2.click();}
    public void HobbiesCheckbox3Click() {hobbiesCheckbox3.click();}
    public void UploadPicture(String img) {uploadPicture.get().sendKeys(img);}
    public void AddressInput(String text) {address.val(text);}
    public void StateSelectInput(String text) {
        stateSelectInput.val(text);
        stateSelectInput.get().sendKeys(Keys.RETURN);
    }
    public void CitySelectInput(String text) {
        citySelectInput.val(text);
        citySelectInput.get().sendKeys(Keys.RETURN);
    }
    public void SubmitBtnClick() {submitBtn.click();}
}