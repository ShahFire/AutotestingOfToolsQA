package frames;

import selenideElements.Input;
import selenideElements.Button;

public class WebTablesRegistrationFrame {
    private Input firstName = new Input("firstName");
    private Input lastName = new Input("lastName");
    private Input userEmail = new Input("userEmail");
    private Input age = new Input("age");
    private Input salary = new Input("salary");
    private Input department = new Input("department");
    private Button submitBtn = new Button("submit");

    public void FirstNameInput(String text) {firstName.val(text);}
    public void LastNameInput(String text) {lastName.val(text);}
    public void UserEmailInput(String text) {userEmail.val(text);}
    public void AgeInput(String text) {age.val(text);}
    public void SalaryInput(String text) {salary.val(text);}
    public void DepartmentInput(String text) {department.val(text);}
    public void SubmitBtnClick() {submitBtn.click();}
}
