package com.company.Squares;

import com.company.Player.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoAheadTest {
    private GoAhead goAhead = new GoAhead();
    private Player player = new Player();
    private Littering littering = new Littering();


    @Test
    public void goAheadTest(){
        int beforePos = player.setPosition(4);
        goAhead.goForw(player, littering);
        int afterPos = player.getCurrentPosition();
        assertNotEquals(beforePos, afterPos);
    }
}