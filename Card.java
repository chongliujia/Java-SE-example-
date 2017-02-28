/**
 * Created by apple on 2017/2/27.
 */
public class Card {

    private String face;
    private String suit;

    public Card(String cardFace, String cardsuit){
        face = cardFace;
        suit = cardsuit;
    }

    public String toString(){
        return face + " of " + suit;
    }


}
