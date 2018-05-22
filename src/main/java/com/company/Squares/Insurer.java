package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Insurer extends Square {
    private int insurePrice = 1000;
    private boolean goOut;

    public void getInsure(Player player) {
        System.out.println("Insurer field" + '\n' + "------- -----");
        System.out.println("Your money: " + player.getMoney() + "Ft");

        if (player.isInsure()) {
            System.out.println("You already have insure.");
        } else if (player.getMoney() < insurePrice) {
            System.out.println("You don't have enough money.");
        } else {
            System.out.println("Do you want insurance? The price is " + insurePrice + "Ft. Please give a number.");
            System.out.println("1. Yes");
            System.out.println("2. No");
            scanning(player);
        }

    }
    private void scanning(Player player){
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
                player.setInsure(true);
                player.setMoney(player.getMoney() - insurePrice);
                System.out.println("You have insure from now. Your money " + player.getMoney() + "Ft.");
                break;
            case 2:
                System.out.println("Ok. Maybe next time.");
                break;
        }
    }

}