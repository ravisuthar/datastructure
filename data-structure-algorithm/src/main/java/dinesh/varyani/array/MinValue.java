package dinesh.varyani.array;

public class MinValue {
    public static void main(String[] args) {
        int[] arr={10,4,7,2,9,3,5,7};
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max=Math.max(arr[i], max);
        }

        System.out.println(min);
        System.out.println(max);
    }
}
