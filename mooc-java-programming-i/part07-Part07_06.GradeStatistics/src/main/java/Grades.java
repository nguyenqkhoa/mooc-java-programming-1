import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> scores;
    private ArrayList<Integer> grades;
    private UserInterface userInterface;

    public Grades(ArrayList scores){
        this.scores = scores;
        this.grades = new ArrayList<>();
    }

    public void scoreToGradeConvertor(){
        int grade = 0;
        for (Integer score:scores){
            if (score < 50){
                grade = 0;
                grades.add(grade);
            }
            else if (score < 60){
                grade = 1;
                grades.add(grade);
            }
            else if (score < 70){
                grade = 2;
                grades.add(grade);
            }
            else if (score < 80){
                grade = 3;
                grades.add(grade);
            }
            else if (score < 90){
                grade = 4;
                grades.add(grade);
            }
            else if(score >= 90){
                grade = 5;
                grades.add(grade);
            }
        }
    }

    public String gradesToStars(int gradeQuery){
        String stars = "";
        for(Integer grade:grades){
            if(grade == gradeQuery){
                stars += "*";
            }
        }
        return stars;
    }

    public String toString(){
        return  "Grade distribution: " + "\n" +
                "5: " + this.gradesToStars(5) + "\n" +
                "4: " + this.gradesToStars(4) + "\n" +
                "3: " + this.gradesToStars(3) + "\n" +
                "2: " + this.gradesToStars(2) + "\n" +
                "1: " + this.gradesToStars(1) + "\n" +
                "0: " + this.gradesToStars(0);
    }


}
