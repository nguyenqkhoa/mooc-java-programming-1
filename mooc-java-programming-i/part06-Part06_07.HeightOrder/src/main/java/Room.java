import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room = new ArrayList<>();

    public Room(){
        this.room = new ArrayList<>();
    }

    public void add(Person person){
        room.add(person);
    }

    public boolean isEmpty(){
        if(room.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return room;
    }
    
    public Person shortest(){
        int location = 0;
        int shortest = 99999;
        if(isEmpty()){
            return null;
        }
        else{
            for (int i = 0; i < room.size(); i++) {
                if(room.get(i).getHeight() < shortest){
                    shortest = room.get(i).getHeight();
                    location = i;
                }
            }
        }
        return room.get(location);
    }

    public Person take(){
        int location = 0;
        int shortest = 99999;
        Person removed;
        if(isEmpty()){
            return null;
        }
        else{
            for (int i = 0; i < room.size(); i++) {
                if(room.get(i).getHeight() < shortest){
                    shortest = room.get(i).getHeight();
                    location = i;
                }
            }
        }
        removed = room.get(location);
        room.remove(location);
        return removed;
    }


}
