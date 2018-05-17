package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class Start extends Square {

    public Start() {
    }
    public void atStart(Player player){
        System.out.println("Start field" + '\n' + "----- -----" + '\n' +
        "You got " + 6000 + "Ft");
    }
}
/*- Startmező. Ha ezen áthaladsz, 4.000 Ft-ot kapsz fizetésként,
ha megállsz rajta, 6.000-et. */