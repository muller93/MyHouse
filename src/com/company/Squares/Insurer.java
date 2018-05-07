package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Insurer extends Square {
    Player player = new Player();
    private int insurePrice = 1000;
    private boolean insureError;

    public Insurer() {
    }

    public void getInsure() throws Exception { //ready
        if (player.isInsure()) {
            System.out.println("You already have insure.");
        } else if (player.getMoney() < insurePrice) {
            System.out.println("You don't have enough money.");
        } else {
            System.out.println("Do you want insurance? The price is " + insurePrice + "Ft. Please give a number.");
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
                        insureError = true;
                    }
                    sw(scan);
                } catch (InputMismatchException ex) {
                    System.out.println("Wrong input. Please give a number between 1-5.");
                    insureError = true;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }

            } while (insureError);
            sc.close();
        }
    }

    public void sw(int scan){
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



/*- Biztosító: itt köthetsz biztosítást (ha még nincs).*/