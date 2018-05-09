package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class Lottery extends Square { //ready
    Player player = new Player();
    LuckyCard luckyCard = new LuckyCard();

    public Lottery() {
    }

    public void gambling(){
        System.out.println("Lottery field" + '\n' + "------- -----");
        System.out.println("You played a lottery. That was 50Ft.");
        player.setMoney(player.getMoney()- 50);
        luckyCard.luckyCards();

    }

}
/*- Lottóztál, fizess 50 Ft-ot, és húzz egy szerencsekártyát!*/