import java.util.*;

public class Deck{
    ArrayList<Card> deck;
    ArrayList<Integer> shuffled;
    Deck(){
        deck = new ArrayList<Card>();
        shuffled = new ArrayList<Integer>();
        buildDeck();
    }
    private void buildDeck(){
        ArrayList<String> s = new ArrayList<String>();
        s.add("ace"); s.add("king"); s.add("queen"); s.add("jack");
        for(int i = 0; i < s.size(); i++){
            deck.add(new Card(s.get(i), "spade"));
            deck.add(new Card(s.get(i), "heart"));
            deck.add(new Card(s.get(i), "diamond"));
            deck.add(new Card(s.get(i), "club"));
        }
        for(int i = 2; i < 11; i++){
            deck.add(new Card(String.valueOf(i), "spade"));
            deck.add(new Card(String.valueOf(i), "heart"));
            deck.add(new Card(String.valueOf(i), "diamond"));
            deck.add(new Card(String.valueOf(i), "club"));
        }
        for(int i = 0; i < deck.size(); i++){
            shuffled.add(i);
        }
    }
    public void shuffle(){
        shuffled.clear();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < deck.size(); i++){
            numbers.add(i);
        }
        for(int i = 0; i < deck.size(); i++){
            int pick = (int)(Math.random() * numbers.size());
            shuffled.add(numbers.get(pick));
            numbers.remove(pick);
        }
    }
    public void p(){
        System.out.println(shuffled.size());
        for(int i = 0; i < deck.size(); i++){
            System.out.printf("Type: %s, Suit: %s\n", deck.get(shuffled.get(i)).type, deck.get(shuffled.get(i)).suit);
        }
    }
}
