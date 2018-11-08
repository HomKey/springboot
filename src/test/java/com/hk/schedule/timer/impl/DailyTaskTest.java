package com.hk.schedule.timer.impl;

import org.junit.Test;
/**
 * Created by LuHj on 2018/11/6.
 */
public class DailyTaskTest {
    @Test
    public void getInitialDelay() throws Exception {
        DailyTimer dailyTimer = new DailyTimer(8 * 60 * 60 * 1000);
        long initialDelay = dailyTimer.getInitialDelay();
    }

}