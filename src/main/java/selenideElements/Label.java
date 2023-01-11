package selenideElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Label {
    private SelenideElement label;
    public Label(String value){
        label = $(By.xpath("//label[@id='"+value+"']"));
    }
    public Label(String value, String element){
        label = $(By.xpath("//label[@"+element+"='"+value+"']"));
    }
    public void click(){
        label.click();
    }
    public SelenideElement get(){
        return label;
    }
    public void set(String value) {
        label = $(By.xpath("//label[@id='"+value+"']"));
    }
}
