package com.hk.schedule;

import com.hk.schedule.task.impl.MyTask;
import com.hk.schedule.task.impl.SecondTask;
import com.hk.schedule.timer.impl.DailyTimer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LuHj on 2018/11/7.
 */
public class ScheduledManagerTest {

    private ScheduledManager scheduledManager;
    @Before
    public void before(){
        scheduledManager = new ScheduledManager(1, true);
    }
    
    @Test
    public void testMyTask() throws InterruptedException {
        MyTask myTask = new MyTask(new DailyTimer(1000 * 60 * 60 * 8));
        scheduledManager.start(myTask);
        scheduledManager.start(new SecondTask("1"));
        scheduledManager.start(new SecondTask("2"));
        scheduledManager.start(new SecondTask("3"));
        Thread.sleep(10000);
    }
    
}