package com.company.Board;

import com.company.Devices.Dice;
import com.company.Squares.*;
import com.company.Player;

import java.util.ArrayList;

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
    Hollyday hollyday = new Hollyday();
    Insurer insurer = new Insurer();
    Littering littering = new Littering();
    Lottery lottery = new Lottery();
    LuckyCard luckyCard = new LuckyCard();
    RealEstate realEstate = new RealEstate();
    Start start = new Start();
    TvBurn tvBurn = new TvBurn();

    public Board() {

    }

    public ArrayList<Square> createSquares(){
        ArrayList<Square> squares = new ArrayList<>();
        for (int i = 0; i < squares.size(); i++){
            Square square = new Square(){};
            squares.add(square);
        }
        return squares;
    }



    int currentTurn = 0;
    int totalPlayer = 0;
    Player[] players;
    Square[] squares = new Square[20];


    public int move(){
        System.out.println("Your turn. Current position is " + player.getCurrentPosition() + ". If you want throw with dice, please press any button and press enter.");
        try {
            System.in.read();
        }
        catch(Exception e)
        {}
        int throwing = dice.throwDice();
        player.setPosition(player.getCurrentPosition() + throwing);
        System.out.println("Your throwing is " + throwing + " and you arrived, the " + player.getCurrentPosition() + ". position.");
        if (player.getCurrentPosition() > 20){
            player.setPosition(player.getCurrentPosition() - 20);
            player.setMoney(player.getMoney() + 4000);
        }
        //nextTurn();
        return player.getCurrentPosition();
    }

    public Board(int totalPlayer) {
        players = new Player[totalPlayer];
        this.totalPlayer = totalPlayer;
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i, "Player " + (i + 1));
        }
        System.out.println("Number of players: " + totalPlayer);
    }

    public void table(int i) throws Exception {
            switch (i){
                case 1: squares[1] = new Start();
                    start.atStart();
                    move();
                    break;

                case 2: squares[2] = new ChimneySweeper();
                    chimneySweeper.chimneyLuck();
                    move();
                    break;

                case 3: squares[3] = new ElectroShop();
                    electroShop.electroShop();
                    move();
                    break;

                case 4: squares[4] = new Tram();
                    tram.travel();
                    move();
                    break;

                case 5: squares[5] = new LuckyCard();
                    luckyCard.luckyCards();
                    move();
                    break;

                case 6: squares[6] = new TvBurn();
                    tvBurn.tvBurn();
                    move();
                    break;

                case 7: squares[7] = new Littering();
                    littering.litter();
                    move();
                    break;

                case 8: squares[8] = new FurnitureShop();
                    furnitureShop.furnitureShop();
                    move();
                    break;

                case 9: squares[9] = new LuckyCard();
                    luckyCard.luckyCards();
                    move();
                    break;

                case 10: squares[10] = new FreeParking();
                    freeParking.freeP();
                    move();
                    break;

                case 11: squares[11] = new RealEstate();
                    realEstate.getHouse();
                    move();
                    break;

                case 12: squares[12] = new Hollyday();
                    move();

                case 13: squares[13] = new Insurer();
                    insurer.getInsure();
                    move();
                    break;

                case 14: squares[14] = new LuckyCard();
                    luckyCard.luckyCards();
                    move();
                    break;

                case 15: squares[15] = new BrokenWashingMachine();
                    brokenWashingMachine.washMach();
                    move();
                    break;

                case 16: squares[16] = new Littering();
                    littering.litter();
                    move();
                    break;

                case 17: squares[17] = new Lottery();
                    lottery.gambling();
                    move();
                    break;

                case 18: squares[18] = new Bank();
                    bank.takeUpLoan();
                    move();
                    break;

                case 19: squares[19] = new LuckyCard();
                    luckyCard.luckyCards();
                    move();
                    break;

                case 20: squares[20] = new Tram();
                    move();
            }
        }
    /*public void nextTurn() {
        if(++currentTurn >= players.length){
            currentTurn = 0;
        }
    }*/
}
