package com.company.Squares;

import com.company.Board.Board;
import com.company.Board.Square;
import com.company.Player;

import javax.swing.border.Border;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectroShop extends Square{
    private int washMachPrice = 6000;
    private int tvPrice = 8000;
    private int hooverPrice = 3000;
    private int radioPrice = 500;
    private boolean electroErr = false;
    private int scan;

    public ElectroShop() {
    }


    public void electroShop(Player player) throws Exception { //ready
        System.out.println("Electro Shop field" + '\n' + "------- ---- -----");
        System.out.println("Your money: " + player.getMoney() + '\n' + "Do you want buy any electronic device? Please enter a number. Your money: " + player.getMoney());
        System.out.println("1. Washing machine. Price: " + washMachPrice);
        System.out.println("2. TV. Price: " + tvPrice);
        System.out.println("3. Hoover. Price: " + hooverPrice);
        System.out.println("4. Radio. Price: " + radioPrice);
        System.out.println("5. No, thanks.");
        Scanner sc = null;
        do {
            do {
                try {
                    sc = new Scanner(System.in);
                    scan = sc.nextInt();
                    if (scan < 1 && scan > 5) {
                        System.out.println("Wrong input. Please give 1 or 2.");
                        electroErr = true;
                    }
                    selector(scan, player);
                } catch (InputMismatchException ex) {
                    System.out.println("Wrong input. Please give a number between 1-5.");
                    electroErr = true;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            } while (electroErr);
        }while (electroErr);
    }

    public void selector(int scan, Player player) throws Exception {
        switch (scan) {
            case 1:
                if (player.getMoney() >= washMachPrice) {
                    if (!player.isWashingMachine()) {
                        player.setWashingMachine(true);
                        player.setMoney(player.getMoney() - washMachPrice);
                        System.out.println("You bought a new washing machine. Your money: " + player.getMoney());
                    } else {
                        System.out.println("You already have a washing machine.");
                    }
                } else {
                    System.out.println("You don't have enough money.");
                }
                break;
            case 2:
                if (player.getMoney() >= tvPrice) {
                    if (!player.isTv()) {
                        player.setTv(true);
                        player.setMoney(player.getMoney() - tvPrice);
                        System.out.println("You bought a new TV. Your money: " + player.getMoney());
                    } else {
                        System.out.println("You already have a TV.");
                    }
                } else {
                    System.out.println("You don't have enough money.");
                }
                break;
            case 3:
                if (player.getMoney() >= hooverPrice) {
                    if (!player.isHoover()) {
                        player.setHoover(true);
                        player.setMoney(player.getMoney() - hooverPrice);
                        System.out.println("You bought a new hoover. Your money: " + player.getMoney());
                    } else {
                        System.out.println("You already have a hoover.");
                    }
                } else {
                    System.out.println("You don't have enough money.");
                }
                break;
            case 4:
                if (player.getMoney() >= radioPrice) {
                    if (!player.isRadio()) {
                        player.setRadio(true);
                        player.setMoney(player.getMoney() - radioPrice);
                        System.out.println("You bought a new radio. Your money: " + player.getMoney());
                    } else {
                        System.out.println("You already have a radio.");
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

    public int getWashMachPrice() {
        return washMachPrice;
    }

    public void setWashMachPrice(int washMachPrice) {
        this.washMachPrice = washMachPrice;
    }

    public int getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(int tvPrice) {
        this.tvPrice = tvPrice;
    }

    public int getHooverPrice() {
        return hooverPrice;
    }

    public void setHooverPrice(int hooverPrice) {
        this.hooverPrice = hooverPrice;
    }

    public int getRadioPrice() {
        return radioPrice;
    }

    public void setRadioPrice(int radioPrice) {
        this.radioPrice = radioPrice;
    }
}
