package com.hk.schedule;

import com.hk.base.log.LogBean;
import com.hk.schedule.timer.ITimer;

import java.util.Timer;

/**
 * Created by LuHj on 2018/11/6.
 */
public class TimerManager extends LogBean {
    private Timer timer;
    public TimerManager(Timer timer) {
        this.timer = timer;
    }
    public void start(ITimer task){
//        timer.schedule(task);
    }
}
