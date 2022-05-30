package leetcode.must.doo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2Test {

    private Solution2 unitUnderTest = new Solution2();

    @Test
    void test1() {
        Assertions.assertEquals(3, unitUnderTest.leetCode("abcabca"));
        Assertions.assertEquals(1, unitUnderTest.leetCode("bbbbb"));
        Assertions.assertEquals(3, unitUnderTest.leetCode("pwwkew"));
    }

    @Test
    void test2() {
        Assertions.assertEquals(3, unitUnderTest.dineshVaryani("abcabca"));
        Assertions.assertEquals(1, unitUnderTest.dineshVaryani("bbbbb"));
        Assertions.assertEquals(3, unitUnderTest.dineshVaryani("pwwkew"));
    }
}
