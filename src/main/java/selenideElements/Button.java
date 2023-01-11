package selenideElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Button{
    private SelenideElement element ;
    private String nameElement = "button";
    public Button(String value){
        element = $(By.xpath("//button[@id='"+value+"']"));
    }
    public Button(String value, String element){
        this.element = $(By.xpath("//button[@"+element+"='"+value+"']"));
    }
    public void click(){
        element.click();
    }
    public SelenideElement get(){
        return element;
    }
    public void set(String value){
        element = $(By.xpath("//button[@id='"+value+"']"));
    }
}
