package com.company;

import com.company.Board.Board;

import javax.swing.*;
import java.util.Scanner;

public class MyHouse {

    public MyHouse(int totalPlayer) {
        Board board = new Board(totalPlayer);
    }

    public MyHouse() {

    }

    public static void main(String[] args) throws Exception {
        MyHouse myHouse = new MyHouse();


        System.out.println("\tMy House\n");
        Scanner scanner = new Scanner(System.in);
        int totalPlayer = 0;
        while (totalPlayer < 2 || totalPlayer > 8) {
            try {
                System.out.println("How many people are playing?");
                System.out.print("Players (2 - 8): ");
                totalPlayer = scanner.nextInt();
            }
            catch(Exception e) {
                System.err.println("Error: Number too large.");
                continue;
            }
            if(totalPlayer > 8) {
                System.err.println("Error: Invalid player count.");
            }
        }

        MyHouse game = new MyHouse(totalPlayer);
        game.startGame();
    }
    public void startGame() throws Exception {
            Board board = new Board();
            board.table(board.move());
        }
    }
