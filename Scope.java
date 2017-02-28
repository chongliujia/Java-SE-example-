/**
 * Created by apple on 2017/2/26.
 */
public class Scope {

    private static int x = 1;

    public static void main(String[] args){
        int x = 5;

        System.out.printf("local x in main is %d\n",
                x);

        useLocalVariable();

    }

    public static void useLocalVariable(){
        int x = 25;

        System.out.printf(
                "\nLocal x on entering method useLocalVariable is %d\n", x
        );

        ++x;

        System.out.printf(
                "Local x before exiting method useLocalVariable is %d\n", x
        );


    }

    public static void useField(){
        System.out.printf(
                "\nfield x on entering method useField is %d\n", x
        );

        x = x * 10;

        System.out.printf(
                "field x before exiting method usefield is %d\n", x
        );
    }
}
