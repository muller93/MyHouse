package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

public class BrokenWashingMachine extends Square { //ready
    ElectroShop electroShop = new ElectroShop();

    public BrokenWashingMachine() {
    }

    public void washMach(Player player){
        System.out.println("Broken Washing Machine field" + '\n' + "------ ------- ------- -----");
        System.out.println("Your money: " + player.getMoney());

        if (player.isWashingMachine()){
            if (player.isInsure()){
                System.out.println("Your washing machine is broken, but you have insure. You get back the money.");
                player.setMoney(player.getMoney() - electroShop.getWashMachPrice());
                player.setWashingMachine(false);
            } else {
                System.out.println("Your washing machine is broken, so you have to buy a new. You don't have insure.");
                player.setWashingMachine(false);
            }
        } else {
            System.out.println("You don't have washing machine.");
        }
    }
}
/*- Elromlott a mosógéped (ha volt). Ha van biztosításod, visszakapod az árát*/