package com.company.Board;

import com.company.Devices.Dice;
import com.company.MyHouse;
import com.company.Squares.*;
import com.company.Player.Player;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {
    public Player[] getPlayers() {
        return players;
    }

    private Dice dice = new Dice();
    private ChimneySweeper chimneySweeper = new ChimneySweeper();
    private ElectroShop electroShop = new ElectroShop();
    private Tram tram = new Tram();
    private Bank bank = new Bank();
    private BrokenWashingMachine brokenWashingMachine = new BrokenWashingMachine();
    private FreeParking freeParking = new FreeParking();
    private FurnitureShop furnitureShop = new FurnitureShop();
    private GoBack goBack = new GoBack();
    private Insurer insurer = new Insurer();
    private Littering littering = new Littering();
    private Lottery lottery = new Lottery();
    private LuckyCard luckyCard = new LuckyCard();
    private RealEstate realEstate = new RealEstate();
    private Start start = new Start();
    private TvBurn tvBurn = new TvBurn();
    private GoAhead goAhead = new GoAhead();
    private Holiday holiday = new Holiday();

    public int getPlayerCount() {
        return playerCount;
    }

    int playerCount = 0;
    private int totalPlayer = 0;
    private Player[] players;
    private Square[] squares = new Square[21];

    public Board(int totalPlayer) {
        players = new Player[totalPlayer];
        this.totalPlayer = totalPlayer;
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i, "Player " + (i + 1));
        }
    }

    public int move(Player[] players) {
        if (players[playerCount].isWin(players[playerCount])) {
            System.out.println("Congratulations, you won!" + '\n' +
            "What do you want?" + '\n' +
                    "1. I want play again" + '\n' +
                    "2. Exit" );
            scanning(players[playerCount]);
        } else {

            System.out.println('\n'+"================================================================================================================"+'\n'+"Your turn" + players[playerCount] + ". Current position is " + players[playerCount].getCurrentPosition() + ". Your money: " + players[playerCount].getMoney() + "Ft. If you want throw with dice, please press enter.");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            
            int throwing = dice.throwDice();
            players[playerCount].setPosition(players[playerCount].getCurrentPosition() + throwing);
            if (players[playerCount].getCurrentPosition() > 20) {
                players[playerCount].setPosition(players[playerCount].getCurrentPosition() - 20);
                if (players[playerCount].getCurrentPosition() == 1) {
                    players[playerCount].setMoney(players[playerCount].getMoney() + 6000);
                } else if (players[playerCount].getCurrentPosition() > 1) {
                    players[playerCount].setMoney(players[playerCount].getMoney() + 4000);
                    System.out.println("You go through the start field, and got 4000Ft.");
                }
            }
            System.out.println("You thrown " + throwing + " and you arrived, the " + players[playerCount].getCurrentPosition() + ". position." + '\n');
            int playerPos = players[playerCount].getCurrentPosition();
            return playerPos;
        }
        int playerPos = players[playerCount].getCurrentPosition();
        return playerPos;
    }

    public void changePlayer(){
        if (playerCount < totalPlayer - 1){
            playerCount++;
        } else {
            playerCount = 0;
        }
    }


    private void scanning(Player player) {
        boolean end = false;
        int scan;
        Scanner sc;
        do {
            try {
                sc = new Scanner(System.in);
                scan = sc.nextInt();
                if (scan < 1 || scan > 2) {
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

    private void selector(int scan) throws Exception {
        switch (scan) {
            case 1:
                MyHouse myHouse = new MyHouse();
                myHouse.playing();
                break;
            case 2: System.exit(1);
                break;
        }
    }

    public void table(int playerPos, Player[] players) throws Exception {
            switch (playerPos){
                case 1: squares[1] = new Start();
                    start.atStart(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 2: squares[2] = new ChimneySweeper();
                    chimneySweeper.chimneyLuck(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 3: squares[3] = new ElectroShop();
                    electroShop.electroShop(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 4: squares[4] = new GoAhead();
                    goAhead.goForw(players[playerCount], littering);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 5: squares[5] = new LuckyCard();
                    luckyCard.luckyCards(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 6: squares[6] = new TvBurn();
                    tvBurn.tvBurn(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 7: squares[7] = new Littering();
                    littering.litter(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 8: squares[8] = new FurnitureShop();
                    furnitureShop.furnitureShop(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 9: squares[9] = new Holiday();
                    holiday.goHoliday(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 10: squares[10] = new FreeParking();
                    freeParking.freeP(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 11: squares[11] = new RealEstate();
                    realEstate.getHouse(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 12: squares[12] = new GoBack();
                    goBack.stepBack(players[playerCount], luckyCard);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 13: squares[13] = new Insurer();
                    insurer.getInsure(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 14: squares[14] = new LuckyCard();
                    luckyCard.luckyCards(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 15: squares[15] = new BrokenWashingMachine();
                    brokenWashingMachine.washMach(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 16: squares[16] = new Littering();
                    littering.litter(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 17: squares[17] = new Lottery();
                    lottery.gambling(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 18: squares[18] = new Bank();
                    bank.takeUpLoan(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 19: squares[19] = new LuckyCard();
                    luckyCard.luckyCards(players[playerCount]);
                    changePlayer();
                    table(move(players), players);
                    break;

                case 20: squares[20] = new Tram();
                    tram.travel(players[playerCount], furnitureShop);
                    changePlayer();
                    table(move(players), players);
                    break;
            }
    }
}
