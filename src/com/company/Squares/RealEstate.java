package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RealEstate extends Square { //ready
    private int housePrice = 50000;
    private boolean houseError;

    public RealEstate() {
    }

    public void getHouse(Player player) throws Exception {
        System.out.println("Real Estate field" + '\n' + "---- ------ -----");
        System.out.println("Your money: " + player.getMoney());
        if (player.isHouse()) {
            System.out.println("You already have house.");
        } else if (player.getMoney() < housePrice) {
            System.out.println("You don't have enough money to buy a house.");
        } else {
            System.out.println("Do you want buy a house? The price is " + housePrice + "Ft. Please give a number.");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int scan = 0;
            Scanner sc = null;
            do {
                try {
                    sc = new Scanner(System.in);
                    scan = sc.nextInt();
                    if (scan < 1 && scan > 2) {
                        System.out.println("Wrong input. Please give 1 or 2.");
                        houseError = true;
                    }
                    sw(scan, player);
                } catch (InputMismatchException ex) {
                    System.out.println("Wrong input. Please give a number between 1-5.");
                    houseError = true;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }

            } while (houseError);
            sc.close();
        }
    }
    public void sw(int scan, Player player){
        switch (scan) {
            case 1:
                player.setHouse(true);
                player.setMoney(player.getMoney() - housePrice);
                System.out.println("Congratulations! You have house from now. Your money " + player.getMoney() + "Ft.");
                break;
            case 2:
                System.out.println("Ok. Maybe next time.");
                break;
        }
    }
}
/*- Ingatlanközvetítő, itt vehetsz lakást, ára: 50.000 Ft.*/