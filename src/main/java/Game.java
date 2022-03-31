import java.util.ArrayList;

public class Game {
    private final String cardRank = "A23456789JQK";
    Player player1;
    Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void newGame(){
        player1.clear();
        player2.clear();
    }

    public String whoWins(){
        String result = "";
        Cards player1Cards = player1.getCards();
        Cards player2Cards = player2.getCards();

        for (int i = 0; i < player1Cards.size(); i++) {
            String cardPlayer1 = player1Cards.getCard(i);
            String cardPlayer2 = player2Cards.getCard(i);

            if (cardRank.indexOf(cardPlayer1) > cardRank.indexOf(cardPlayer2)){
                this.player1.sumScore();
            } else if (cardRank.indexOf(cardPlayer1) < cardRank.indexOf(cardPlayer2)) {
                this.player2.sumScore();
            }
        }

        result = getMessageWin();

        return  result;
    }

    public String getMessageWin() {
        String result = "";
        String player1Name = this.player1.getName();
        String player2Name = this.player2.getName();

        int scorePlayer1 = this.player1.getScore();
        int scorePlayer2 = this.player2.getScore();


        if (scorePlayer1 > scorePlayer2){
            result = player1Name + " wins " + scorePlayer1 + " to " + scorePlayer2;
        } else if (scorePlayer1 < scorePlayer2){
            result = player2Name + " wins " + scorePlayer2 + " to " + scorePlayer1;
        } else {
            result = "It has been tied";
        }

        return  result;
    }
}
