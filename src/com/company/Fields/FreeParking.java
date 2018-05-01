package com.company.Fields;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player.Player;

public class FreeParking extends Square{

    public FreeParking(String name) {
        super(name);
    }

    @Override
    public void doAction(Player player, Board board) {

    }

    public void freeP(){
        System.out.println("You can parking free.");


    }
}
