package com.company.Devices;

import java.util.Random;

public class Dice { //ok
    Random rand = new Random();

    public int dice(){
        int num = rand.nextInt(6) + 1;
    return num;
    }
}
