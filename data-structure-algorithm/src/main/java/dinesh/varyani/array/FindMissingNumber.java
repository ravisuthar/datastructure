package dinesh.varyani.array;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 8, 6, 3, 7};
        //size is 7 means n-1 so we can consider total size is 8
        //so find the sum first n natural number n*(n+1)/2

        int size = arr.length + 1;
        int sum = size * (size + 1) / 2;
        /*for (int i = 0; i < arr.length; i++) {
            sum-=arr[i];
        }*/

        //use forloop where index is not required
        for (int num : arr) {
            sum = sum - num;
        }
        System.out.println("Missing number is " + sum);
    }
}
