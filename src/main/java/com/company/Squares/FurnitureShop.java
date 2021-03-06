package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FurnitureShop extends Square {
    private int armchairPrice = 2000;
    private int couchPrice = 5000;
    private int kitchenFurnitrePrice = 6000;
    private int bedPrice = 4000;
    private boolean goOut = false;

    public void furnitureShop(Player player) {
        if (player.hasHouse()) {
            System.out.println("Furniture Shop field" + '\n' + "--------- ---- -----");
            System.out.println("Your money: " + player.getMoney() + "$.");
            System.out.println("Do you want buy any furniture? Please enter a number.");
            player.alreadyHaveFurniture();
            System.out.println('\n' + "1. Armchair. Price: " + armchairPrice + "$.");
            System.out.println("2. Couch. Price: " + couchPrice + "$.");
            System.out.println("3. Kitchen furniture. Price: " + kitchenFurnitrePrice + "$.");
            System.out.println("4. Bed. Price: " + bedPrice + "$.");
            System.out.println("5. No, thanks.");
            scanning(player);
        }else System.out.println("You can't buy any furniture, until you don't have house.");
    }

    private void scanning(Player player){
        Scanner sc;
        int scan;
        do {
            try {
                goOut = false;
                sc = new Scanner(System.in);
                scan = sc.nextInt();
                if (scan < 1 || scan > 5) {
                    System.out.println("Wrong input. Please give a number between 1-5.");
                    goOut = true;
                }
                selector(scan, player);
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input. Please give a number between 1-5.");
                goOut = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        } while (goOut);
    }

    private void getArmchair(Player player){
        if (player.getMoney() >= armchairPrice) {
            if (!player.isArmchair()) {
                player.setArmchair(true);
                player.setMoney(player.getMoney() - armchairPrice);
                System.out.println("You bought a new armchair. Your money: " + player.getMoney() + "$.");
            } else {
                System.out.println("You already have a armchair.");
            }
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    private void getCouch(Player player){
        if (player.getMoney() >= couchPrice) {
            if (!player.isCouch()) {
                player.setCouch(true);
                player.setMoney(player.getMoney() - couchPrice);
                System.out.println("You bought a new couch. Your money: " + player.getMoney() + "$.");
            } else {
                System.out.println("You already have a couch.");
            }
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    private void getKitchenFurniture(Player player){
        if (player.getMoney() >= kitchenFurnitrePrice) {
            if (!player.isKitchenFurniture()) {
                player.setKitchenFurniture(true);
                player.setMoney(player.getMoney() - kitchenFurnitrePrice);
                System.out.println("You bought a new kitchen furniture. Your money: " + player.getMoney() + "$.");
            } else {
                System.out.println("You already have a kitchen furniure.");
            }
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    private void getBed(Player player){
        if (player.getMoney() >= bedPrice) {
            if (!player.isBed()) {
                player.setBed(true);
                player.setMoney(player.getMoney() - bedPrice);
                System.out.println("You bought a new bed. Your money: " + player.getMoney() + "$.");
            } else {
                System.out.println("You already have a bed.");
            }
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    private void selector(int scan, Player player) {
        switch (scan) {
            case 1: getArmchair(player);
                break;
            case 2: getCouch(player);
                break;
            case 3: getKitchenFurniture(player);
                break;
            case 4: getBed(player);
                break;
            case 5:
                System.out.println("Ok.");
                break;
        }
    }
}
