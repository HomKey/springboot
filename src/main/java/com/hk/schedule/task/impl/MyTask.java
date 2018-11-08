package com.hk.schedule.task.impl;

import com.hk.schedule.task.ITask;
import com.hk.schedule.timer.ITimer;
import com.hk.schedule.timer.impl.DailyTimer;

/**
 * Created by LuHj on 2018/11/6.
 */
public class MyTask implements ITask {

    private ITimer timer;

    public MyTask(ITimer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("MyTask is run");
    }

    @Override
    public ITimer getTimer() {
        return timer;
    }
}
