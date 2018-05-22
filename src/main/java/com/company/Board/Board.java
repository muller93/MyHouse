package com.company.Board;

import com.company.Devices.Dice;
import com.company.MyHouse;
import com.company.Squares.*;
import com.company.Player.Player;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {
    private Player player = new Player();
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

    public int move() {
        if (player.isWin(player)) {
            System.out.println("Congratulations, you won!" + '\n' +
            "What do you want?" + '\n' +
                    "1. I want play again" + '\n' +
                    "2. Exit" );
            scanning(player);
        } else {
            System.out.println("Your turn. Current position is " + player.getCurrentPosition() + ". Your money: " + player.getMoney() + "Ft. If you want throw with dice, please press any button and press enter.");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            int throwing = dice.throwDice();
            player.setPosition(player.getCurrentPosition() + throwing);
            if (player.getCurrentPosition() > 20) {
                player.setPosition(player.getCurrentPosition() - 20);
                if (player.getCurrentPosition() == 1) {
                    player.setMoney(player.getMoney() + 6000);
                } else if (player.getCurrentPosition() > 1) {
                    player.setMoney(player.getMoney() + 4000);
                    System.out.println("You go through the start field, and got 4000Ft.");
                }
            }
            System.out.println("You thrown " + throwing + " and you arrived, the " + player.getCurrentPosition() + ". position." + '\n');
            return player.getCurrentPosition();
        }
        return player.getCurrentPosition();
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

    public void table(int i) throws Exception {
            switch (i){
                case 1: squares[1] = new Start();
                    start.atStart(player);
                    table(move(/*player*/)/*, players*/);
                    break;

                case 2: squares[2] = new ChimneySweeper();
                    chimneySweeper.chimneyLuck(player);
                    table(move());
                    break;

                case 3: squares[3] = new ElectroShop();
                    electroShop.electroShop(player);
                    table(move());
                    break;

                case 4: squares[4] = new GoAhead();
                    goAhead.goForw(player, littering);
                    table(move());
                    break;

                case 5: squares[5] = new LuckyCard();
                    luckyCard.luckyCards(player);
                    table(move());
                    break;

                case 6: squares[6] = new TvBurn();
                    tvBurn.tvBurn(player);
                    table(move());
                    break;

                case 7: squares[7] = new Littering();
                    littering.litter(player);
                    table(move());
                    break;

                case 8: squares[8] = new FurnitureShop();
                    furnitureShop.furnitureShop(player);
                    table(move());
                    break;

                case 9: squares[9] = new Holiday();
                    holiday.goHoliday(player);
                    table(move());
                    break;

                case 10: squares[10] = new FreeParking();
                    freeParking.freeP();
                    table(move());
                    break;

                case 11: squares[11] = new RealEstate();
                    realEstate.getHouse(player);
                    table(move());
                    break;

                case 12: squares[12] = new GoBack();
                    goBack.stepBack(player, luckyCard);
                    table(move());
                    break;

                case 13: squares[13] = new Insurer();
                    insurer.getInsure(player);
                    table(move());
                    break;

                case 14: squares[14] = new LuckyCard();
                    luckyCard.luckyCards(player);
                    table(move());
                    break;

                case 15: squares[15] = new BrokenWashingMachine();
                    brokenWashingMachine.washMach(player);
                    table(move());
                    break;

                case 16: squares[16] = new Littering();
                    littering.litter(player);
                    table(move());
                    break;

                case 17: squares[17] = new Lottery();
                    lottery.gambling(player);
                    table(move());
                    break;

                case 18: squares[18] = new Bank();
                    bank.takeUpLoan(player);
                    table(move());
                    break;

                case 19: squares[19] = new LuckyCard();
                    luckyCard.luckyCards(player);
                    table(move());
                    break;

                case 20: squares[20] = new Tram();
                    tram.travel(player, furnitureShop);
                    table(move());
                    break;
            }
    }
}
