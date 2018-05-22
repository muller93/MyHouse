package com.company;

import com.company.Player.Player;
import com.company.Squares.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MainTest {
    private Tram tram = new Tram();
    private Player player = new Player();
    private LuckyCard luckyCard = new LuckyCard();
    private FurnitureShop furnitureShop = new FurnitureShop();
    private GoAhead goAhead = new GoAhead();
    private Littering littering = new Littering();
    private BrokenWashingMachine broke = new BrokenWashingMachine();
    private ElectroShop electroShop = new ElectroShop();
    private GoBack goBack = new GoBack();
    private TvBurn tvBurn = new TvBurn();
    private Holiday holiday = new Holiday();

    @Test
    public void goAheadTest(){
        int beforePos = player.setPosition(4);
        goAhead.goForw(player, littering);
        int afterPos = player.getCurrentPosition();
        assertNotEquals(beforePos, afterPos);
    }

    @Test
    public void goBackTest(){
        int beforePos = player.setPosition(12);
        goBack.stepBack(player, luckyCard);
        int afterPos = player.getCurrentPosition();
        assertNotEquals(beforePos, afterPos);
    }

    @Test
    public void tramTest(){
        tram.travel(player, furnitureShop);
        int afterPos = player.getCurrentPosition();
        assertEquals(8, afterPos);
    }

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

    @Test
    public void burnTvTest(){
        int beforeMoney = player.getMoney();
        player.setTv(true);
        player.setInsure(true);
        tvBurn.tvBurn(player);
        int afterMoney = player.getMoney();
        assertEquals(player.isTv(), false);
        assertEquals(beforeMoney + electroShop.getTvPrice(), afterMoney);
    }

    @Test
    public void isHouseTest(){
        assertEquals(player.isHouse(), false);
    }

    @Test
    public void holidayTest(){
        int beforeMoney = player.getMoney();
        holiday.goHoliday(player);
        assertNotEquals(beforeMoney, player.getMoney());
    }
}
