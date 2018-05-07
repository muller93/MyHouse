package com.company;

import com.company.Board.Board;

public class MyHouse {

    public MyHouse(int totalPlayer) {
    }

    public static void main(String[] args) throws Exception {
        Player player1 = new Player();
        Player player2 = new Player();

        Board board = new Board(1);
        //board.move();
        //System.out.println(player1.getCurrentPosition());
        board.table(board.move());
    }
}
