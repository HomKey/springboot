package com.hk.leetcode.tree;

import com.hk.leetcode.common.TreeNode;
import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {
    //    输入: [1,2,3,null,5,null,4]
//    输出: [1, 3, 4]
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        result.add(root.val);
        while (treeNodes.size() > 0) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode treeNode : treeNodes) {
                if (treeNode.left != null) {
                    temp.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    temp.add(treeNode.right);
                }
            }
            if (temp.size() > 0){
                result.add(temp.get(temp.size() - 1).val);
            }
            treeNodes = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        Object o1 = 1;
        Object o2 = 0.3;
        Object o3 = 0.1 * 3;
        Object o4 = 0.4;
        Object o5 = 0.1 * 4;
        System.out.println(o2 == o3);// false
        System.out.println(0.3 == 0.1*3);// false
        System.out.println(0.1*3);
        System.out.println(o4 == o5);// false
        System.out.println(0.4 == 0.1*4);// true
        System.out.println(0.1*4);
        System.out.println(o1.getClass().getName());
        System.out.println(o2.getClass().getName());
        System.out.println(o3.getClass().getName());
    }
}
