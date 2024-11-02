package morgonstanely;

public class MaximumProductSubArray {

    public static void main(String[] args) {
        System.out.println(product(new int[]{-1, 2, 3, -2, 4}));
    }


    private static int prod(int[] arr) {
        int left = 0;
        int right = left + 1;
        int maxResult = 1;
        while (right < arr.length) {
            int temp = arr[left] * arr[right];
            if (temp > maxResult) {
                maxResult = temp;
            }
        }

        return maxResult;
    }

    //Ajio ->my program - not working
    private static int product(int[] arr) {

        int result = 1;

        for (int i = 0; i < arr.length; i++) {

            int left = i;
            int right = i + 1;

            int mul = arr[i];
            while (right < arr.length) {

                result = Math.max(result, mul);//6
                mul = result * arr[right];//-12

            }

            result = Math.max(result, mul);
        }

        return result;
    }
}
