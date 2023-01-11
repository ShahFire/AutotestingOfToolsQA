package frames;

import selenideElements.AnyElementInText;

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

}
