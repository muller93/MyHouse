package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class ChimneySweeper extends Square {
    private LuckyCard luckyCard = new LuckyCard();

    public void chimneyLuck(Player player){
        System.out.println("Chimney Sweeper field" + '\n' + "------- ------- -----");
        System.out.println("You saw a chimney sweeper! Pull a lucky card.");
        luckyCard.luckyCards(player);
    }
}
