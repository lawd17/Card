import org.junit.*;

import java.util.ArrayList;

public class GameTest {
    public static Game game;
    public static Player player1;
    public static Player player2;

    @BeforeClass
    public static void beforeClass() throws Exception {
        player1 = new Player("Marco", new Cards(new ArrayList<String>()));
        player2 = new Player("Peter", new Cards(new ArrayList<String>()));
        game = new Game(player1,player2);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void after() throws Exception {
        game.newGame();
    }

    @Test
    public void winds_the_player_with_the_highest_card_in_single_card_game() {
        player1.addCard("2");
        player2.addCard("3");

        Assert.assertEquals(player2.getName() + " wins 1 to 0", game.whoWins());
    }

    @Test
    public void winds_other_player_with_highest_card() {
        player1.addCard("3");
        player2.addCard("2");

        Assert.assertEquals(player1.getName() + " wins 1 to 0", game.whoWins());
    }


    @Test
    public void the_game_if_tie() {
        player1.addCard("2");
        player2.addCard("2");

        Assert.assertEquals("It has been tied", game.whoWins());
    }


    @Test
    public void wins_with_cards_that_are_not_numbers() {
        player1.addCard("Q");
        player2.addCard("A");

        Assert.assertEquals(player1.getName() + " wins 1 to 0", game.whoWins());
    }


    @Test
    public void wins_with_mode_than_one_card() {
        player1.addCard("8");
        player1.addCard("Q");
        player2.addCard("5");
        player2.addCard("J");
        Assert.assertEquals(player1.getName() + " wins 2 to 0", game.whoWins());
    }


}
