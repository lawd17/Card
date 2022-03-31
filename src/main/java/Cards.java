import java.util.ArrayList;

public class Cards {
    private ArrayList<String> cards;

    public Cards(ArrayList<String> cards) {
        this.cards = cards;
    }

    public void addCard(String card){
        this.cards.add(card);
    }

    public String getCard(int index){
        return this.cards.get(index);
    }

    public int size(){
        return  cards.size();
    }

    public void clear(){
        this.cards.clear();
    }

}
