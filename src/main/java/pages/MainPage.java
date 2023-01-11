package pages;

import com.beust.ah.A;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenideElements.AnyElementInText;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public AnyElementInText forms = new AnyElementInText("h5", "Forms");
    public AnyElementInText elements = new AnyElementInText("h5", "Elements");

    public void FormsClick() {forms.click();}
    public void ElementsClick() {elements.click();}
}
