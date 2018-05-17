package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class Tram extends Square {
    public void travel(Player player, FurnitureShop furnitureShop) {
        System.out.println("Tram field" + '\n' + "---- -----");
        player.setPosition(8);
        player.setMoney(player.getMoney() + 4000);
        System.out.println("You travelled with tram and you arrived to the furniture shop. You got 4000Ft, because you went through the start field.");
        furnitureShop.furnitureShop(player);
    }
}
/*- Villamossal utazol, még egyszer dobhatsz.*/