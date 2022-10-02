package leetcode.must.doo;

public class BinarySearchTest {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,6,6,6,7,8,9,9,9};
        System.out.println(binarySearch(arr, 9));//4
    }

    private static int binarySearch(int[] arr, int target){
        int start=0;
        int last=arr.length-1;
        while(start<=last){
            int mid = (start+last)/2;
            if(arr[mid]==target){
                while(arr[mid]==target){
                    mid= mid-1;
                }
                return mid+1;
            }else if(target < arr[mid]){
                last=mid;
            }else{
                start=mid;
            }
        }
        return -1;
    }
}
