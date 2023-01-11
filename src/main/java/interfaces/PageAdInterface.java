package interfaces;

import frames.LeftPanelFrame;
import frames.WebTablesRegistrationFrame;
import pages.*;

public interface PageAdInterface {
    MainPage mainPage = new MainPage();
    LeftPanelFrame leftPanelFrame = new LeftPanelFrame();
    CheckBoxPage checkBoxPage = new CheckBoxPage();
    RadioButtonPage radioButtonPage = new RadioButtonPage();
    TextBoxPage textBoxPage = new TextBoxPage();
    WebTablesPage webTablesPage = new WebTablesPage();
    WebTablesRegistrationFrame webTablesRegistrationFrame = new WebTablesRegistrationFrame();
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    AutomationPracticeFormFrame automationPracticeFormFrame = new AutomationPracticeFormFrame();
}
