package selenideElements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class CollectionOfCollections {



//    private SelenideElementCollection selenideElementCollection;
//    private List<SelenideElementCollection> elements;
//    public CollectionOfCollections(String value, String criteria) {
//        ElementsCollection elementsCollection = $$x(value);
//        List<String> elements = new ArrayList<>();
//        elementsCollection.forEach(x -> elements.add(x.getAttribute(criteria)));
//    }
//    public CollectionOfCollections(String value, String criteria, int from, int to) {
//        ElementsCollection elementsCollection = $$x(value);
//        List<String> elements = new ArrayList<>();
//        for(int i = from; i < to; i++) {
//            elements.add(elementsCollection.get(i).getAttribute(criteria));
//        }
//    }
//    public List<SelenideElementCollection> get() {
//        return elements;
//    }
//
//    public SelenideElementCollection get(int a) {
//        return elements.get(a);
//    }
//    public void click(){
//        for (int i = 0; i < elements.size(); i++){
//            SelenideElement element = $(By.xpath("//li[@id='"+elements.get(i)+"']"));
//            element.click();
//        }
//    }
}
