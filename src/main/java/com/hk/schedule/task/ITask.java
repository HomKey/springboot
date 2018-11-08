package com.hk.schedule.task;

import com.hk.schedule.timer.ITimer;

/**
 * Created by LuHj on 2018/11/6.
 */
public interface ITask extends Runnable {
    ITimer getTimer();
}