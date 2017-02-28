/**
 * Created by apple on 2017/2/27.
 */
public class StudentPoll {

    public static void main(String[] args){

        int[] responses = {
                1, 2, 3, 4, 5, 4, 5, 3, 1, 2
        };

        int[] frequency = new int[6];

        for(int answer = 0; answer < responses.length; answer++){
            try{
                ++frequency[responses[answer]];

            }
            catch(ArrayIndexOutOfBoundsException e){

                System.out.println(e);
                System.out.printf("    responses[%d] = %d\n\n",
                        answer, responses[answer]);


            }
        }

        for(int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d\n",
                    rating, frequency[rating]);
        }
    }
}
