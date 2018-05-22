package com.company.Squares;

import com.company.Player.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrokenWashingMachineTest {
    private Player player = new Player();
    private ElectroShop electroShop = new ElectroShop();
    private BrokenWashingMachine broke = new BrokenWashingMachine();

    @Test
    public void brokenWashTest(){
        int beforeMoney = player.getMoney();
        player.setWashingMachine(true);
        player.setInsure(true);
        broke.washMach(player);
        int afterMoney = player.getMoney();
        assertEquals(player.isWashingMachine(), false);
        assertEquals(beforeMoney + electroShop.getWashMachPrice(), afterMoney);
    }
}