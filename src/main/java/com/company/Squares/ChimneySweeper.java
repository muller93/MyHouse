package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class ChimneySweeper extends Square {
    LuckyCard luckyCard = new LuckyCard();

    public ChimneySweeper() {
    }

    public void chimneyLuck(Player player){ //ready
        System.out.println("Chimney Sweeper field" + '\n' + "------- ------- -----");
        System.out.println("You saw a chimney sweeper! Pull a luckycard.");
        luckyCard.luckyCards(player);
    }
}
/*- Kéményseprőt láttál, húzz szerencsekártyát!*/