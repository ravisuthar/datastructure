package dinesh.varyani.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//{2 11 5 10 7 8} target=9
//return 0 4 index
public class TwoSum {

    //Time: O(n)
    //space: o(n)
    private static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {//9-7=2 ?
                result[0] = map.get(target - arr[i]);
                result[1] = i;
                break;
            } else {
                map.put(arr[i], i);//{2,0} {11,1}, {5,2}, {10,3}, {7,4}
            }
        }

        return result;
    }

    //2 5 7 8 10 11
    //using two pointer approach
    private static int[] twoSumUsingTwoPointers(int[] arr, int target) {
        Arrays.sort(arr); //o(nlogn)
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{left, right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return new int[]{0,0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumUsingTwoPointers(new int[]{2,11,5,10,7,8}, 9)));
    }
}
