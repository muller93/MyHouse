package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

import java.util.*;

public class LuckyCard extends Square {

    private Map<String, Integer> badCards = new HashMap<>();
    private Map<String, Integer> goodCards = new HashMap<>();
    private Random random = new Random();

    public void luckyCards(Player player) {
        System.out.println("Lucky Card field" + '\n' + "----- ---- -----" + '\n' + "You pick a lucky card: ");

        badCards.put("You bought a new shoes. Decrease your money with 700$.", 700);
        badCards.put("You were driving too fast and got a penalty. Decrase your money with 1800$.", 1800);
        badCards.put("You had to be repaire your car. Decrase your money with 1000$.", 1000);
        badCards.put("You have to bought a new suit. Decrase your money with 1500$.", 1500);
        badCards.put("You were at the dentist. The treatment price was 2000$.", 2000);

        goodCards.put("You won on sport bet. You got 700$.", 700);
        goodCards.put("Happy birthday! You got 500$ from your grandmother.", 500);
        goodCards.put("You got a premium from your boss. Your money increase with 1200$.", 1200);
        goodCards.put("Inherited a little money. You got 1800$.", 1800);
        goodCards.put("You won on the lottery. You got 2000$.", 2000);

        if (selector() == 1){
            goodSelector(player);
        } else badSelector(player);
    }

    private void badSelector(Player player){
        List<String> keys = new ArrayList<String>(badCards.keySet());
        String message = keys.get(random.nextInt(keys.size()));
        Integer decrase = badCards.get(message);
        System.out.println(message);
        player.setMoney(player.getMoney() - decrase);
    }

    private void goodSelector(Player player){
        List<String> keys = new ArrayList<String>(goodCards.keySet());
        String message = keys.get(random.nextInt(keys.size()));
        Integer incrase = goodCards.get(message);
        System.out.println(message);
        player.setMoney(player.getMoney() + incrase);
    }

    private int selector(){
        int num = random.nextInt(2) + 1;
        return num;
    }
}
