package frames;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenideElements.AnyElementInText;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class LeftPanelFrame {
    public AnyElementInText Elements = new AnyElementInText("div", "Elements");
    public AnyElementInText TextBoxLi = new AnyElementInText("span", "Text Box");
    public AnyElementInText CheckBoxLi = new AnyElementInText("span", "Check Box");
    public AnyElementInText RadioButtonLi = new AnyElementInText("span", "Radio Button");
    public AnyElementInText WebTablesLi = new AnyElementInText("span", "Web Tables");
    public AnyElementInText Forms = new AnyElementInText("div", "Forms");
    public AnyElementInText PracticeFormLi = new AnyElementInText("span", "Practice Form");
    public AnyElementInText AlertsFrameWindows = new AnyElementInText("div", "Alerts, Frame & Windows");
    public AnyElementInText Widgets = new AnyElementInText("div", "Widgets");
    public AnyElementInText Interactions = new AnyElementInText("div", "Interactions");
    public AnyElementInText BookStoreApplication = new AnyElementInText("div", "Book Store Application");

    public void ElementsClick() {Elements.click();}
    public void TextBoxLiClick() {TextBoxLi.click();}
    public void CheckBoxLiClick() {CheckBoxLi.click();}
    public void RadioButtonLiClick() {RadioButtonLi.click();}
    public void WebTablesLiClick() {WebTablesLi.click();}

    public void FormsClick() {Forms.click();}
    public void PracticeFormLiClick() {PracticeFormLi.click();}

    public void AlertsFrameWindowsClick() {AlertsFrameWindows.click();}

    public void WidgetsClick() {Widgets.click();}

    public void InteractionsClick() {Interactions.click();}

    public void BookStoreApplicationClick() {BookStoreApplication.click();}
    public static void EnumerationLeftPanelElements(){
        int elementGroupCounter = 0;

        ElementsCollection elementGroupDiv = $$x("//div[@class='accordion']//div[@class='header-text']");
        List<String> elementGroupList = new ArrayList<>();
        elementGroupDiv.forEach(x -> elementGroupList.add(x.getText()));

        ElementsCollection leftPannelLi = $$x("//div[@class='left-pannel']//li[@id]");
        List<String> leftPannelList = new ArrayList<>();
        leftPannelLi.forEach(x -> leftPannelList.add(x.getAttribute("id")));

        for (int i = 0;  i < leftPannelLi.size(); i++) {
            SelenideElement selenideElement = $(By.xpath("//div[@class='element-list collapse show']//li[@id='"+leftPannelList.get(i)+"']"));
            String a;
            a = leftPannelList.get(i);
            String b = "item-0";
            System.out.println("a = "+a);
            if (a.equals(b)){
                System.out.println("e = "+elementGroupList.get(elementGroupCounter));

                SelenideElement selenideElement2 = $(By.xpath("//div[contains(text(),'"+elementGroupList.get(elementGroupCounter)+"')]"));
                elementGroupCounter = elementGroupCounter + 1;
                selenideElement2.scrollTo();
                selenideElement2.click();
                selenideElement.click();
                if (elementGroupCounter == 0 ){
                    selenideElement2.click();
                }
            }
            else {
                selenideElement.click();
            }
        }
    }

}
