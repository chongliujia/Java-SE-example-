/**
 * Created by apple on 2017/2/26.
 */
public class Sum {
    public static void main(String[] args){
        int total = 0;

        for(int number = 2; number <= 20; number++){
            total = total + number;
        }

        System.out.printf("Sum is %d\n", total);
        System.out.println();
    }
}
