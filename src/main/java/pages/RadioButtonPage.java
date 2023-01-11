package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenideElements.Input;
import selenideElements.Label;

import static com.codeborne.selenide.Selenide.$;

public class RadioButtonPage {
    public Label yesRadioLabel = new Label("yesRadio", "for");

    public void yesRadioInputClick() {yesRadioLabel.click();}
}
