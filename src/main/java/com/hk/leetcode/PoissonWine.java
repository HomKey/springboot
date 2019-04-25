package com.hk.leetcode;

import java.util.Random;

/**
 * Created by LuHj on 2019/3/6.
 */
public class PoissonWine {
    private int[] t1;
    private int[] t2;
    private int[] t3;

    public PoissonWine(int[] t1, int[] t2, int[] t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public int getResult(){
        int count = 0;
        while (true) {
            if (t1[1] == getShareResult() || t2[1] == getShareResult() || t3[1] == getShareResult()) {
                break;
            }
        }
        return count;
    }

    private void pour(int[] source, int[] target){
        if (target[1] < target[0] && source[1] > 0){
            int temp = target[0] - target[1];
            if (source[1] >= temp){
                source[1] = source[1] - temp;
                target[1] = target[0];
            }else{
                target[1] = target[1] + source[1];
                source[1] = 0;
            }
            print();
        }
    }

    private int getShareResult(){
        int sum = t1[1] + t2[1] + t3[1];
        return sum / 2 ;
    }

    private void print() {
        System.out.println(t1[1] + " " + t2[1] + " " + t3[1]);
    }

    public static void main(String[] args) {
        PoissonWine poissonWine = new PoissonWine(new int[]{19,0},new int[]{13,13},new int[]{7,7});
        int result = poissonWine.getResult();
        System.out.println(result);
    }

}
