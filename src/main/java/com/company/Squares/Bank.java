package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank extends Square {
    private boolean goOut;
    private int maxLoan = 15001;

    public void takeUpLoan(Player player) {
        int canLoan = maxLoan - player.getHowManyDebit();
        System.out.println("Bank field" + '\n' + "---- -----");
        System.out.println("Your money: " + player.getMoney() + "$.");
        System.out.println("Your currently debit is " + player.getHowManyDebit() + ". You can take up " + (canLoan - 1) + "$.");
        System.out.println("Welcome to our bank. What would you like? Please select a number. You have to pay back the 120% of amount.");
        System.out.println("1. I want take up 5000$.");
        System.out.println("2. I want take up 10000$.");
        System.out.println("3. I want take up 15000$.");
        System.out.println("4. I want pay back the money.");
        System.out.println("5. I'm just looking.");
        scanning(player);
    }

    public void scanning(Player player){
        int scan;
        Scanner sc;
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

    private void littleDebit(Player player){
        if (player.getHowManyDebit() + 5000 < maxLoan) {
            System.out.println("You get 5000$.");
            player.setMoney(player.getMoney() + 5000);
            player.setHowManyDebit(player.getHowManyDebit() + 5000);
        } else {
            System.out.println("You can't take up the debit. You reach the credit limit.");
        }
    }

    private void mediumDebit(Player player){
        if (player.getHowManyDebit() + 10000 < maxLoan) {
            System.out.println("You get 10000$.");
            player.setMoney(player.getMoney() + 10000);
            player.setHowManyDebit(player.getHowManyDebit() + 10000);
        } else {
            System.out.println("You can't take up the debit. You reach the credit limit.");
        }
    }

    private void bigDebit(Player player){
        if (player.getHowManyDebit() + 15000 < maxLoan) {
            System.out.println("You get 15000$.");
            player.setMoney(player.getMoney() + 15000);
            player.setHowManyDebit(player.getHowManyDebit() + 15000);
        } else {
            System.out.println("You can't take up the debit. You reach the credit limit.");
        }
    }

    private void reFound(Player player){
        if (player.getHowManyDebit() < player.getMoney()) {
            System.out.println("You pay back your debit.");
            player.setMoney(player.getMoney() - (player.getHowManyDebit() + player.getHowManyDebit() / 5));
            player.setHowManyDebit(0);
            System.out.println("Your money " + player.getMoney());
        } else {
            System.out.println("You don't have enough money. You can't pay back your debit.");
        }
    }

    public void selector(int scan, Player player) {
        switch (scan) {
            case 1: littleDebit(player);
                break;
            case 2: mediumDebit(player);
                break;
            case 3: bigDebit(player);
                break;
            case 4: reFound(player);
                break;
            case 5:
                System.out.println("Ok.");
                break;
        }
    }
}

