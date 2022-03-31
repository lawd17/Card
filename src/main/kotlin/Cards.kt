class Cards {
    private val sintaxCard = "A23456789TJQK";

    fun whoWins(player1: MutableList<String>, player2: MutableList<String>): String {
        var scorePlayer1 = 0;
        var scorePlayer2 = 0;

        for (i in 0 until player1.size) {
            val card1 = player1.get(i);
            val card2 = player2.get(i);

            if (sintaxCard.indexOf(card1) > sintaxCard.indexOf(card2)) scorePlayer1++
            if (sintaxCard.indexOf(card1) < sintaxCard.indexOf(card2)) scorePlayer2++
        }

        return getTextResponse(scorePlayer1,scorePlayer2)
    }

    fun getTextResponse(scorePlayer1: Int, scorePlayer2: Int): String {
        var response = "The player 1 and The player 2 have tie"

        if (scorePlayer1 > scorePlayer2) response = "The player 1 wins $scorePlayer1 to $scorePlayer2"
        if (scorePlayer1 < scorePlayer2) response = "The player 2 wins $scorePlayer2 to $scorePlayer1"

        return response
    }
}

