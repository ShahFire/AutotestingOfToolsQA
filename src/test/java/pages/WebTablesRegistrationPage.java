package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesRegistrationPage {
    private static SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    private static SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    private static SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private static SelenideElement age = $(By.xpath("//input[@id='age']"));
    private static SelenideElement salary = $(By.xpath("//input[@id='salary']"));
    private static SelenideElement department = $(By.xpath("//input[@id='department']"));
    private static SelenideElement submitBtn = $(By.xpath("//button[@id='submit']"));

    public static void FirstNameInput(String text) {firstName.should(Condition.visible).val(text);}
    public static void LastNameInput(String text) {lastName.should(Condition.visible).val(text);}
    public static void UserEmailInput(String text) {userEmail.should(Condition.visible).val(text);}
    public static void AgeInput(String text) {age.should(Condition.visible).val(text);}
    public static void SalaryInput(String text) {salary.should(Condition.visible).val(text);}
    public static void DepartmentInput(String text) {department.should(Condition.visible).val(text);}
    public static void SubmitBtnClick() {submitBtn.should(Condition.visible).click();}
}
