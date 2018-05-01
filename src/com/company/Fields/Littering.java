package com.company.Fields;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player.Player;

public class Littering extends Square { //ready
    Player player = new Player();

    public Littering(String name) {
        super(name);
    }

    public void litter(){
        player.setMoney(player.getMoney()- 200);
        System.out.println("You littered. That wasn't a nice thing. You have to pay 200Ft.");
    }

    @Override
    public void doAction(Player player, Board board) {

    }
}
/*- Szemeteltél, megbüntettek 200 Ft-ra.*/