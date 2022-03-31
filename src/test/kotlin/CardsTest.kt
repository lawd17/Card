import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

internal class CardsTest {
    private val cardClass: Cards = Cards()
    private var player1 = mutableListOf<String>()
    private var player2 = mutableListOf<String>()

    @BeforeTest
    fun before(){
        player1 = mutableListOf("3")
        player2 = mutableListOf("2")
    }

    @Test
    fun should_wins_player_with_highest_card() {
        val expected = "The player 1 wins 1 to 0";
        assertEquals(expected, cardClass.whoWins(player1, player2))
    }

    @Test
    fun should_have_tie_when_two_player_have_the_same_number() {
        val expected = "The player 1 and The player 2 have tie";
        player2.set(0,"3")

        assertEquals(expected, cardClass.whoWins(player1, player2))
    }

    @Test
    fun should_wins_player_with_highest_card_not_number() {
        val expected = "The player 1 wins 1 to 0";
        player2.set(0,"A")
        player1.set(0,"K")
        assertEquals(expected, cardClass.whoWins(player1, player2))
    }

    @Test
    fun should_wins_player_with_highest_in_more_than_one_card() {
        val expected = "The player 1 wins 2 to 0";
        player1.add("Q")
        player2.add("9")
        assertEquals(expected, cardClass.whoWins(player1, player2))
    }
}