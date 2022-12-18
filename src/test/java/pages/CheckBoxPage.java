package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {
    private static SelenideElement expandAllBtn = $(By.xpath("//button[@title='Expand all']"));
    private static SelenideElement collapseAllBtn = $(By.xpath("//button[@title='Collapse all']"));
    private static SelenideElement notesSpan = $(By.xpath("//span[contains(text(),'Notes')]"));
    private static SelenideElement reactSpan = $(By.xpath("//span[contains(text(),'React')]"));
    private static SelenideElement privateSpan = $(By.xpath("//span[contains(text(),'Private')]"));
    private static SelenideElement excelFileSpan = $(By.xpath("//span[contains(text(),'Excel File.doc')]"));

    public static void expandAllBtnClick() {expandAllBtn.should(Condition.visible).click();}
    public static void collapseAllBtnClick() {collapseAllBtn.should(Condition.visible).click();}
    public static void notesSpanClick() {notesSpan.should(Condition.visible).click();}
    public static void reactSpanClick() {reactSpan.should(Condition.visible).click();}
    public static void privateSpanClick() {privateSpan.should(Condition.visible).click();}
    public static void excelFileSpanClick() {excelFileSpan.should(Condition.visible).click();}

}
