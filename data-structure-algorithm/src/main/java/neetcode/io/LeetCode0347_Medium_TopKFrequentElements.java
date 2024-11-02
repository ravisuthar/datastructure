package neetcode.io;

import java.util.*;
//https://leetcode.com/problems/top-k-frequent-elements/

/**
 * 347. Top K Frequent Elements
 *
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class LeetCode0347_Medium_TopKFrequentElements {

    //time: o(n)+nlogn for sorting
    //space= o(n)
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new TreeMap<>(); //keys are sorted, not counts!!
        /*for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }else{
                map.put(nums[i], 1);
            }
        }*/

        //above code can be written as
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return map.entrySet()
                .stream()
                .sorted((x, y) -> y.getValue().compareTo(x.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }


    public static int[] topKFrequent_Java(int[] nums, int k) {

        Map<Integer, Integer> map = new TreeMap<>(); //keys are sorted, not counts!!

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        //max heap we have to use
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        map.entrySet().forEach(queue::add);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }

    //1->3
    //2->2
    //1->1
    //[1,2,1] ->max index has max value
    //from discussion
    //Java O(n) Solution - Bucket Sort
    public static int[] topKFrequent_on(int[] nums, int k) {

        //List<Integer>[] bucket = new List[nums.length + 1];
        int[] bucket = new int[nums.length];
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            bucket[frequency] = key;
        }

       // List<Integer> res = new ArrayList<>();
        int[] result = new int[k];
        int idx=0;
        for (int pos = bucket.length - 1; pos >= 0 && result.length < k; pos--) {
            //if (bucket[pos] != null) {
            //    res.addAll(bucket[pos]);
           // }

                result[idx++] = bucket[pos];

        }
        return result; //res.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent_Java(new int[]{1, 1, 1, 2, 2, 3}, 2))); //output=1,2
        System.out.println(Arrays.toString(topKFrequent_Java(new int[]{1}, 1))); //output=1,2
        System.out.println(Arrays.toString(topKFrequent_Java(new int[]{4, 1, -1, 2, -1, 2, 3}, 2)));
        //1->3
        //2->2
        //3->1
    }
}
