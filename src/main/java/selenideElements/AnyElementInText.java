package selenideElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AnyElementInText {
    private SelenideElement anyElement;

    public AnyElementInText(String element, String text) {
        anyElement = $(By.xpath("//"+element+"[contains(text(),'"+text+"')]"));
    }

    public String getText() {
        return anyElement.getText();
    }

    public void setValue(String value) {
        anyElement.setValue(value);
    }

    public void click(){
        anyElement.click();
    }

    public void set(String element, String text) {
        anyElement = $(By.xpath("//"+element+"[contains(text(),'"+text+"')]"));
    }
}
