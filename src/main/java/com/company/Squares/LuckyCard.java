package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

import java.util.*;

public class LuckyCard extends Square { //ok
    private String message;
    private int value;

    public LuckyCard() {
    }
    Map<String, Integer> badCards = new HashMap<>();
    Map<String, Integer> goodCards = new HashMap<>();
    Random random = new Random();

    public void luckyCards(Player player) {
        System.out.println("Lucky Card field" + '\n' + "----- ---- -----" + '\n' + "You pick a lucky card: ");

        //decrase
        badCards.put("You bought a new shoes. Decrease your money with 50Ft.", 50);
        badCards.put("You were driving too fast and got a penalty. Decrase your money with 300Ft.", 300);
        badCards.put("You had to be repaire your car. Decrase your money with 500Ft.", 500);
        badCards.put("You have to bought a new suit. Decrase your money with 200Ft.", 200);
        badCards.put("You were at the dentist. The treatment price was 100Ft.", 100);
        //increase
        goodCards.put("You won on tippmix. You got 120Ft", 120);
        goodCards.put("Happy birthday! You got 50ft from your grandmother.", 50);
        goodCards.put("You got a premium from your boss. Your money increase with 500Ft.", 500);
        goodCards.put("Inherited a little money. You got 180ft", 180);
        goodCards.put("You won on the lottery. You got 260Ft.", 260);
        //10 luckycard ready
        if (selector() == 1){
            goodSelector(player);
        } else badSelector(player);
    }

    public void badSelector(Player player){
        List<String> keys = new ArrayList<String>(badCards.keySet());
        String message = keys.get(random.nextInt(keys.size()));
        Integer decrase = badCards.get(message);
        System.out.println(message); //random select from map
        player.setMoney(player.getMoney() - decrase);
    }

    public void goodSelector(Player player){
        List<String> keys = new ArrayList<String>(goodCards.keySet());
        String message = keys.get(random.nextInt(keys.size()));
        Integer incrase = goodCards.get(message);
        System.out.println(message); //random select from map
        player.setMoney(player.getMoney() + incrase);
    }

    public int selector(){
        int num = random.nextInt(2) + 1;
        return num;
    }

}
/*A szerencsekártyákat véletlenszerűen kell generálni;
mindegyiknek van egy üzenete (pl. Új cipőt kell venned,
Elromlott a porszívód, Jutalmat kaptál, Nyertél a tombolán, stb.) és egy hatása.
A hatás egy kisebb összeg (50, 100, 200, 500 Ft) elköltése vagy megnyerése lehet,
vagy az, hogy a játékos egy körből kimarad.*/