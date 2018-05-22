package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player.Player;

public class GoAhead extends Square{
    public void goForw(Player players, Littering littering){
        //int playCount = board.getPlayerCount();
        players.setPosition(players.getCurrentPosition() + 3);
        System.out.println("Go ahead 3 fields." + '\n' + "-- ----- - ------");
        littering.litter(players);
    }
}
