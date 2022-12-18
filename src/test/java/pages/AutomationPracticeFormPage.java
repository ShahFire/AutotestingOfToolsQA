package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AutomationPracticeFormPage {
    private static SelenideElement closeLargeModalBtn = $(By.xpath("//button[@id='closeLargeModal']"));

    public static void closeLargeModalBtnClick() {closeLargeModalBtn.should(Condition.visible).click();}
}
