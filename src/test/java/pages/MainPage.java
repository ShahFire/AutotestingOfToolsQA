package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private static SelenideElement forms = $(By.xpath("//h5[contains(text(),'Forms')]"));
    private static SelenideElement elements = $(By.xpath("//h5[contains(text(),'Elements')]"));

    public static void FormsClick() {forms.click();}
    public static void ElementsClick() {elements.click();}
}
