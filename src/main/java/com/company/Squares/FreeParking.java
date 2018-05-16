package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class FreeParking extends Square{

    public FreeParking() {
    }

    public void freeP(){
        System.out.println("Free Parking field" + '\n' + "---- ------- -----");
        System.out.println("You can parking free.");
    }
}
