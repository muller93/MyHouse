package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class Holiday extends Square{

    public void goHoliday(Player player){
        System.out.println("You went to abroad. The cost was 2500Ft.");
        player.setMoney(player.getMoney() - 2500);
    }
}