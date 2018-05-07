package com.company.Board;

import com.company.Player;

public class Util {
        public static void print(Player player, String msg) {
            System.out.println("[Turn " + (player.getTotalWalk() + 1) + "] [" + player.getCurrentPosition() + "] [Ft" + player.getMoney() + "] ");
        }
    }

