package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class GoBack extends Square {

    public void stepBack(Player player, LuckyCard luckyCard) {
        player.setPosition(player.getCurrentPosition() - 3);
        System.out.println("Go back 3 fields." + '\n' + "-- ---- - ------");
        luckyCard.luckyCards(player);
    }

}
