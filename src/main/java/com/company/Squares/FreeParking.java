package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class FreeParking extends Square{

    public void freeP(Player player){
        System.out.println("Free Parking field" + '\n' + "---- ------- -----");
        System.out.println("You just parking free.");
    }
}
