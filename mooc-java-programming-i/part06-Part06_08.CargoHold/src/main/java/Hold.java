import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        int weight = 0;
        if(!suitcases.isEmpty()) {
            for (int i = 0; i < suitcases.size(); i++) {
                weight += suitcases.get(i).totalWeight();
            }
            if (weight + suitcase.totalWeight() <= maximumWeight) {
                suitcases.add(suitcase);
            }
        }
        else{
            if (suitcase.totalWeight() <= maximumWeight) {
                suitcases.add(suitcase);
            }
        }
    }

    public String toString(){
        int weight = 0;
        if(suitcases.isEmpty()){
            return "no items (0 kg)";
        }
        if(suitcases.size() == 1){
            return suitcases.size() + " item (" + suitcases.get(0).totalWeight() + " kg";
        }
        for (int i = 0; i < suitcases.size(); i++) {
            weight += suitcases.get(i).totalWeight();
        }
        return suitcases.size() + " suitcases (" + weight + " kg";
    }

    public void printItems(){
        for (Suitcase suitcase: suitcases){
            suitcase.printItems();
        }
    }

}
