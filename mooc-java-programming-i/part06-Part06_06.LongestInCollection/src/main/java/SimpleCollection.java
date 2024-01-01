
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        String longest = "";
        if (elements.isEmpty()){
            return null;
        }
        else{
            for (String simpleCollection:
                 elements) {
                String temp = "";
                if (longest.length() < simpleCollection.length()){
                    longest = simpleCollection;
                }
            }
        }
        return longest;
    }

}
