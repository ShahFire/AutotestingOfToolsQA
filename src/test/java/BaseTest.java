import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.*;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private static String urlSite = "https://demoqa.com";
    public static void openSite(){
        selectEdge();
        open(urlSite);
    }
    private static void selectEdge() {
        WebDriverManager.edgedriver().setup();
        Configuration.browser = "edge";
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    public void Start() {
        BaseTest.openSite();
    }

    @Test
    public void FormsPracticeFormTest() {
        FormsPracticeFormTest.step1();
        FormsPracticeFormTest.step2();
        FormsPracticeFormTest.step3();
        FormsPracticeFormTest.step4();
        FormsPracticeFormTest.step5();
        FormsPracticeFormTest.step6();
        FormsPracticeFormTest.step7();
        FormsPracticeFormTest.step8();
        FormsPracticeFormTest.step9();
        FormsPracticeFormTest.step10();
        FormsPracticeFormTest.step11();
        FormsPracticeFormTest.step12();
        FormsPracticeFormTest.step13();
        FormsPracticeFormTest.step14();
    }
    @Test
    public void ElementsTextBoxTest() {
        ElementsTextBoxTest.step1();
        ElementsTextBoxTest.step2();
        ElementsTextBoxTest.step3();
        ElementsTextBoxTest.step4();
        ElementsTextBoxTest.step5();
        ElementsTextBoxTest.step6();
    }
    @Test
    public void ElementsCheckBoxTest() {
        ElementsCheckBoxTest.step1();
        ElementsCheckBoxTest.step2();
        ElementsCheckBoxTest.step3();
        ElementsCheckBoxTest.step4();
        ElementsCheckBoxTest.step5();
        ElementsCheckBoxTest.step6();
        ElementsCheckBoxTest.step7();
    }
    @Test
    public void ElementsRadioButtonTest() {
        ElementsRadioButtonTest.step1();
        ElementsRadioButtonTest.step2();
    }
    @Test
    public void ElementsWebTablesTest() {
        ElementsWebTablesTest.step1();
        ElementsWebTablesTest.step2();
        ElementsWebTablesTest.step3();
        ElementsWebTablesTest.step4();
        ElementsWebTablesTest.step5();
        ElementsWebTablesTest.step6();
        ElementsWebTablesTest.step7();
        ElementsWebTablesTest.step8();
        ElementsWebTablesTest.step9();
        ElementsWebTablesTest.step10();
        ElementsWebTablesTest.step11();
    }
}
