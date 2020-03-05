package com.hk.leetcode.daily;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HomKey on 2020/3/4.
 */
public class DailyTrainTest {

    private DailyTrain dailyTrain;
    @Before
    public void before(){
        dailyTrain = new DailyTrain();
    }
    @Test
    public void orangesRotting() throws Exception {
        int[][] data = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        dailyTrain = new DailyTrain();
        int i = dailyTrain.orangesRotting(data);
        System.out.println(i);
    }

    @Test
    public void distributeCandies() throws Exception {
        dailyTrain.distributeCandies(20,4);
    }
}