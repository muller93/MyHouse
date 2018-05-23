package com.company.Squares;


import com.company.Board.Square;
import com.company.Player.Player;

public class TvBurn extends Square {
    private ElectroShop electroShop = new ElectroShop();

    public void tvBurn(Player player){
        System.out.println("TV Burn field" + '\n' + "-- ---- -----");
        if (player.isTv()){
            youHaveTv(player);
        } else {
            System.out.println("You don't have tv.");
        }
    }
    private void youHaveTv(Player player){
        if (player.isInsure()) {
            System.out.println("Your tv is broken, but you have insure, so you got back the money.");
            player.setTv(false);
            player.setMoney(player.getMoney() + electroShop.getTvPrice());
            System.out.println("Your money: " + player.getMoney() + "$.");
        } else {
            System.out.println("Your tv is broken. Unfortunately you don't have insure.");
            player.setTv(false);
        }
    }
}
