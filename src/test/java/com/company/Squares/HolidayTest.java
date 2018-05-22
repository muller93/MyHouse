package com.company.Squares;

import com.company.Player.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class HolidayTest {
    private Holiday holiday = new Holiday();
    private Player player = new Player();


    @Test
    public void holidayTest(){
        int beforeMoney = player.getMoney();
        holiday.goHoliday(player);
        assertNotEquals(beforeMoney, player.getMoney());
    }
}