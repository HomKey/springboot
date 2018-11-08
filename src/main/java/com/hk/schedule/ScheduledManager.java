package com.hk.schedule;

import com.hk.base.log.LogBean;
import com.hk.schedule.task.ITask;
import com.hk.schedule.timer.ITimer;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by LuHj on 2018/11/6.
 * 不管任务执行耗时是否大于间隔时间，scheduleAtFixedRate和scheduleWithFixedDelay都不会导致同一个任务并发地被执行。
 * 唯一不同的是scheduleWithFixedDelay是当前一个任务结束的时刻，开始结算间隔时间，如0秒开始执行第一次任务，
 * 任务耗时5秒，任务间隔时间3秒，那么第二次任务执行的时间是在第8秒开始。
 */
public class ScheduledManager extends LogBean {

    private ScheduledExecutorService executorService;

    public ScheduledManager(int poolSize, boolean isDaemon) {
        String name = "schedule-pool|" + poolSize + "|" + isDaemon + "|%d";
        executorService = new ScheduledThreadPoolExecutor(
                poolSize,
                new BasicThreadFactory.Builder().namingPattern(name).daemon(isDaemon).build()
        );
        logger.info(name);
    }

    public ScheduledManager(ScheduledExecutorService executorService) {
        this.executorService = executorService;
    }

    public void start(ITask task) {
        ITimer timer = task.getTimer();
        executorService.scheduleAtFixedRate(task, timer.getInitialDelay(), timer.getPeriod(), timer.getTimeUnit());
    }

    public void stop() {
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdown();
        }
    }
}
