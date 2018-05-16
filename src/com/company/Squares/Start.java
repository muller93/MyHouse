package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class Start extends Square {

    public Start() {
    }
    public void atStart(Player player){
        System.out.println("Start field" + '\n' + "----- -----" + '\n' +
        "You got " + 6000 + "Ft");
        //player.setMoney(player.getMoney() + 2000);
        System.out.println("Your money: " + player.getMoney());

    }
}
/*- Startmező. Ha ezen áthaladsz, 4.000 Ft-ot kapsz fizetésként,
ha megállsz rajta, 6.000-et. */