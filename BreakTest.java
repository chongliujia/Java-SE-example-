/**
 * Created by apple on 2017/2/26.
 */
public class BreakTest {
    public static void main(String[] args){
        int count;

        for(count = 1; count <= 10; count++){
            if(count == 5){
                break;
            }

            System.out.println();
        }

        System.out.printf("\nBroke out of loop at count = %d\n", count);

    }
}
