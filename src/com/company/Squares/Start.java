package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class Start extends Square {
    Player player = new Player();

    public Start() {
    }
    public void atStart(){
        player.setMoney(player.getMoney() + 6000);
    }
}
/*- Startmező. Ha ezen áthaladsz, 4.000 Ft-ot kapsz fizetésként,
ha megállsz rajta, 6.000-et. */