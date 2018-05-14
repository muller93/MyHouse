package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class Lottery extends Square { //ready
    LuckyCard luckyCard = new LuckyCard();

    public Lottery() {
    }

    public void gambling(Player player){
        System.out.println("Lottery field" + '\n' + "------- -----");
        System.out.println("Your money: " + player.getMoney());

        System.out.println("You played a lottery. That was 50Ft.");
        player.setMoney(player.getMoney()- 50);
        luckyCard.luckyCards(player);
        System.out.println(" Your money: " + player.getMoney());

    }

}
/*- Lottóztál, fizess 50 Ft-ot, és húzz egy szerencsekártyát!*/