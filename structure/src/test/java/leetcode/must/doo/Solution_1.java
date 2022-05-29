package leetcode.must.doo;

import org.junit.Assert;
import org.junit.Test;

class Solution_1 {

    private Solution1 unit_under_Test = new Solution1();


    @Test
    void test_solution_1_brute_force(){
        Assert.assertEquals(new int[]{1,2}, unit_under_Test.twoSum_solution_1(new int[]{3,2,4}, 6));
    }

}
