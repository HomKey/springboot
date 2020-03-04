package com.hk.leetcode.daily;

import java.util.*;

/**
 * Created by HomKey on 2020/3/4.
 */
public class DailyTrain {
    public int orangesRotting(int[][] grid) {
        String template = "%d-%d-%d";
        int maxMinute = 0;
        int rowLength = grid.length;
        int columnLength = grid[0].length;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        Queue<String> rottingQueue = new ArrayDeque<>();
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (grid[i][j] == 2) {
                    rottingQueue.add(String.format(template, i, j, 0));
                }
            }
        }
        while (!rottingQueue.isEmpty()) {
            String temp = rottingQueue.poll();
            String[] obj = temp.split("-");
            maxMinute = Integer.valueOf(obj[2]);
            for (int i = 0; i < 4; i++) {
                int x = Integer.valueOf(obj[0]) + dr[i];
                int y = Integer.valueOf(obj[1]) + dc[i];
                if (x >= 0 && y >= 0 && x < rowLength && y < columnLength && grid[x][y] == 1) {
                    rottingQueue.add(String.format(template, x, y, maxMinute + 1));
                }
            }
        }
        for (int[] aGrid : grid) {
            for (int j = 0; j < columnLength; j++) {
                if (aGrid[j] == 1)
                    return -1;

            }
        }
        return maxMinute;
    }


}
