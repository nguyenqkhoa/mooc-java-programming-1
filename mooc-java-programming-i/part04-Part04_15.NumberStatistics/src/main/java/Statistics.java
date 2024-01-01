
public class Statistics {
    private int count;
    private int sum;
    public Statistics(){

    }
    public void addNumber(int number){
        sum += number;
        count++;
    }

    public int getCount(){
        return this.count;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        if(this.count > 0) {
            return (double) this.sum / (double) this.count;
        }
        return 0;
    }
}
