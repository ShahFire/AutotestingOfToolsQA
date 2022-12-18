package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage {
    private static SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    private static SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    private static SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private static SelenideElement genderMale = $(By.xpath("//label[@for='gender-radio-1']"));
    private static SelenideElement genderFemale = $(By.xpath("//label[@for='gender-radio-2']"));
    private static SelenideElement genderOther = $(By.xpath("//label[@for='gender-radio-3']"));
    private static SelenideElement userNumber = $(By.xpath("//input[@id='userNumber']"));
    private static SelenideElement dateOfBirthInput = $(By.xpath("//input[@id='dateOfBirthInput']"));
    private static SelenideElement subjectsInput = $(By.xpath("//input[@id='subjectsInput']"));
    private static SelenideElement hobbiesCheckbox1 = $(By.xpath("//label[@for='hobbies-checkbox-1']"));
    private static SelenideElement hobbiesCheckbox2 = $(By.xpath("//label[@for='hobbies-checkbox-2']"));
    private static SelenideElement hobbiesCheckbox3 = $(By.xpath("//label[@for='hobbies-checkbox-3']"));
    private static SelenideElement uploadPicture = $(By.xpath("//input[@id='uploadPicture']"));
    private static SelenideElement address = $(By.xpath("//textarea[@id='currentAddress']"));
    private static SelenideElement stateSelectInput = $(By.xpath("//input[@id='react-select-3-input']"));
    private static SelenideElement citySelectInput = $(By.xpath("//input[@id='react-select-4-input']"));
    private static SelenideElement submitBtn = $(By.xpath("//button[@id='submit']"));

    public static void FirstNameInput(String text) {firstName.should(Condition.visible).val(text);}
    public static void LastNameInput(String text) {lastName.should(Condition.visible).val(text);}
    public static void UserEmailInput(String text) {userEmail.should(Condition.visible).val(text);}
    public static void GenderMaleClick() {genderMale.should(Condition.visible).click();}
    public static void GenderFemaleClick() {genderFemale.should(Condition.visible).click();}
    public static void GenderOtherClick() {genderOther.should(Condition.visible).click();}
    public static void UserNumberInput(String text) {userNumber.should(Condition.visible).val(text);}
    public static void DateOfBirthInput(String text) {
        dateOfBirthInput.should(Condition.visible).val(text);
        for(int i = 0; i < text.length(); i++)         //Это вынужденный костыль. Пременён, по причине завершения работы сайта при попытке очистки поля для ввода даты рождения
            dateOfBirthInput.sendKeys(Keys.LEFT);           //Тапаю влево ровно столько раз, сколько помещаю символов в value поля
        for(int i = 0; i < 21; i++)         //Удаляю старое значение с запасом
            dateOfBirthInput.sendKeys(Keys.BACK_SPACE);
        dateOfBirthInput.sendKeys(Keys.RETURN);
    }
    public static void SubjectsInput(String text) {
        subjectsInput.should(Condition.visible).val(text);
        subjectsInput.sendKeys(Keys.RETURN);
    }
    public static void HobbiesCheckbox1Click() {hobbiesCheckbox1.should(Condition.visible).click();}
    public static void HobbiesCheckbox2Click() {hobbiesCheckbox2.should(Condition.visible).click();}
    public static void HobbiesCheckbox3Click() {hobbiesCheckbox3.should(Condition.visible).click();}
    public static void UploadPicture(String img) {uploadPicture.sendKeys(img);}
    public static void AddressInput(String text) {address.should(Condition.visible).val(text);}
    public static void StateSelectInput(String text) {
        stateSelectInput.should(Condition.visible).val(text);
        stateSelectInput.sendKeys(Keys.RETURN);
    }
    public static void CitySelectInput(String text) {
        citySelectInput.should(Condition.visible).val(text);
        citySelectInput.sendKeys(Keys.RETURN);
    }
    public static void SubmitBtnClick() {submitBtn.should(Condition.visible).click();}
}