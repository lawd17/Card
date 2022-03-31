public class Player {
    private String name;
    private Cards cards;
    private int score;

    public Player(String name, Cards cards) {
        this.name = name;
        this.cards = cards;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public Cards getCards() {
        return cards;
    }

    public int getScore() {
        return score;
    }

    public void addCard(String card){
        this.cards.addCard(card);
    }

    public void sumScore(){
        score++;
    }

    public void clear(){
        this.cards.clear();
        this.score = 0;
    }




}
