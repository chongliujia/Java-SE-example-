/**
 * Created by apple on 2017/2/26.
 */
import java.util.Scanner;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String name, int[][] gradesArray){
        courseName = name;
        grades = gradesArray;
    }

    public void setCourseName(String name){
        courseName = name;
    }

    public String getCourseName(){
        return courseName;
    }

    public void displayMessage(){
        System.out.printf("welcome to the grade book for\n%s!\n",
                getCourseName());

        getCourseName();
    }

    public void processGrade(){
        outputGrades();

        System.out.printf("\n%s %d\n%s %d\n\n",
               "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        outputGrades();

    }


    public int getMinimum(){
        int lowGrade = grades[0][0];

        for(int[] studentGrades : grades){
            for(int grade : studentGrades){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }

        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0][0];

        for(int[] studentGrades : grades){
            for(int grade : grades){
                
            }
        }
    }

}
