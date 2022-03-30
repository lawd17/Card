import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import  org.junit.Assert.*;

import java.util.ArrayList;

public class CardsTest {
    public static ArrayList<String> player1;
    public static ArrayList<String> player2;
    public static Cards cards;

    @BeforeClass
    public static void beforeClass() throws Exception {
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
        cards = new Cards();
    }

    @Before
    public void setUp() throws Exception {
        player1.add("1");
        player2.add("2");
    }

    @Test
    public void winds_the_player_with_the_highest_card_in_single_card_game() {
        String result = cards.whoWind(player1, player2);
        Assert.assertEquals("The player 2 wins 1 to 0",result);
    }

    @Test
    public void winds_other_player_with_highest_card() {
        player1.set(0,"3");
        String result = cards.whoWind(player1, player2);
        Assert.assertEquals("The player 1 wins 1 to 0",result);
    }

    @Test
    public void the_game_if_tie() {
        player2.set(0,"1");
        String result = cards.whoWind(player1, player2);
        Assert.assertEquals("It has been tied",result);
    }

    @Test
    public void wins_with_cards_that_are_not_numbers() {
        player1.set(0,"A");
        player1.set(0,"J");
        String result = cards.whoWind(player1, player2);
        Assert.assertEquals("The player 1 wins 1 to 0",result);
    }

    @Test
    public void wins_with_mode_than_one_card() {
        player1.add("2");
        player2.add("Q");
        String result = cards.whoWind(player1, player2);
        Assert.assertEquals("The player 2 wins 2 to 0",result);
    }
}
