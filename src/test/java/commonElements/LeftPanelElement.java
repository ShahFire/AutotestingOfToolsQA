package commonElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeftPanelElement {
    private static SelenideElement Elements = $(By.xpath("//div[contains(text(),'Elements')]"));
    private static SelenideElement TextBoxLi = $(By.xpath("//span[contains(text(),'Text Box')]"));
    private static SelenideElement CheckBoxLi = $(By.xpath("//span[contains(text(),'Check Box')]"));
    private static SelenideElement RadioButtonLi = $(By.xpath("//span[contains(text(),'Radio Button')]"));
    private static SelenideElement WebTablesLi = $(By.xpath("//span[contains(text(),'Web Tables')]"));

    private static SelenideElement Forms = $(By.xpath("//div[contains(text(),'Forms')]"));
    private static SelenideElement PracticeFormLi = $(By.xpath("//span[contains(text(),'Practice Form')]"));

    private static SelenideElement AlertsFrameWindows = $(By.xpath("//div[contains(text(),'Alerts, Frame & Windows')]"));

    private static SelenideElement Widgets = $(By.xpath("//div[contains(text(),'Widgets')]"));

    private static SelenideElement Interactions = $(By.xpath("//div[contains(text(),'Interactions')]"));

    private static SelenideElement BookStoreApplication = $(By.xpath("//div[contains(text(),'Book Store Application')]"));


    public static void ElementsClick() {Elements.click();}
    public static void TextBoxLiClick() {TextBoxLi.click();}
    public static void CheckBoxLiClick() {CheckBoxLi.click();}
    public static void RadioButtonLiClick() {RadioButtonLi.click();}
    public static void WebTablesLiClick() {WebTablesLi.click();}

    public static void FormsClick() {Forms.click();}
    public static void PracticeFormLiClick() {PracticeFormLi.click();}

    public static void AlertsFrameWindowsClick() {AlertsFrameWindows.click();}

    public static void WidgetsClick() {Widgets.click();}

    public static void InteractionsClick() {Interactions.click();}

    public static void BookStoreApplicationClick() {BookStoreApplication.click();}

}
