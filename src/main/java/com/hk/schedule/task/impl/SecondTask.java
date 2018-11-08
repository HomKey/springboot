package com.hk.schedule.task.impl;

import com.hk.schedule.task.ITask;
import com.hk.schedule.timer.ITimer;

import java.util.concurrent.TimeUnit;

/**
 * Created by LuHj on 2018/11/7.
 */
public class SecondTask implements ITask{

    private String name;

    public SecondTask(String name) {
        this.name = name;
    }

    @Override
    public ITimer getTimer() {
        return new ITimer() {
            @Override
            public long getInitialDelay() {
                return 1;
            }

            @Override
            public long getPeriod() {
                return 2;
            }

            @Override
            public TimeUnit getTimeUnit() {
                return TimeUnit.SECONDS;
            }
        };
    }

    @Override
    public void run() {
        System.out.println("SecondTask is run : " + name);
    }
}
