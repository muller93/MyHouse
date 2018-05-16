package com.company.Squares;

import com.company.Board.Square;
import com.company.Player;

public class GoAhead extends Square{
    public void goForw(Player player, Littering littering){
        player.setPosition(player.getCurrentPosition() + 3);
        System.out.println("Go ahead 3 fields." + '\n' + "-- ----- - ------");
        littering.litter(player);
    }
}
