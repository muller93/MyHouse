package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class Littering extends Square {

    public void litter(Player player){
        System.out.println("Littering field" + '\n' + "--------- -----");
        System.out.println("Your money: " + player.getMoney() + "Ft");

        player.setMoney(player.getMoney() - 200);
        System.out.println("You littered. That wasn't a nice thing. You have to pay 200Ft.");
    }
}
