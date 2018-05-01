package com.company;

import com.company.Devices.Dice;
import com.company.Fields.*;
import com.company.Player.Player;

import javax.swing.text.PlainDocument;

public class Main {

    public static void main(String[] args) throws Exception {
        Player player = new Player();
	    Dice trash = new Dice();
        System.out.println(trash.dice()); // dice ok

        //LuckyCard luckyCard = new LuckyCard();
        //luckyCard.luckyCards(); //kiírja a szerencsekártya nevét, plusz módosítja a player egyenlegét

        //Lottery lottery = new Lottery();
        //lottery.gambling(); //lottózás. 50 forintot levon, majd húzol egy szerencse káryát

        //Littering littering = new Littering();
        //littering.litter(); // szemetelés miatt levon 200ft-ot

        //Insurer insurer = new Insurer();
        //insurer.getInsure(); //bíztosítás lekérdezése, ha nincs bekéri, hogy akarunk e kötni. ok

        //ChimneySweeper chimneySweeper = new ChimneySweeper();
        //chimneySweeper.chimneyLuck();

        //ElectroShop electronikShop = new ElectroShop();
        //electronikShop.electroShop(); //ok

        //TvBurn tvBurn = new TvBurn();
        //tvBurn.tvBurn(); //leég a tv. ha biztosító visszakapja az árát. kész

        //FurnitureShop furnitureShop = new FurnitureShop();
        //furnitureShop.furnitureShop(); // okéjó

        //Bank bank = new Bank();
        //bank.takeUpLoan(); // mezőre való visszatérés itt is

        RealEstate realEstate = new RealEstate("House");
        realEstate.getHouse();
    }
}
