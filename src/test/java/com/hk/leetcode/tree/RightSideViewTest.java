package com.hk.leetcode.tree;

import com.hk.leetcode.common.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RightSideViewTest {

    private TreeNode treeNode;
    private List<Integer> expected;

    public RightSideViewTest(TreeNode treeNode, List<Integer> expected) {
        this.treeNode = treeNode;
        this.expected = expected;
    }

    // 第三步
    @Parameterized.Parameters
    public static Collection words() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.left.right = new TreeNode(5);
        treeNode1.right = new TreeNode(3);
        treeNode1.right.right = new TreeNode(4);

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);
        treeNode2.left.left = new TreeNode(4);

        TreeNode treeNode3 = new TreeNode(4);
        treeNode3.left = new TreeNode(3);
        treeNode3.right = new TreeNode(6);
        treeNode3.left.left = new TreeNode(1);
        treeNode3.right.left = new TreeNode(5);
        treeNode3.left.left.right = new TreeNode(2);

        return Arrays.asList(new Object[][]{
                {treeNode1, Arrays.asList(1, 3, 4)},
                {treeNode2, Arrays.asList(1, 3, 4)},
                {treeNode3, Arrays.asList(4, 6, 5, 2)},
        });
    }

    @Test
    public void rightSideView() {
        RightSideView rightSideView = new RightSideView();
        List<Integer> integers = rightSideView.rightSideView(treeNode);
        System.out.println(String.join(",", integers.toString()));
    }

    @Test
    public void test(){
        assertEquals(3*0.1 == 0.3 , true);
        assertEquals(4*0.1 == 0.4 , true);
    }
}