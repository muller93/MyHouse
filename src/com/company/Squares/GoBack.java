package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class GoBack extends Square {

    public void stepBack(Player player) {
        System.out.println("Go back 3 fields.");
        player.setPosition(player.getCurrentPosition() - 3);
    }

}
/*- Nyaralsz, két körből kimaradsz.*/