package selenideElements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class SelenideElementCollection {
//    private SelenideElement selenideElementCollection;
//    private List<String> elements;
//    private String criteria;
//    private String element;
//    public SelenideElementCollection(String pathToElement, String element, String criteria) {
//        this.criteria = criteria;
//        this.element = element;
//        ElementsCollection elementsCollection = $$x(pathToElement+"//"+element+"[@"+criteria+"]");
//        List<String> elements = new ArrayList<>();
//        elementsCollection.forEach(x -> elements.add(x.getAttribute(criteria)));
//    }
//    public SelenideElementCollection(String pathToElement, String element, String criteria, int from, int to) {
//        this.criteria = criteria;
//        this.element = element;
//        ElementsCollection elementsCollection = $$x(pathToElement+"//"+element+"[@"+criteria+"]");
//        List<String> elements = new ArrayList<>();
//        for(int i = from; i < to; i++) {
//            elements.add(elementsCollection.get(i).getAttribute(criteria));
//        }
//    }
//    public List<String> get() {
//        return elements;
//    }
//    public String get(int a) {
//        return elements.get(a);
//    }
//    public void click(){
//        for (int i = 0; i < elements.size(); i++){
//            SelenideElement selenideElement = $(By.xpath("//"+element+"[@"+criteria+"='"+elements.get(i)+"']"));
//            selenideElement.click();
//        }
//    }
//    public void click(int index){
//        SelenideElement selenideElement = $(By.xpath("//"+element+"[@"+criteria+"='"+elements.get(index)+"']"));
//        selenideElement.click();
//    }
//    public int size(){
//        return elements.size();
//    }
}