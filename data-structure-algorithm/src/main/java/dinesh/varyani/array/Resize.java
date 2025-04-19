package dinesh.varyani.array;

import java.util.Arrays;

public class Resize {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int[] newArray = resize(arr, 10);
        System.out.println(Arrays.toString(newArray));

    }

    //java is pass by value
    //Any changes in the content of array through that reference will affect the original array. arr[0]=newValue works
    //But changing the reference to point to a new array will not change the existing reference in original method. arr=newSizeArray; will not work.
    private static int[] resize(int[] arr, int size) {
        int[] newSizeArray = new int[size];
        for (int i = 0; i < arr.length; i++) {
            newSizeArray[i] = arr[i];
        }
        arr=newSizeArray;//reassignmetn wont work
        //we have to return the result
        return arr;
    }
}
