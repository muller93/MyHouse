package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class Littering extends Square { //ready

    public Littering() {
    }

    public void litter(Player player){
        System.out.println("Littering field" + '\n' + "--------- -----");
        System.out.println(" Your money: " + player.getMoney());

        player.setMoney(player.getMoney()- 200);
        System.out.println("You littered. That wasn't a nice thing. You have to pay 200Ft.");
    }

}
/*- Szemeteltél, megbüntettek 200 Ft-ra.*/