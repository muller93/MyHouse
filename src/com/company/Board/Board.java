package com.company.Board;

import com.company.Devices.Dice;
import com.company.MyHouse;
import com.company.Squares.*;
import com.company.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {
    Player player = new Player();
    Dice dice = new Dice();
    ChimneySweeper chimneySweeper = new ChimneySweeper();
    ElectroShop electroShop = new ElectroShop();
    Tram tram = new Tram();
    Bank bank = new Bank();
    BrokenWashingMachine brokenWashingMachine = new BrokenWashingMachine();
    FreeParking freeParking = new FreeParking();
    FurnitureShop furnitureShop = new FurnitureShop();
    GoBack goBack = new GoBack();
    Insurer insurer = new Insurer();
    Littering littering = new Littering();
    Lottery lottery = new Lottery();
    LuckyCard luckyCard = new LuckyCard();
    RealEstate realEstate = new RealEstate();
    Start start = new Start();
    TvBurn tvBurn = new TvBurn();
    GoAhead goAhead = new GoAhead();

    /*public Board() {

    }*/

    int currentTurn = 0;
    int totalPlayer = 0;
    Player[] players;
    Square[] squares = new Square[20];

    public Board(int totalPlayer) {
        players = new Player[totalPlayer];
        this.totalPlayer = totalPlayer;
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i, "Player " + (i + 1));
        }
    }

    public int move() {
        if (player.isWin(player)) {
            System.out.println("Congratulations, you won!" + '\n' +
            "What do you want?" + '\n' +
                    "1. I want play again" + '\n' +
                    "2. Exit" );
            scanning();
        } else {
            System.out.println("Your turn. Current position is " + player.getCurrentPosition() + ". Your money: " + player.getMoney() + ". If you want throw with dice, please press any button and press enter.");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            int throwing = dice.throwDice();
            player.setPosition(player.getCurrentPosition() + throwing);
            if (player.getCurrentPosition() > 19) {
                player.setPosition(player.getCurrentPosition() - 19);
                player.setMoney(player.getMoney() + 4000);
                System.out.println("You go through the start field, and got 4000Ft.");
            }
            System.out.println("Your throwing is " + throwing + " and you arrived, the " + player.getCurrentPosition() + ". position.");
            return player.getCurrentPosition();
        }
        return player.getCurrentPosition();
    }


    public void scanning() {
        boolean end = false;
        int scan = 0;
        Scanner sc = null;
        do {
            try {
                sc = new Scanner(System.in);
                scan = sc.nextInt();
                if (scan < 1 && scan > 2) {
                    System.out.println("Wrong input. Please give 1 or 2.");
                    end = true;
                }
                selector(scan, player);
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input. Please give 1 or 2.");
                end = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }

        } while (end);
    }

    public void selector(int scan, Player player) throws Exception {
        switch (scan) {
            case 1:
                MyHouse myHouse = new MyHouse();
                myHouse.playing();
                break;
            case 2: System.exit(1);
                break;
        }
    }



    public void table(int i) throws Exception {
            switch (i){
                case 1: squares[1] = new Start();
                    start.atStart(player);
                    table(move());
                    nextTurn();
                    break;

                case 2: squares[2] = new ChimneySweeper();
                    chimneySweeper.chimneyLuck(player);
                    table(move());
                    nextTurn();
                    break;

                case 3: squares[3] = new ElectroShop();
                    electroShop.electroShop(player);
                    table(move());
                    nextTurn();
                    break;

                case 4: squares[4] = new GoAhead();
                    goAhead.goForw(player);
                    table(move());
                    nextTurn();
                    break;

                case 5: squares[5] = new LuckyCard();
                    luckyCard.luckyCards(player);
                    table(move());
                    nextTurn();
                    break;

                case 6: squares[6] = new TvBurn();
                    tvBurn.tvBurn(player);
                    table(move());
                    nextTurn();
                    break;

                case 7: squares[7] = new Littering();
                    littering.litter(player);
                    table(move());
                    nextTurn();
                    break;

                case 8: squares[8] = new FurnitureShop();
                    furnitureShop.furnitureShop(player);
                    table(move());
                    nextTurn();
                    break;

                case 9: squares[9] = new LuckyCard();
                    luckyCard.luckyCards(player);
                    table(move());
                    nextTurn();
                    break;

                case 10: squares[10] = new FreeParking();
                    freeParking.freeP();
                    table(move());
                    nextTurn();
                    break;

                case 11: squares[11] = new RealEstate();
                    realEstate.getHouse(player);
                    table(move());
                    nextTurn();
                    break;

                case 12: squares[12] = new GoBack();
                    goBack.stepBack(player);
                    table(move());
                    nextTurn();
                    break;

                case 13: squares[13] = new Insurer();
                    insurer.getInsure(player);
                    table(move());
                    nextTurn();
                    break;

                case 14: squares[14] = new LuckyCard();
                    luckyCard.luckyCards(player);
                    table(move());
                    nextTurn();
                    break;

                case 15: squares[15] = new BrokenWashingMachine();
                    brokenWashingMachine.washMach(player);
                    table(move());
                    nextTurn();
                    break;

                case 16: squares[16] = new Littering();
                    littering.litter(player);
                    table(move());
                    nextTurn();
                    break;

                case 17: squares[17] = new Lottery();
                    lottery.gambling(player);
                    table(move());
                    nextTurn();
                    break;

                case 18: squares[18] = new Bank();
                    bank.takeUpLoan(player);
                    table(move());
                    nextTurn();
                    break;

                case 19: squares[19] = new LuckyCard();
                    luckyCard.luckyCards(player);
                    table(move());
                    nextTurn();
                    break;

                case 20: squares[20] = new Tram();
                    tram.travel(player);
                    table(move());
                    nextTurn();
                    break;
            }
        }

    public Player getCurrentPlayer() {
        return players[currentTurn];
    }

    public Player[] getPlayers() {
        return players;
    }

    public void nextTurn() {
        if(++currentTurn >= players.length){
            currentTurn = 0;
        }
    }

    public Player getPlayer(int id) {
        return players[id];
    }
}
