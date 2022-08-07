package leetcode.must.doo;

//https://leetcode.com/problems/kth-missing-positive-number/discuss/876751/Java-1-liner-O(n)-simplest-easy-to-understand-beats-100
public class LeetCode1539 {
    public static void main(String[] args) {

        System.out.println(new LeetCode1539().findKthPositive(new int[]{2,3,4,7,11}, 5));
        System.out.println(new LeetCode1539().findKthPositive(new int[]{1,2,3,4}, 2));
    }

    public int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k) k++;
            else break;
        }
        return k;
    }

    public int findKthPositiveMy(int[] arr, int k) {

        for(int i=1,j=0,count=0;i<1000;i++){
            if(arr[j]==i-1){
                j++;
            }else{
                count++;
            }
            if(k==count) return i;
        }

        return -1;
    }
}
