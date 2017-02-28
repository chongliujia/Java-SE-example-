/**
 * Created by apple on 2017/2/27.
 */
import java.util.Random;

public class DeckOfCards {

    private Card[] deck;
    private int currentCards;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards(){

        String[] faces = {
                "Ave", "Eight", "Nine", "Ten", "Jack", "Queen", "King",
                "Deuce", "Three", "Four", "Five", "Six", "Seven"
        };

        String[] suits = {
                "Hearts", "Diamond", "Clubs", "Spades"
        };

        deck = new Card[NUMBER_OF_CARDS];
        currentCards = 0;

        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }

    }

    public void shuffle(){
        currentCards = 0;

        for(int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt();

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        }
    }

    public Card dealCard(){
        if(currentCards < deck.length){
            return deck[currentCards++];
        }
        else{
            return null;
        }

    }
}
