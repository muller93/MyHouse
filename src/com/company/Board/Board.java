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
        System.out.println("Your turn. If you want throw with dice, please push any button.");
        try {
            System.in.read();
        }
        catch(Exception e)
        {}
        System.out.println(player.getCurrentPosition());
        player.setPosition(player.getCurrentPosition() + dice.throwDice());
        if (player.getCurrentPosition() > 20){
            player.setPosition(player.getCurrentPosition() - 20);
            player.setMoney(player.getMoney() + 4000);
            System.out.println(player.getCurrentPosition());
        }
        //nextTurn();
        return player.getCurrentPosition();
    }

    public Board(int totalPlayer) {
        players = new Player[totalPlayer];
        this.totalPlayer = totalPlayer;
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i, "Player " + (i + 1));
            System.out.println(players);
        }
    }

    public void table(int i) throws Exception {
            switch (i){
                case 1: squares[1] = new Start();
                    start.atStart();
                    break;

                case 2: squares[2] = new ChimneySweeper();
                    chimneySweeper.chimneyLuck();
                    break;

                case 3: squares[3] = new ElectroShop();
                    electroShop.electroShop();
                    break;

                case 4: squares[4] = new Tram();
                    tram.travel();
                    break;

                case 5: squares[5] = new LuckyCard();
                    luckyCard.luckyCards();
                    break;

                case 6: squares[6] = new TvBurn();
                    tvBurn.tvBurn();
                    break;

                case 7: squares[7] = new Littering();
                    littering.litter();
                    break;

                case 8: squares[8] = new FurnitureShop();
                    furnitureShop.furnitureShop();
                    break;

                case 9: squares[9] = new LuckyCard();
                    luckyCard.luckyCards();
                    break;

                case 10: squares[10] = new FreeParking();
                    freeParking.freeP();
                    break;

                case 11: squares[11] = new RealEstate();
                    realEstate.getHouse();
                    break;

                case 12: squares[12] = new Hollyday();


                case 13: squares[13] = new Insurer();
                    insurer.getInsure();
                    break;

                case 14: squares[14] = new LuckyCard();
                    luckyCard.luckyCards();
                    break;

                case 15: squares[15] = new BrokenWashingMachine();
                    brokenWashingMachine.washMach();
                    break;

                case 16: squares[16] = new Littering();
                    littering.litter();
                    break;

                case 17: squares[17] = new Lottery();
                    lottery.gambling();
                    break;

                case 18: squares[18] = new Bank();
                    bank.takeUpLoan();
                    break;

                case 19: squares[19] = new LuckyCard();
                    luckyCard.luckyCards();
                    break;

                case 20: squares[20] = new Tram();
            }
        }
    /*public void nextTurn() {
        if(++currentTurn >= players.length){
            currentTurn = 0;
        }
    }*/
}
