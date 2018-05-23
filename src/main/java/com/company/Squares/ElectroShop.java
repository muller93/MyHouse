package com.company.Squares;

import com.company.Board.Square;
import com.company.Player.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectroShop extends Square{
    private int washMachPrice = 6000;
    private int tvPrice = 8000;
    private int hooverPrice = 3000;
    private int radioPrice = 500;
    private boolean goOut = false;

    public void electroShop(Player player) {
        if (player.hasHouse()) {
        System.out.println("Electro Shop field" + '\n' + "------- ---- -----");
        System.out.println("Your money: " + player.getMoney() + "$" + '\n' + "Do you want buy any electronic device? Please enter a number. Your money: " + player.getMoney() + "$.");
        player.alreadyHaveElectro();
        System.out.println('\n' + "1. Washing machine. Price: " + washMachPrice + "$.");
        System.out.println("2. TV. Price: " + tvPrice + "$.");
        System.out.println("3. Hoover. Price: " + hooverPrice + "$.");
        System.out.println("4. Radio. Price: " + radioPrice + "$.");
        System.out.println("5. No, thanks.");
        scanning(player);
        } else System.out.println("You can't buy any electronic device, until you don't have house.");
    }

    private void scanning(Player player){
        Scanner sc;
        do {
            try {
                goOut = false;
                sc = new Scanner(System.in);
                int scan = sc.nextInt();
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

    private void getWashMach(Player player){
        if (player.getMoney() >= washMachPrice) {
            if (!player.isWashingMachine()) {
                player.setWashingMachine(true);
                player.setMoney(player.getMoney() - washMachPrice);
                System.out.println("You bought a new washing machine. Your money: " + player.getMoney() + "$.");
            } else {
                System.out.println("You already have a washing machine.");
            }
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    private void getTv(Player player) {
        if (player.getMoney() >= tvPrice) {
            if (!player.isTv()) {
                player.setTv(true);
                player.setMoney(player.getMoney() - tvPrice);
                System.out.println("You bought a new TV. Your money: " + player.getMoney() + "$.");
            } else {
                System.out.println("You already have a TV.");
            }
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    private void getHoover(Player player){
        if (player.getMoney() >= hooverPrice) {
            if (!player.isHoover()) {
                player.setHoover(true);
                player.setMoney(player.getMoney() - hooverPrice);
                System.out.println("You bought a new hoover. Your money: " + player.getMoney() + "$.");
            } else {
                System.out.println("You already have a hoover.");
            }
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    private void getRadio(Player player){
        if (player.getMoney() >= radioPrice) {
            if (!player.isRadio()) {
                player.setRadio(true);
                player.setMoney(player.getMoney() - radioPrice);
                System.out.println("You bought a new radio. Your money: " + player.getMoney() + "$.");
            } else {
                System.out.println("You already have a radio.");
            }
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    private void selector(int scan, Player player) {
        switch (scan) {
            case 1: getWashMach(player);
                break;
            case 2: getTv(player);
                break;
            case 3: getHoover(player);
                break;
            case 4: getRadio(player);
                break;
            case 5:
                System.out.println("Ok.");
                break;
        }
    }

    public int getWashMachPrice() {
        return washMachPrice;
    }

    public int getTvPrice() {
        return tvPrice;
    }
}
