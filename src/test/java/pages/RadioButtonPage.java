package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RadioButtonPage {
    private static SelenideElement yesRadioLabel = $(By.xpath("//label[@for='yesRadio']"));

    public static void yesRadioInputClick() {yesRadioLabel.should(Condition.visible).click();}
}
