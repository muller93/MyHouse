package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank extends Square {
    Player player = new Player();
    private boolean bankError;
    private int maxLoan = 15000;
    private int canLoan = maxLoan - player.getHowManyDebit();

    public Bank() {
    }

    public void takeUpLoan(){ //csak a teljes adósságot lehet visszafizetni. ha annyit akarunk kérni amennyit már nem lehet nem ad másik választási lehetőséget
        System.out.println("Bank field" + '\n' + "---- -----");
        System.out.println("Your currently debit is " + player.getHowManyDebit() + ". You can take up " + canLoan);
        System.out.println("Welcome to our bank. What do you want? Please select a number.");
        System.out.println("1. I want take up 5000");
        System.out.println("2. I want take up 10000");
        System.out.println("3. I want take up 15000");
        System.out.println("4. I want pay back the money.");
        System.out.println("5. Nothing");
        int scan = 0;
        Scanner sc = null;

        do {
            try {
                sc = new Scanner(System.in);
                scan = sc.nextInt();
                if (!(scan < 1 && scan > 5)) {
                    bankError = true;
                }
                sw(scan);
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input. Please give a number between 1-5.");
                bankError = true;
            } catch (Exception e){
                e.printStackTrace();
                System.exit(1);
            }

        } while (bankError);
        sc.close();
    }

    public void sw(int scan) {
        bankError = false;
        //System.out.println(player.getMoney());
        switch (scan) {
            case 1:
                if (player.getHowManyDebit() + 5000 < maxLoan) {
                    System.out.println("You get 5000Ft");
                    player.setMoney(player.getMoney() + 5000);
                    player.setHowManyDebit(player.getMoney() + 5000);
                    System.out.println(player.getMoney());
                } else {
                    System.out.println("You can't take up the debit. You reach the credit limit.");
                }
                break;

            case 2:
                if (player.getHowManyDebit() + 10000 < maxLoan) {
                    System.out.println("You get 10000Ft");
                    player.setMoney(player.getMoney() + 10000);
                    player.setHowManyDebit(player.getMoney() + 10000);
                    System.out.println(player.getMoney());
                } else {
                    System.out.println("You can't take up the debit. You reach the credit limit.");
                }
                break;
            case 3:
                if (player.getHowManyDebit() + 15000 < maxLoan) {
                    System.out.println("You get 15000Ft");
                    player.setMoney(player.getMoney() + 15000);
                    player.setHowManyDebit(player.getMoney() + 15000);
                    System.out.println(player.getMoney());
                } else {
                    System.out.println("You can't take up the debit. You reach the credit limit.");
                }
                break;
            case 4:
                if (player.getHowManyDebit() < player.getMoney()) {
                    System.out.println("You pay back your debit");
                    player.setMoney(player.getMoney() - player.getHowManyDebit());
                    player.setHowManyDebit(0);
                    System.out.println("Your money " + player.getMoney());
                } else {
                    System.out.println("You don't have enough money. You can't pay back your debit.");
                }
                break;

            case 5:
                System.out.println("Ok.");
                break;
        }
    }
}

/*OTP. Itt vehetsz fel hitelt, vagy törlesztheted a meglévő tartozásodat.*/