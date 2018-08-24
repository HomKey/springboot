package com.hk.leetcode;

import com.hk.leetcode.common.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuHj on 2018/8/1.
 */
public class Solution {
    /**
     给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
     给定 nums = [2, 7, 11, 15], target = 9
     因为 nums[0] + nums[1] = 2 + 7 = 9
     所以返回 [0, 1]
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        // 嵌套循环暴力
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[] { i, j };
//                }
//            }
//        }
        // 分表两遍哈希表
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // 遍历一次
        // Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }
    /**
     给定一个字符串，找出不含有重复字符的最长子串的长度。
     示例：
     给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
     给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
     给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
     */
    public String lengthOfLongestSubstring(String s) {
        String result = "";
        String str = ""; // 临时
        for (int i=0;i<s.length();i++){
            String curStr = String.valueOf(s.charAt(i));
            if (str.indexOf(curStr) < 0){
                str += curStr;
            }else{
                result = str.length() > result.length() ? str : result;
                str = str.substring(str.indexOf(curStr) + 1) + curStr;
            }
        }
        // 最后判断
        result = str.length() > result.length() ? str : result;
        return result + " : " + result.length();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] twoSums = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
//        for (int temp : twoSums) {
//            System.out.println(temp);
//        }

        System.out.println(solution.lengthOfLongestSubstring("abcabcbbavsdfg"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkewabcdsfefs"));

    }
}
