import java.util.ArrayList;
import java.util.Locale;

public class Cards {
    private final String cardRank = "A23456789JQK";

    public String  whoWind(ArrayList<String> player1, ArrayList<String> player2){
        String result = "";

        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        for (int i = 0; i < player1.size(); i++) {
            String cardPlayer1 = player1.get(i);
            String cardPlayer2 = player2.get(i);

            if (cardRank.indexOf(cardPlayer1) > cardRank.indexOf(cardPlayer2)){
                scorePlayer1++;
            } else if (cardRank.indexOf(cardPlayer1) < cardRank.indexOf(cardPlayer2)) {
                scorePlayer2++;
            }
        }

        result = getMessageWin(scorePlayer1, scorePlayer2);

        return  result;
    }

    private String getMessageWin(int scorePlayer1, int scorePlayer2) {
        String result = "";

        if (scorePlayer1 > scorePlayer2){
            result = "The player 1 wins " + scorePlayer1 + " to " + scorePlayer2;
        } else if (scorePlayer1 < scorePlayer2){
            result = "The player 2 wins " + scorePlayer2 + " to " + scorePlayer1;
        } else {
            result = "It has been tied";
        }

        return  result;
    }

}
