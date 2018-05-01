package com.company.Fields;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player.Player;

public class ChimneySweeper extends Square {
    LuckyCard luckyCard = new LuckyCard("Card");

    public ChimneySweeper(String name) {
        super(name);
    }

    public void chimneyLuck(){ //ready
        System.out.println("You saw a chimney sweeper! Pull a luckycard.");
        luckyCard.luckyCards();
    }

    @Override
    public void doAction(Player player, Board board) {

    }
}
/*- Kéményseprőt láttál, húzz szerencsekártyát!*/