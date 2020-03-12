package com.hk.leetcode.daily;

import com.hk.leetcode.common.ListNode;
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

    @Test
    public void findContinuousSequence() throws Exception {
        int[][] continuousSequence = dailyTrain.findContinuousSequence(1);
        System.out.println(continuousSequence);
    }

    @Test
    public void addTwoNumbers() throws Exception {
//        [2,4,3]
//[5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = dailyTrain.addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
    }

    @Test
    public void lengthOfLongestSubstring() throws Exception {

    }

    @Test
    public void canThreePartsEqualSum() throws Exception {
        int[] A = new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
        int[] B = new int[]{10,-10,10,-10,10,-10,10,-10};
        boolean b = dailyTrain.canThreePartsEqualSum(B);
        System.out.println(b);
    }
}