package com.company.Board;

import com.company.Fields.*;
import com.company.Player.Player;


import java.util.Random;

public class Board {
    int currentTurn = 0;
    int totalPlayer = 0;
    Player[] players;
    Square[] squares = new Square[20];

    public Board(int totalPlayer) {
        players = new Player[totalPlayer];
        this.totalPlayer = totalPlayer;
        for(int i = 0;i < players.length;i++){
            players[i] = new Player(i, "Player ");
        }
        Random rand = new Random();
        for(int i = 0;i < squares.length;i++){
            switch (i){
                case 0: squares[i] = new Start("Start");
                case 1: squares[i] = new ChimneySweeper("Chimney sweeper");
                case 2: squares[i] = new ElectroShop("Electro shop");
                case 3: squares[i] = new Tram("Tram");
                case 4: squares[i] = new LuckyCard("Lucky card");
                case 5: squares[i] = new TvBurn("Burn TV");
                case 6: squares[i] = new Littering("Littering");
                case 7: squares[i] = new FurnitureShop("Furniture shop");
                case 8: squares[i] = new LuckyCard("Lucky card");
                case 9: squares[i] = new FreeParking("Free Parking");
                case 10: squares[i] = new RealEstate("House buying");
                case 11: squares[i] = new Hollyday("Hollyday");
                case 12: squares[i] = new Insurer("Insurer");
                case 13: squares[i] = new LuckyCard("Lucky card");
                case 14: squares[i] = new BrokenWashingMachine("Broken washing machine");
                case 15: squares[i] = new Littering("Littering");
                case 16: squares[i] = new Lottery("Lottery");
                case 17: squares[i] = new Bank("Bank");
                case 18: squares[i] = new LuckyCard("Lucky card");
                case 19: squares[i] = new Tram("Tram");

            }
        }
    }
    public Square movePlayer(Player player, int dice) {
        return movePlayer(player, dice, true);
    }

    public Square movePlayer(Player player, int dice, boolean count) {
        if(player.isBrokeOut()){
            return squares[player.getCurrentPosition()];
        }
        int newPosition = normalizePosition(player.getCurrentPosition() + dice);
        player.setPosition(newPosition);
        //Util.print(player, player.getName() + " goes to " + squares[player.getCurrentPosition()].getName());
        squares[newPosition].doAction(player, this);
        /*if(player.getMoney().isBrokeOut()){
            Util.print(player, player.getName() + " has been broke out!");
            player.setBrokeOut(true);
        }else{
            if(count){
                player.nextTurn();
            }
        }*/
        return squares[newPosition];
    }
    public Player getCurrentPlayer() {
        return players[currentTurn];
    }
    public int normalizePosition(int position) {
        return position % squares.length;
    }
    public void nextTurn() {
        if(++currentTurn >= players.length){
            currentTurn = 0;
        }
    }
}
