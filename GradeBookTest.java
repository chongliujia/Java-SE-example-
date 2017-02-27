/**
 * Created by apple on 2017/2/26.
 */


public class GradeBookTest {

    public static void main(String[] args){
        GradeBook_count myGradeBook = new GradeBook_count("CS101 Introduction to Java Programming.");
        myGradeBook.displayMessage();
        myGradeBook.inputGrades();

        myGradeBook.displayGradeReport();

    }
}
