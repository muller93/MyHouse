package com.company.Squares;

import com.company.Player.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoBackTest {
    private GoBack goBack = new GoBack();
    private Player player = new Player();
    private LuckyCard luckyCard = new LuckyCard();


    @Test
    public void goBackTest(){
        int beforePos = player.setPosition(12);
        goBack.stepBack(player, luckyCard);
        int afterPos = player.getCurrentPosition();
        assertNotEquals(beforePos, afterPos);
    }
}