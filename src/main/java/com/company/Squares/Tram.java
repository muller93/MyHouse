package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Devices.Dice;
import com.company.Player;

public class Tram extends Square {
    public void travel(Player player, FurnitureShop furnitureShop) {
        System.out.println("Tram field" + '\n' + "---- -----");
        player.setPosition(8);
        System.out.println("You travelled with tram and you arrived to the furniture shop");
        furnitureShop.furnitureShop(player);
    }
}
/*- Villamossal utazol, még egyszer dobhatsz.*/