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
                    grid[x][y] = 2;
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


    //    排排坐，分糖果。
//    我们买了一些糖果 candies，打算把它们分给排好队的 n = num_people 个小朋友。
//    给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，依此类推，直到给最后一个小朋友 n 颗糖果。
//    然后，我们再回到队伍的起点，给第一个小朋友 n + 1 颗糖果，第二个小朋友 n + 2 颗，依此类推，直到给最后一个小朋友 2 * n 颗糖果。
//    重复上述过程（每次都比上一次多给出一颗糖果，当到达队伍终点后再次从队伍起点开始），直到我们分完所有的糖果。
//    注意，就算我们手中的剩下糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。
//    返回一个长度为 num_people、元素之和为 candies 的数组，以表示糖果的最终分发情况（即 ans[i] 表示第 i 个小朋友分到的糖果数）。
//
//    示例 1：
//
//    输入：candies = 7, num_people = 4
//    输出：[1,2,3,1]
//    解释：
//    第一次，ans[0] += 1，数组变为 [1,0,0,0]。
//    第二次，ans[1] += 2，数组变为 [1,2,0,0]。
//    第三次，ans[2] += 3，数组变为 [1,2,3,0]。
//    第四次，ans[3] += 1（因为此时只剩下 1 颗糖果），最终数组变为 [1,2,3,1]。
//    示例 2：
//
//    输入：candies = 10, num_people = 3
//    输出：[5,2,3]
//    解释：
//    第一次，ans[0] += 1，数组变为 [1,0,0]。
//    第二次，ans[1] += 2，数组变为 [1,2,0]。
//    第三次，ans[2] += 3，数组变为 [1,2,3]。
//    第四次，ans[0] += 4，最终数组变为 [5,2,3]。
//
//    提示：
//
//            1 <= candies <= 10^9
//            1 <= num_people <= 1000
    public int[] distributeCandies(int candies, int num_people) {
        // 完整分p次
        int p = (int) (Math.sqrt(2 * candies + 0.25) - 0.5);
        // 最后剩余的数量
        int remaining = (int) (candies - (p + 1) * p * 0.5);
        int rows = p / num_people;
        int cols = p % num_people;
        int[] result = new int[num_people];

        for (int i = 0; i < num_people; i++) {
            result[i] = (i + 1) * rows + num_people * rows * (rows - 1) / 2;
            if (i < cols) {
                result[i] += i + 1 + rows * num_people;
            }
        }
        result[cols] += remaining;
        return result;
    }

}
