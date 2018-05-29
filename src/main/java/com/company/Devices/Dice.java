package com.company.Devices;

import java.util.Random;

public class Dice {
    private Random rand = new Random();

    public int throwDice(){
        int num = rand.nextInt(6) + 1;
        return num;
    }
}
