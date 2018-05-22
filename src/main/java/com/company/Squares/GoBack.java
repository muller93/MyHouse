package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player.Player;

public class GoBack extends Square {

    public void stepBack(Player players, LuckyCard luckyCard) {
        //int playCount = board.getPlayerCount();
        players.setPosition(players.getCurrentPosition() - 3);
        System.out.println("Go back 3 fields." + '\n' + "-- ---- - ------");
        luckyCard.luckyCards(players);
    }
}
