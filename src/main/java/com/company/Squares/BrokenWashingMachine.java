package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class BrokenWashingMachine extends Square {
    private ElectroShop electroShop = new ElectroShop();

    public void washMach(Player player){
        System.out.println("Broken Washing Machine field" + '\n' + "------ ------- ------- -----");
        System.out.println("Your money: " + player.getMoney() + "$");

        if (player.isWashingMachine()){
            brokenMachine(player);
        } else {
            System.out.println("You don't have washing machine.");
        }
    }

    private void brokenMachine(Player player){
        if (player.isInsure()){
            System.out.println("Your washing machine is broken, but you have insure. You get back the money.");
            player.setMoney(player.getMoney() + electroShop.getWashMachPrice());
            player.setWashingMachine(false);
        } else {
            System.out.println("Your washing machine is broken, so you have to buy a new. You don't have insure.");
            player.setWashingMachine(false);
        }
    }
}
