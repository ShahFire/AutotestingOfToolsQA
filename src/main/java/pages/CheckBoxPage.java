package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenideElements.AnyElementInText;
import selenideElements.Button;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {
    public Button expandAllBtn = new Button("Expand all", "title");
    public Button collapseAllBtn = new Button("Collapse all", "title");
    public AnyElementInText notesSpan = new AnyElementInText("span", "Notes");
    public AnyElementInText reactSpan = new AnyElementInText("span", "React");
    public AnyElementInText privateSpan = new AnyElementInText("span", "Private");
    public AnyElementInText excelFileSpan = new AnyElementInText("span", "Excel File.doc");

    public void expandAllBtnClick() {expandAllBtn.click();}
    public void collapseAllBtnClick() {collapseAllBtn.click();}
    public void notesSpanClick() {notesSpan.click();}
    public void reactSpanClick() {reactSpan.click();}
    public void privateSpanClick() {privateSpan.click();}
    public void excelFileSpanClick() {excelFileSpan.click();}
}
