package selenideElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Span {
    private SelenideElement span;
    public Span(String value){
        span = $(By.xpath("//span[@id='"+value+"']"));
    }
    public Span(String value, String element){
        span = $(By.xpath("//span[@"+element+"='"+value+"']"));
    }
    public void click(){
        span.click();
    }
    public SelenideElement get(){
        return span;
    }
    public void set(String value) {
        span = $(By.xpath("//span[@id='"+value+"']"));
    }
}
