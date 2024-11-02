package grokking.algorithms;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BinerySearch {
    public static void main(String[] args) {

        System.out.println(new BinerySearch().bsearch(IntStream.range(1,10000004).toArray(),151264));
    }


    private int bsearch(int[] nums, int target){

        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            count++;
            int mid= left+(right-left)/2;
            if(mid==target) return count;
            else if(target < mid) right=mid;
            else left=mid+1;
        }

        return count;
    }
}
