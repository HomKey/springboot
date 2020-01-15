package com.hk.leetcode.dichotomy;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by HomKey on 2020/1/7.
 */
@RunWith(Parameterized.class)
public class DichotomyUtilsTest {

    @Before
    public void before() {

    }

    @After
    public void after() {

    }

    @BeforeClass
    public static void beforeClass() {

    }

    @AfterClass
    public static void afterClass() {

    }

    // 第二步
    private int[] array;
    private int target;
    private int expected;

    // 第三步
    @Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                {null, 1, -1},
                {new int[0], 1, -1},
                {new int[]{0, 0}, 1, -1},
                {new int[]{0, 1, 1}, 1, 1},
                {new int[]{0, 1, 2}, 1, 1},
                {new int[]{0, 1, 3}, 2, 2},
                {new int[]{0, 1, 3, 5}, 6, -1},
                {new int[]{0, 1, 2, 3, 4}, 1, 1},
                {new int[]{0, 1, 3, 3, 3, 5}, 4, 5},
                {new int[]{0, 1, 3, 3, 3, 5}, 3, 2}
        });
    }

    public DichotomyUtilsTest(int[] array, int target, int expected) {
        this.array = array;
        this.target = target;
        this.expected = expected;
    }

    @Test
    public void findFirstEqualOrLargerIndex() throws Exception {
        assertEquals(expected, DichotomyUtils.findFirstEqualOrLargerIndex(array, target));
    }

}