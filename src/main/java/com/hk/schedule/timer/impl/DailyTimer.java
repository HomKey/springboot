package com.hk.schedule.timer.impl;

import com.hk.base.util.DateUtils;
import com.hk.schedule.timer.ITimer;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 * Created by LuHj on 2018/11/6.
 */
public class DailyTimer implements ITimer {

    private final static long PERIOD_TIME = 1000 * 60 * 60 * 24;

    private int startMilliSecond;

    public DailyTimer(int startMilliSecond) {
        this.startMilliSecond = startMilliSecond;
    }

    @Override
    public long getInitialDelay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, this.startMilliSecond);
        System.out.println(DateUtils.getDateString(calendar.getTime(), null));
        long delay = Math.abs(Calendar.getInstance().getTimeInMillis() - calendar.getTimeInMillis());
        if (calendar.getTimeInMillis() < Calendar.getInstance().getTimeInMillis()) {
            return 1000 * 60 * 60 * 24 - delay;
        }
        return delay;
    }

    @Override
    public long getPeriod() {
        return PERIOD_TIME;
    }

    @Override
    public TimeUnit getTimeUnit() {
        return TimeUnit.MILLISECONDS;
    }
}
