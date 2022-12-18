package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage {
    private static SelenideElement editRecord1 = $(By.xpath("//span[@id='edit-record-1']"));
    private static SelenideElement deleteRecord2 = $(By.xpath("//span[@id='delete-record-2']"));
    private static SelenideElement deleteRecord3 = $(By.xpath("//span[@id='delete-record-3']"));

    public static void EditRecord1Click() {editRecord1.should(Condition.visible).click();}
    public static void DeleteRecord2Click() {deleteRecord2.should(Condition.visible).click();}
    public static void DeleteRecord3Click() {deleteRecord3.should(Condition.visible).click();}

}
