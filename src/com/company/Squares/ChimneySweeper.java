package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class ChimneySweeper extends Square {
    LuckyCard luckyCard = new LuckyCard();

    public ChimneySweeper() {
    }

    public void chimneyLuck(){ //ready
        System.out.println("You saw a chimney sweeper! Pull a luckycard.");
        luckyCard.luckyCards();
    }
}
/*- Kéményseprőt láttál, húzz szerencsekártyát!*/