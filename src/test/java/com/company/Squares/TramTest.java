package com.company.Squares;

import com.company.Player.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class TramTest {
    private Tram tram = new Tram();
    private Player player = new Player();
    private FurnitureShop furnitureShop = new FurnitureShop();


    @Test
    public void tramTest(){
        tram.travel(player, furnitureShop);
        int afterPos = player.getCurrentPosition();
        assertEquals(8, afterPos);
    }
}