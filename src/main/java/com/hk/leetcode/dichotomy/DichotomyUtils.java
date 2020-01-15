package com.hk.leetcode.dichotomy;

/**
 * Created by HomKey on 2020/1/7.
 */
public class DichotomyUtils {

    /**
     * 查找递增数组中第一个大于等于某个给定值的元素
     * @param array
     * @param target
     * @return -1 没有找到，正确返回下标
     */
    public static int findFirstEqualOrLargerIndex(int[] array, int target){
        if (array == null || array.length == 0){
            return -1;
        }
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex != endIndex){
            int middle = (endIndex - startIndex) / 2 + startIndex;
            if (middle == startIndex) return middle;
            if (array[middle] >= target){
                endIndex = middle;
            }else{
                startIndex = middle;
            }
        }
        return -1;
    }

}
