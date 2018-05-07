package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class TvBurn extends Square { //ready
    Player player = new Player();
    ElectroShop electroShop = new ElectroShop();

    public TvBurn() {
    }

    public void tvBurn(){
        if (player.isTv()){
            if (player.isInsure()) {
                System.out.println("Your tv is burned, but you have insure, so you got back the money.");
                player.setTv(false);
                player.setMoney(player.getMoney() + electroShop.getTvPrice());
            } else {
                System.out.println("Your tv is burned. Unfortunetly you don't have insure.");
                player.setTv(false);
            }
        } else {
            System.out.println("You don't have tv.");
        }
    }
}
/*- Kigyulladt a tévéd (ha volt). Ha van biztosításod, visszakapod az árát.*/