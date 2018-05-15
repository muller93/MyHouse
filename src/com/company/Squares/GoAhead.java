package com.company.Squares;

import com.company.Board.Square;
import com.company.Player;

public class GoAhead extends Square{
    public void goForw(Player player){
        player.setPosition(player.getCurrentPosition() + 3);
        System.out.println("You go ahead 3 fields.");
    }
}
