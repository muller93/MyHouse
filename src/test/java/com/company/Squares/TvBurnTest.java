package com.company.Squares;

import com.company.Player.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvBurnTest {
    private ElectroShop electroShop = new ElectroShop();
    private TvBurn tvBurn = new TvBurn();
    private Player player = new Player();


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
}