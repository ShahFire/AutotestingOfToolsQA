package selenideElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Input {
    private SelenideElement input;

    public Input(String value) {
        input = $(By.xpath("//input[@id='" + value + "']"));
    }

    public Input(String value, String element) {
        input = $(By.xpath("//input[@"+element+"='"+value+"']"));
    }

    public SelenideElement get() {
        return input;
    }
    public void click(){
        input.click();
    }

    public void val(String text){
        input.val(text);
    }

    public void set(String value) {
        input = $(By.xpath("//input[@id='"+value+"']"));
    }
}
