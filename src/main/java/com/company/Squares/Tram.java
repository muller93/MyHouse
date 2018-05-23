package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player.Player;

public class Tram extends Square {
    public void travel(Player players, FurnitureShop furnitureShop) {
        System.out.println("Tram field" + '\n' + "---- -----");
        players.setPosition(8);
        players.setMoney(players.getMoney() + 4000);
        System.out.println("You travelled with tram and you arrived to the furniture shop. You got 4000$, because you went through the start field.");
        furnitureShop.furnitureShop(players);
    }
}
