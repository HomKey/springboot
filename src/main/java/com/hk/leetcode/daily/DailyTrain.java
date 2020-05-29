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
     *
     * @param a
     * @param b
     * @return
     */
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


    //    字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
//    示例1:
//    输入："aabcccccaaa"
//    输出："a2b1c5a3"
//    示例2:
//    输入："abbccd"
//    输出："abbccd"
//    解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
//    提示：
//    字符串长度在[0, 50000]范围内。
    public String compressString(String S) {
        if (S == null || S.length() < 2) {
            return S;
        }
        char[] chars = S.toCharArray();
        int count = 1;
        int size = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < S.length(); i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                size += count;
                stringBuffer.append(chars[i - 1]).append(count);
                count = 1;
            }
        }
        stringBuffer.append(chars[S.length() - 1]).append(count);
        return stringBuffer.length() >= S.length() ? S : stringBuffer.toString();
    }

    //    给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
//    假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
//    注意：每次拼写时，chars 中的每个字母都只能用一次。
//    返回词汇表 words 中你掌握的所有单词的 长度之和。
//    示例 1：
//    输入：words = ["cat","bt","hat","tree"], chars = "atach"
//    输出：6
//    解释：
//    可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
//    示例 2：
//    输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//    输出：10
//    解释：
//    可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
//    提示：
//            1 <= words.length <= 1000
//            1 <= words[i].length, chars.length <= 100
//    所有字符串中都仅包含小写英文字母
    public int countCharacters(String[] words, String chars) {
        int[] array = new int[26];
        for (char item : chars.toCharArray()) {
            ++array[item - 'a'];
        }
        int result = 0;
        for (String word : words) {
            if (word.length() > chars.length()) {
                continue;
            }
            result += word.length();
            int[] wordArray = new int[26];
            for (char item : word.toCharArray()) {
                ++wordArray[item - 'a'];
            }
            for (int i = 0; i < array.length; i++) {
                if (wordArray[i] > array[i]) {
                    result -= word.length();
                    break;
                }
            }
        }
        return result;
    }

    //    矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。
//    如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。
//    给出两个矩形，判断它们是否重叠并返回结果。
//    示例 1：
//    输入：rec1 = [0,0,2,2], rec2 = [1,1,3,3]
//    输出：true
//    示例 2：
//    输入：rec1 = [0,0,1,1], rec2 = [1,0,2,1]
//    输出：false
//    说明：
//    两个矩形 rec1 和 rec2 都以含有四个整数的列表的形式给出。
//    矩形中的所有坐标都处于 -10^9 和 10^9 之间。
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[0] >= rec2[2] || rec1[2] <= rec2[0] || rec1[3] <= rec2[1] || rec1[1] >= rec2[3]);
    }

    //    给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
//    如果有两个中间结点，则返回第二个中间结点。
//    示例 1：
//    输入：[1,2,3,4,5]
//    输出：此列表中的结点 3 (序列化形式：[3,4,5])
//    返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
//    注意，我们返回了一个 ListNode 类型的对象 ans，这样：
//    ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
//            示例 2：
//    输入：[1,2,3,4,5,6]
//    输出：此列表中的结点 4 (序列化形式：[4,5,6])
//    由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
//    提示：
//    给定链表的结点数介于 1 和 100 之间。
//    [1,2,3,4,5]
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //    示例 1：
//    输入： [1,2,3,1]
//    输出： 4
//    解释： 选择 1 号预约和 3 号预约，总时长 = 1 + 3 = 4。
//    示例 2：
//    输入： [2,7,9,3,1]
//    输出： 12
//    解释： 选择 1 号预约、 3 号预约和 5 号预约，总时长 = 2 + 9 + 1 = 12。
//    示例 3：
//    输入： [2,1,4,5,3,1,1,3]
//    输出： 12
//    解释： 选择 1 号预约、 3 号预约、 5 号预约和 8 号预约，总时长 = 2 + 4 + 3 + 3 = 12。
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
//    递推方程：dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
    public int massage(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
//        int a = 0, b = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int c = Math.max(b, a + nums[i]);
//            a = b;
//            b = c;
//        }
//        return b;
    }

    //    给定一副牌，每张牌上都写着一个整数。
//    此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
//    每组都有 X 张牌。
//    组内所有的牌上都写着相同的整数。
//    仅当你可选的 X >= 2 时返回 true。
//    示例 1：
//    输入：[1,2,3,4,4,3,2,1]
//    输出：true
//    解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
//    示例 2：
//    输入：[1,1,1,2,2,2,3,3]
//    输出：false
//    解释：没有满足要求的分组。
//    示例 3：
//    输入：[1]
//    输出：false
//    解释：没有满足要求的分组。
//    示例 4：
//    输入：[1,1]
//    输出：true
//    解释：可行的分组是 [1,1]
//    示例 5：
//    输入：[1,1,2,2,2,2]
//    输出：true
//    解释：可行的分组是 [1,1]，[2,2]，[2,2]
//            1 <= deck.length <= 10000
//            0 <= deck[i] < 10000
    public boolean hasGroupsSizeX(int[] deck) {
        return false;
    }

    //    0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
//    例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
//    示例 1：
//    输入: n = 5, m = 3
//    输出: 3
//    示例 2：
//    输入: n = 10, m = 17
//    输出: 2
//    限制：
//            1 <= n <= 10^5
//            1 <= m <= 10^6
//    约瑟夫环问题 n = 5, m = 3
//    第四轮反推，补上 m 个位置，然后模上当时的数组大小 2，位置是(0 + 3) % 2 = 1。
//    第三轮反推，补上 m 个位置，然后模上当时的数组大小 3，位置是(1 + 3) % 3 = 1。
//    第二轮反推，补上 m 个位置，然后模上当时的数组大小 4，位置是(1 + 3) % 4 = 0。
//    第一轮反推，补上 m 个位置，然后模上当时的数组大小 5，位置是(0 + 3) % 5 = 3。
//    所以最终剩下的数字的下标就是3。因为数组是从0开始的，所以最终的答案就是3。
    public int lastRemaining(int n, int m) {
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }

//    给你一个整数数组 nums，将该数组升序排列。
//    示例 1：
//    输入：nums = [5,2,3,1]
//    输出：[1,2,3,5]
//    示例 2：
//    输入：nums = [5,1,1,2,0,0]
//    输出：[0,0,1,1,2,5]
//    提示：
//            1 <= nums.length <= 50000
//            -50000 <= nums[i] <= 50000
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    // 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法
    public int waysToChange(int n) {
        return 1;
    }
}
