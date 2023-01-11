package pages;

import selenideElements.Button;

import static com.codeborne.selenide.Selenide.$;

public class AutomationPracticeFormFrame {
    public Button closeLargeModalBtn = new Button("closeLargeModal");

    public void closeLargeModalBtnClick() {closeLargeModalBtn.click();}
}
