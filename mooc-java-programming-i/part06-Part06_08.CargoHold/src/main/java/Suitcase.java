import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item){
        int weight = 0;
        if(!items.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {
                weight += items.get(i).getWeight();
            }
            if (weight + item.getWeight() <= maximumWeight) {
                items.add(item);
            }
        }
        else{
            if (item.getWeight() <= maximumWeight) {
                items.add(item);
            }
        }
    }

    public String toString(){
        int weight = 0;
        if(items.isEmpty()){
            return "no items (0 kg)";
        }
        if(items.size() == 1){
            return items.size() + " item (" + items.get(0).getWeight() + " kg";
        }
        for (int i = 0; i < items.size(); i++) {
            weight += items.get(i).getWeight();
        }
        return items.size() + " items (" + weight + " kg";

    }

    public void printItems(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (int i = 0; i < items.size(); i++) {
            totalWeight += items.get(i).getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem(){
        int location = 0;
        int heaviest = 0;
        if(items.isEmpty()){
            return null;
        }
        else{
            for (int i = 0; i < items.size(); i++) {
                if(items.get(i).getWeight() > heaviest){
                    heaviest = items.get(i).getWeight();
                    location = i;
                }
            }
        }
        return items.get(location);
    }



}
