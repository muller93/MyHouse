package com.company;

import com.company.Board.Board;

import java.util.Scanner;

public class MyHouse {
    public static void main(String[] args) throws Exception {
        MyHouse myHouse = new MyHouse();
        myHouse.playing();
    }

    public void playing() throws Exception {
        System.out.println("======= == == ===== ====" +'\n' + "Welcome to My House Game  " +'\n' + "======= == == ===== ====" +'\n');
        Scanner scanner = new Scanner(System.in);
        int totalPlayer = 0;
        while (totalPlayer < 2 || totalPlayer > 6) {
            try {
                System.out.println("How many people are playing?");
                System.out.print("Players (2 - 6): ");
                totalPlayer = scanner.nextInt();
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
        game.startGame(totalPlayer);
    }

    private void startGame(int totalPlayer) throws Exception {
        Board board = new Board(totalPlayer);
        board.table(board.move(board.getPlayers()), board.getPlayers());
        }
    }

