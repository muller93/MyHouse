package com.company;

import com.company.Board.Board;
import com.company.Player.Player;

import java.util.Scanner;

public class MyHouse {
    public static void main(String[] args) throws Exception {
        MyHouse myHouse = new MyHouse();
        myHouse.playing();
    }

    public void playing(Player[] players) throws Exception {
        System.out.println("======= == == ===== ====" +'\n' + "Welcome to My House Game  " +'\n' + "======= == == ===== ====" +'\n');
        Scanner scanner = new Scanner(System.in);
        int totalPlayer = 3;
        while (totalPlayer < 2 || totalPlayer > 6) {
            try {
                //System.out.println("How many people are playing?");
                //System.out.print("Players (2 - 6): ");
                //totalPlayer = scanner.nextInt();
            }
            catch(Exception e) {
                System.err.println("Error: Number too large.");
                continue;
            }
            if(totalPlayer > 6) {
                System.err.println("Error: Invalid player count.");
            }
        }
        MyHouse game = new MyHouse();
        game.startGame(totalPlayer, players);
    }

    public void startGame(int totalPlayer, Player[] players) throws Exception {
        Board board = new Board(totalPlayer);
        board.table(board.move(players), players);
        }
    }
/*problems: a többjátékos mód megoldása.*/