package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Devices.Dice;
import com.company.Player;

public class Tram extends Square {
//Board board = new Board();
    public void travel(Player player) {
        System.out.println("Tram field" + '\n' + "---- -----");
        System.out.println("You travelled with tram and you arrived to the furniture shop");
        player.setPosition(8);
    }
}
/*- Villamossal utazol, még egyszer dobhatsz.*/