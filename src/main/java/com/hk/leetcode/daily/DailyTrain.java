package com.hk.leetcode.daily;


import com.hk.leetcode.common.ListNode;

import java.util.*;

/**
 * Created by HomKey on 2020/3/4.
 */
public class DailyTrain {
    // 广度搜索
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

    // 等差数列
    public int[] distributeCandies(int candies, int num_people) {
        // 完整分p次
        int p = (int) (Math.sqrt(2 * candies + 0.25) - 0.5);
        // 最后剩余的数量
        int remaining = (int) (candies - (p + 1) * p * 0.5);
        int rows = p / num_people;
        int cols = p % num_people;
        int[] temp = new int[num_people];

        for (int i = 0; i < num_people; i++) {
            temp[i] = (i + 1) * rows + num_people * rows * (rows - 1) / 2;
            if (i < cols) {
                temp[i] += i + 1 + rows * num_people;
            }
        }
        temp[cols] += remaining;
        return temp;
    }

    // 滑动窗口
    public int[][] findContinuousSequence(int target) {
        int start = 1;
        int end = 2;
        int sum = 3;
        List<int[]> temp = new ArrayList<>();
        for (; start <= target / 2; ) {
            if (sum < target) {
                end++;
                sum += end;
            } else if (sum > target) {
                sum -= start;
                start++;
            } else {
                int[] arr = new int[end - start + 1];
                for (int j = start; j <= end; j++) {
                    arr[j - start] = j;
                }
                temp.add(arr);
                sum -= start;
                start++;
            }
        }
        return temp.toArray(new int[temp.size()][]);
    }


    //    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//    示例：
//    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//    输出：7 -> 0 -> 8
//    原因：342 + 465 = 807
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        ListNode n1 = l1;
        ListNode n2 = l2;
        int up = 0;
        while (n1 != null || n2 != null) {
            int x = n1 != null ? n1.val : 0;
            int y = n2 != null ? n2.val : 0;
            temp.next = new ListNode((up + x + y) % 10);
            up = (up + x + y) / 10;
            temp = temp.next;
            if (n1 != null) n1 = n1.next;
            if (n2 != null) n2 = n2.next;
        }
        if (up > 0) {
            temp.next = new ListNode(up);
        }
        return result.next;
    }

    //    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//    示例 1:
//    输入: "abcabcbb"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//    示例 2:
//    输入: "bbbbb"
//    输出: 1
//    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//    示例 3:
//    输入: "pwwkew"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//    请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        char[] arr = s.toCharArray();
        int x = 0;
        int y = 1;
        Map<Object, Integer> map = new HashMap();
        map.put(arr[x], x);
        int result = 0;
        while (y < arr.length) {
            if (map.containsKey(arr[y])) {
                result = (y - x) > result ? (y - x) : result;
                Integer index = map.get(arr[y]);
                for (int i = x; i < index + 1; i++) {
                    map.remove(arr[i]);
                }
                x = index + 1;
            } else {
                map.put(arr[y], y);
                y++;
            }
        }
        return 0;
    }

//    给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//    示例 1:
//    输入: [7,3,5,1,6,4]
//    输出: 5
//    解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//    注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
//    示例 2:
//    输入: [7,6,4,3,1]
//    输出: 0
//    解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }


//    给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
//    形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
//    示例 1：
//    输出：[0,2,1,-6,6,-7,9,1,2,0,1]
//    输出：true
//    解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
//    示例 2：
//    输入：[0,2,1,-6,6,7,9,-1,2,0,1]
//    输出：false
//    示例 3：
//    输入：[3,3,6,5,-2,2,5,1,-9,4]
//    输出：true
//    解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
//    提示：
//            3 <= A.length <= 50000
//            -10^4 <= A[i] <= 10^4

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int aA : A) {
            sum += aA;
        }
        int temp = sum / 3;
        if (temp * 3 == sum) {
            int sum3 = 0;
            int flag = 0;
            for (int aA : A) {
                sum3 += aA;
                if (sum3 == temp) {
                    sum3 = 0;
                    flag++;
                }
            }
            if (flag >= 3) {
                return true;
            }
        }
        return false;

    }

    //    对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
//    返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
//    示例 1：
//    输入：str1 = "ABCABC", str2 = "ABC"
//    输出："ABC"
//    示例 2：
//    输入：str1 = "ABABAB", str2 = "ABAB"
//    输出："AB"
//    示例 3：
//    输入：str1 = "LEET", str2 = "CODE"
//    输出：""
//    提示：
//            1 <= str1.length <= 1000
//            1 <= str2.length <= 1000
//    str1[i] 和 str2[i] 为大写英文字母
    public String gcdOfStrings(String str1, String str2) {
        // 假设str1是N个x，str2是M个x，那么str1+str2肯定是等于str2+str1的。
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // 辗转相除法求gcd。
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    /**
     * 求最大公因数
     * @param a
     * @param b
     * @return
     */
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
