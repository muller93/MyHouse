package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

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
        badCards.put("You bought a new shoes. Decrease your money with 700Ft.", 700);
        badCards.put("You were driving too fast and got a penalty. Decrase your money with 1800Ft.", 1800);
        badCards.put("You had to be repaire your car. Decrase your money with 1000Ft.", 1000);
        badCards.put("You have to bought a new suit. Decrase your money with 1500Ft.", 1500);
        badCards.put("You were at the dentist. The treatment price was 2000Ft.", 2000);
        //increase
        goodCards.put("You won on tippmix. You got 700Ft", 700);
        goodCards.put("Happy birthday! You got 500Ft from your grandmother.", 500);
        goodCards.put("You got a premium from your boss. Your money increase with 1200Ft.", 1200);
        goodCards.put("Inherited a little money. You got 1800Ft", 1800);
        goodCards.put("You won on the lottery. You got 2000Ft.", 2000);
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