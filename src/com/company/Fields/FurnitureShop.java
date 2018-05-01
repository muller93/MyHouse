package com.company.Fields;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player.Player;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FurnitureShop extends Square {
    Player player = new Player();

    private int armchairPrice = 2000; //kettő kell
    private int couchPrice = 5000; //kanapé
    private int kitchenFurnitrePrice = 6000;
    private int bedPrice = 4000;
    private boolean furnitureError = false;

    public FurnitureShop(String name) {
        super(name);
    }


    public void furnitureShop() throws Exception { //ready
            System.out.println("Do you want buy any furniture? Please enter a number.");
            System.out.println("1. Armchair. Price: " + armchairPrice);
            System.out.println("2. Couch. Price: " + couchPrice);
            System.out.println("3. Kitchen furniture. Price: " + kitchenFurnitrePrice);
            System.out.println("4. Bed. Price: " + bedPrice);
            System.out.println("5. No, thanks.");
            int scan = 0;
        Scanner sc = null;
        do {
                try {
                    sc = new Scanner(System.in);
                    scan = sc.nextInt();
                    if (!(scan < 1 && scan > 5)) {
                        System.out.println("Wrong input. Please give a number between 1-5.");
                        furnitureError = true;
                    }
                    sw(scan);
                } catch (InputMismatchException ex) {
                    System.out.println("Wrong input. Please give a number between 1-5.");
                    furnitureError = true;
                } catch (Exception e){
                    e.printStackTrace();
                    System.exit(1);
                }

                } while (furnitureError);
        sc.close();
    }

    public void sw(int scan){
        switch (scan) {
            case 1:
                if (player.getMoney() >= armchairPrice) {
                    if (!player.isArmchair()) {
                        player.setArmchair(true);
                        player.setMoney(player.getMoney() - armchairPrice);
                        System.out.println("You bought a new armchair. Your money: " + player.getMoney());
                    } else {
                        System.out.println("You already have a armchair.");
                    }
                } else {
                    System.out.println("You don't have enough money.");
                }
                break;
            case 2:
                if (player.getMoney() >= couchPrice) {
                    if (!player.isCouch()) {
                        player.setCouch(true);
                        player.setMoney(player.getMoney() - couchPrice);
                        System.out.println("You bought a new couch. Your money: " + player.getMoney());
                    } else {
                        System.out.println("You already have a couch.");
                    }
                } else {
                    System.out.println("You don't have enough money.");
                }
                break;
            case 3:
                if (player.getMoney() >= kitchenFurnitrePrice) {
                    if (!player.isKitchenFurniture()) {
                        player.setKitchenFurniture(true);
                        player.setMoney(player.getMoney() - kitchenFurnitrePrice);
                        System.out.println("You bought a new kitchen furniture. Your money: " + player.getMoney());
                    } else {
                        System.out.println("You already have a kitchen furniure.");
                    }
                } else {
                    System.out.println("You don't have enough money.");
                }
                break;
            case 4:
                if (player.getMoney() >= bedPrice) {
                    if (!player.isBed()) {
                        player.setBed(true);
                        player.setMoney(player.getMoney() - bedPrice);
                        System.out.println("You bought a new bed. Your money: " + player.getMoney());
                    } else {
                        System.out.println("You already have a bed.");
                    }
                } else {
                    System.out.println("You don't have enough money.");
                }
                break;
            case 5:
                System.out.println("Ok.");
                break;
        }
    }

    @Override
    public void doAction(Player player, Board board) {

    }
}
/*- Bútorbolt, itt vásárolhatsz bútorokat.*/