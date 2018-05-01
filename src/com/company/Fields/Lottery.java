package com.company.Fields;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player.Player;

public class Lottery extends Square { //ready
    Player player = new Player();
    LuckyCard luckyCard = new LuckyCard();

    public Lottery(String name) {
        super(name);
    }

    public void gambling(){
        System.out.println("You played a lottery. That was 50Ft.");
        player.setMoney(player.getMoney()- 50);
        luckyCard.luckyCards();

    }

    @Override
    public void doAction(Player player, Board board) {

    }
}
/*- Lottóztál, fizess 50 Ft-ot, és húzz egy szerencsekártyát!*/