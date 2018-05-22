package com.company.Player;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player player = new Player();


    @Test
    public void isHouseTest(){
        assertEquals(player.isHouse(), false);
    }
}