package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

public class Lottery extends Square {
    private LuckyCard luckyCard = new LuckyCard();

    public void gambling(Player player){
        System.out.println("Lottery field" + '\n' + "------- -----");
        System.out.println("Your money: " + player.getMoney() + "Ft");

        System.out.println("You played a lottery. That was 50Ft.");
        player.setMoney(player.getMoney()- 50);
        luckyCard.luckyCards(player);
        System.out.println("Your money: " + player.getMoney() + "Ft");
    }
}
