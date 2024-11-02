package leetcode.must.doo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode0053Test {

    private LeetCode0053 unitUnderTest = new LeetCode0053();

    @Test
    void bruteForce() {
        Assertions.assertEquals(6, unitUnderTest.bruteForce(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assertions.assertEquals(23, unitUnderTest.bruteForce(new int[]{5,4,-1,7,8}));
        Assertions.assertEquals(1, unitUnderTest.bruteForce(new int[]{1}));
    }

    @Test
    void kadanesAlgorith() {
        Assertions.assertEquals(6, unitUnderTest.kadanesAlgorith(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assertions.assertEquals(23, unitUnderTest.kadanesAlgorith(new int[]{5,4,-1,7,8}));
        Assertions.assertEquals(1, unitUnderTest.kadanesAlgorith(new int[]{1}));
    }
}
