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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void luckyCards() {
        System.out.println("Lucky Card field" + '\n' + "----- ---- -----" + '\n' + "You pick a lucky card: ");
        Map<String, Integer> cards = new HashMap<>();
        Player player = new Player();
        //decrase
        cards.put("You bought a new shoes. Decrease your money with 50Ft.", 50);
        cards.put("You were driving too fast and got a penalty. Decrase your money with 300Ft.", 300);
        cards.put("You had to be repaire your car. Decrase your money with 500Ft.", 500);
        cards.put("You have to bought a new suit. Decrase your money with 200Ft.", 200);
        cards.put("You were at the dentist. The treatment price was 100Ft.", 100);
        //increase
        cards.put("You won on tippmix. You got 120Ft", 120);
        cards.put("Happy birthday! You got 50ft from your grandmother.", 50);
        cards.put("You got a premium from your boss. Your money increase with 500Ft.", 500);
        cards.put("Inherited a little money. You got 180ft", 180);
        cards.put("You won on the lottery. You got 260Ft.", 260);
        //10 luckycard ready

        Random random = new Random();
        List<String> keys = new ArrayList<String>(cards.keySet());
        String message = keys.get(random.nextInt(keys.size()));
        Integer val = cards.get(message);
        System.out.println(message); //random select from map

        player.setMoney(- val);
    }

}
/*A szerencsekártyákat véletlenszerűen kell generálni;
mindegyiknek van egy üzenete (pl. Új cipőt kell venned,
Elromlott a porszívód, Jutalmat kaptál, Nyertél a tombolán, stb.) és egy hatása.
A hatás egy kisebb összeg (50, 100, 200, 500 Ft) elköltése vagy megnyerése lehet,
vagy az, hogy a játékos egy körből kimarad.*/