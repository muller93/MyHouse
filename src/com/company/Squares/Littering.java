package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class Littering extends Square { //ready
    Player player = new Player();

    public Littering() {
    }

    public void litter(){
        player.setMoney(player.getMoney()- 200);
        System.out.println("You littered. That wasn't a nice thing. You have to pay 200Ft.");
    }

}
/*- Szemeteltél, megbüntettek 200 Ft-ra.*/