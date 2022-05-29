package leetcode;

import must.doo.Solution1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

    private Solution1 unitUnderTest = new Solution1();

    @Test
    void test1() {
        Assertions.assertArrayEquals(new int[]{1, 2}, unitUnderTest.twoSum_solution_1(new int[]{3, 2, 4}, 6));

    }

    @Test
    void test2() {
         Assertions.assertArrayEquals(new int[]{1, 2}, unitUnderTest.twoSum_solution_2(new int[]{3, 2, 4}, 6));
     }

    @Test
    void test3() {
        Assertions.assertArrayEquals(new int[]{1, 2}, unitUnderTest.twoSum_solution_3(new int[]{3, 2, 4}, 6));
    }

}
