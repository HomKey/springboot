package com.hk.schedule.timer;

import java.util.concurrent.TimeUnit;

/**
 * Created by LuHj on 2018/11/6.
 */
public interface ITimer {
    long getInitialDelay();
    long getPeriod();
    TimeUnit getTimeUnit();
}
