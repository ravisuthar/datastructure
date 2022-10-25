package dinesh.varyani.stack;

import java.util.Arrays;

//{4,7,3,4,8,1} -> {7,8,4,8,-1,-1}
public class NextHighestGreaterElement {

    private int[] usingSingleForLoop(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentValue = arr[i];
            if (max < currentValue) {
                max = -1;
            }
            arr[i] = max;
            if (currentValue > max) {
                max = currentValue;
            }
        }
        return arr;
    }


    //printing next subsequent greater element
    private void usingStack(int[] arr) {
        int i = 0;
        Stack<Integer> s = new Stack<Integer>();
        int element, next;

        /* push the first element to stack */
        s.push(arr[0]);

        // iterate for rest of the elements
        for (i = 1; i < arr.length; i++) {
            next = arr[i];

            if (s.isEmpty() == false) {

                // if stack is not empty, then
                // pop an element from stack
                element = s.pop();

                /* If the popped element is smaller than
                   next,
                   then
                    a) print the pair
                    b) keep popping while elements are smaller and stack is not empty */
                while (element < next) {
                    System.out.println(element + " --> " + next);
                    if (s.isEmpty() == true)
                        break;
                    element = s.pop();
                }

                /* If element is greater than next, then
                   push the element back */
                if (element > next)
                    s.push(element);
            }

            /* push next to stack so that we can find next
               greater for it */
            s.push(next);
        }

        /* After iterating over the loop, the remaining
           elements in stack do not have the next greater
           element, so print -1 for them */
        while (s.isEmpty() == false) {
            element = s.pop();
            next = -1;
            System.out.println(element + " -- " + next);
        }
    }

    //time o(n^2)
    //space O(1)
    private int[] twoForLoops(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int next = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    next = arr[j];
                }
            }
            arr[i] = next;
        }
        return arr;
    }

    public static void main(String[] args) {
        NextHighestGreaterElement nextHighestGreaterElement = new NextHighestGreaterElement();
        int[] result = nextHighestGreaterElement.usingSingleForLoop(new int[]{2, 8, 9, 6, 7});
        System.out.println(Arrays.toString(result));
    }
}
