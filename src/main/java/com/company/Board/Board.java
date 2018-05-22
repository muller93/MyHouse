package com.company.Board;

import com.company.Devices.Dice;
import com.company.MyHouse;
import com.company.Squares.*;
import com.company.Player.Player;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {
    //Player player = new Player();
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
    Holiday holiday = new Holiday();

    int i = 0;
    int totalPlayer = 0;

    public Player[] getPlayers() {
        return players;
    }

    Player[] players;
    Square[] squares = new Square[21];

    public Board(int totalPlayer) {
        players = new Player[totalPlayer];
        this.totalPlayer = totalPlayer;
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i, "Player " + (i + 1));
        }
    }

    public int move(Player[] players) {
        if (players[i].isWin(players[i])) {
            System.out.println("Congratulations, you won!" + '\n' +
            "What do you want?" + '\n' +
                    "1. I want play again" + '\n' +
                    "2. Exit" );
            scanning(players[i]);
        } else {
            System.out.println("Your turn. Current position is " + players[i].getCurrentPosition() + ". Your money: " + players[i].getMoney() + "Ft. If you want throw with dice, please press any button and press enter.");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            
            int throwing = dice.throwDice();
            players[i].setPosition(players[i].getCurrentPosition() + throwing);
            if (players[i].getCurrentPosition() > 20) {
                players[i].setPosition(players[i].getCurrentPosition() - 20);
                if (players[i].getCurrentPosition() == 1) {
                    players[i].setMoney(players[i].getMoney() + 6000);
                } else if (players[i].getCurrentPosition() > 1) {
                    players[i].setMoney(players[i].getMoney() + 4000);
                    System.out.println("You go through the start field, and got 4000Ft.");
                }
            }
            System.out.println("You thrown " + throwing + " and you arrived, the " + players[i].getCurrentPosition() + ". position." + '\n');
            return players[i].getCurrentPosition();
        }
        return players[i].getCurrentPosition();
    }


    public void scanning(Player player) {
        boolean end = false;
        int scan;
        Scanner sc;
        do {
            try {
                sc = new Scanner(System.in);
                scan = sc.nextInt();
                if (scan < 1 && scan > 2) {
                    System.out.println("Wrong input. Please give 1 or 2.");
                    end = true;
                }
                selector(scan);
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input. Please give 1 or 2.");
                end = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }

        } while (end);
    }

    public void selector(int scan) throws Exception {
        switch (scan) {
            case 1:
                MyHouse myHouse = new MyHouse();
                myHouse.playing();
                break;
            case 2: System.exit(1);
                break;
        }
    }

    public void table(int i, Player[] players) throws Exception {
            switch (i){
                case 1: squares[1] = new Start();
                    start.atStart(players[i]);
                    table(move(players), players);
                    break;

                case 2: squares[2] = new ChimneySweeper();
                    chimneySweeper.chimneyLuck(players[i]);
                    table(move(players), players);
                    break;

                case 3: squares[3] = new ElectroShop();
                    electroShop.electroShop(players[i]);
                    table(move(players), players);
                    break;

                case 4: squares[4] = new GoAhead();
                    goAhead.goForw(players[i], littering);
                    table(move(players), players);
                    break;

                case 5: squares[5] = new LuckyCard();
                    luckyCard.luckyCards(players[i]);
                    table(move(players), players);
                    break;

                case 6: squares[6] = new TvBurn();
                    tvBurn.tvBurn(players[i]);
                    table(move(players), players);
                    break;

                case 7: squares[7] = new Littering();
                    littering.litter(players[i]);
                    table(move(players), players);
                    break;

                case 8: squares[8] = new FurnitureShop();
                    furnitureShop.furnitureShop(players[i]);
                    table(move(players), players);
                    break;

                case 9: squares[9] = new Holiday();
                    holiday.goHoliday(players[i]);
                    table(move(players), players);
                    break;

                case 10: squares[10] = new FreeParking();
                    freeParking.freeP();
                    table(move(players), players);
                    break;

                case 11: squares[11] = new RealEstate();
                    realEstate.getHouse(players[i]);
                    table(move(players), players);
                    break;

                case 12: squares[12] = new GoBack();
                    goBack.stepBack(players[i], luckyCard);
                    table(move(players), players);
                    break;

                case 13: squares[13] = new Insurer();
                    insurer.getInsure(players[i]);
                    table(move(players), players);
                    break;

                case 14: squares[14] = new LuckyCard();
                    luckyCard.luckyCards(players[i]);
                    table(move(players), players);
                    break;

                case 15: squares[15] = new BrokenWashingMachine();
                    brokenWashingMachine.washMach(players[i]);
                    table(move(players), players);
                    break;

                case 16: squares[16] = new Littering();
                    littering.litter(players[i]);
                    table(move(players), players);
                    break;

                case 17: squares[17] = new Lottery();
                    lottery.gambling(players[i]);
                    table(move(players), players);
                    break;

                case 18: squares[18] = new Bank();
                    bank.takeUpLoan(players[i]);
                    table(move(players), players);
                    break;

                case 19: squares[19] = new LuckyCard();
                    luckyCard.luckyCards(players[i]);
                    table(move(players), players);
                    break;

                case 20: squares[20] = new Tram();
                    tram.travel(players[i], furnitureShop);
                    table(move(players), players);
                    break;
            }
    }
}
