package dinesh.varyani.stack;

import java.util.Arrays;

/**
 * {4,7,3,4,8,1} -> {7,8,4,8,-1,-1}
 * next greater element
 */
public class NextGreaterElement {

    //next
    private int[] twoForLoops(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            ravi:
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    arr[i]=arr[j];
                    break ravi;
                }
            }
        }

        return arr;
    }

    private int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peep() <= arr[i]) {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peep();
            }

            stack.push(arr[i]);
        }


        return result;
    }

    public static void main(String[] args) {

        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] result = nextGreaterElement.twoForLoops(new int[]{4, 7, 3, 4, 8, 1});
        System.out.println(Arrays.toString(result));
    }
}
