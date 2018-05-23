package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RealEstate extends Square {
    private boolean goOut;
    private int housePrice = 50000;

    public void getHouse(Player player) {
        System.out.println("Buy House field" + '\n' + "--- ----- -----");
        System.out.println("Your money: " + player.getMoney() + "$.");
        if (player.isHouse()) {
            System.out.println("You already have house.");
        } else notEnoughMoney(player);
    }

    private void notEnoughMoney(Player player){
        if (player.getMoney() < housePrice) {
            System.out.println("You don't have enough money to buy a house.");
        } else {
            System.out.println("Do you want buy a house? The price is " + housePrice + "$. Please give a number.");
            System.out.println("1. Yes");
            System.out.println("2. No");
            scanning(player);
        }
    }

    private void scanning(Player player) {
        int scan;
        Scanner sc;
        do {
            try {
                goOut = false;
                sc = new Scanner(System.in);
                scan = sc.nextInt();
                if (scan < 1 || scan > 2) {
                    System.out.println("Wrong input. Please give 1 or 2.");
                    goOut = true;
                }
                selector(scan, player);
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input. Please give 1 or 2.");
                goOut = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }

        } while (goOut);
    }

    private void selector(int scan, Player player){
        switch (scan) {
            case 1:
                player.setHouse(true);
                player.setMoney(player.getMoney() - housePrice);
                System.out.println("Congratulations! You have house from now. Your money " + player.getMoney() + "$.");
                break;
            case 2:
                System.out.println("Ok. Maybe next time.");
                break;
        }
    }
}
