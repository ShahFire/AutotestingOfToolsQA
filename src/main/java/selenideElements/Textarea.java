package selenideElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Textarea {
    private SelenideElement textarea;
    public Textarea(String value){
        textarea = $(By.xpath("//textarea[@id='"+value+"']"));
    }
    public Textarea(String value, String element){
        textarea = $(By.xpath("//textarea[@"+element+"='"+value+"']"));
    }
    public void click(){
        textarea.click();
    }
    public void val(String text){
        textarea.val(text);
    }
    public SelenideElement get(){
        return textarea;
    }
    public void set(String value) {
        textarea = $(By.xpath("//textarea[@id='"+value+"']"));
    }
}
