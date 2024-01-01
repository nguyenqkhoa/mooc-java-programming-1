
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

    public String toString(){
        String printOutput = "The collection " + this.name + " ";

        if (elements.isEmpty()) {
            return printOutput + "is empty.";
        }

        // we form a string from the people on the list
        String peopleOnRide = "";
        int count = 0;

        for (String element: elements) {
            count ++;
            if (count == 1) {
                peopleOnRide = peopleOnRide + element;
            }
            else if (count == 2) {
                peopleOnRide = peopleOnRide + "\n" + element + "\n";
            } else {
                peopleOnRide = peopleOnRide + element + "\n";
            }

        }

        if (count == 1){
            return printOutput + "has " + count + " element:" + "\n" + peopleOnRide;
        }
        return printOutput + "has " + count + " elements:" + "\n" + peopleOnRide;

    }
    
}
