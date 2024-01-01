import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Integer> scores;

    public UserInterface(Scanner scanner){
        this.scanner = new Scanner(System.in);
        this.scores = new ArrayList<>();
    }

    public ArrayList getScores(){
        return this.scores;
    }

    public void readInput(){
        System.out.println("Enter point totals, -1 stops: ");
        while(true){
            int points = Integer.valueOf(scanner.nextLine());

            if(points == -1){
                break;
            }
            if(points >= 0 && points <= 100){
                this.scores.add(points);
            }
        }
    }

    public double average(int sum, int count){
        double average = (1.0)*sum/((1.0)*count);
        return average;
    }

    public double pointAverage(){
        int sum = 0;
        int count = 0;
        for(int score:scores){
            sum += score;
            count++;
        }
        return average(sum, count);
    }

    public double pointAveragePass(){
        int sum = 0;
        int count = 0;
        for(int score:scores){
            if(score >= 50){
                sum += score;
                count++;
            }
        }
        return average(sum,count);
    }

    public double passPercentage(){
        //prints the pass percentage
        double counter =0;
        double total = 0;
        for(int score:scores){
            if(score >=50){
                counter++;
            }
            total++;
        }
        double percentage = 1.0 * (100*(counter/total));
        return percentage;
    }

    public String passingGradeHelper(){
        double average = this.pointAveragePass();
        if (Double.isNaN(average)){
            return "-";
        }
        return Double.toString(average);
    }

    public void gradePoints(){
        Grades grade = new Grades(scores);
        grade.scoreToGradeConvertor();
        System.out.println(grade);
    }

    public String toString(){
        return "Point average (all): " + this.pointAverage() + "\n" +
                "Point average(passing): " + this.passingGradeHelper() + "\n" +
                "Pass percentage: " +  this.passPercentage();

    }

}
