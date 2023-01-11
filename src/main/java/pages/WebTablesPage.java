package pages;

import selenideElements.Span;

public class WebTablesPage {
    public Span editRecord1 = new Span("edit-record-1");
    public Span deleteRecord2 = new Span("delete-record-2");
    public Span deleteRecord3 = new Span("delete-record-3");

    public void EditRecord1Click() {editRecord1.click();}
    public void DeleteRecord2Click() {deleteRecord2.click();}
    public void DeleteRecord3Click() {deleteRecord3.click();}

}
