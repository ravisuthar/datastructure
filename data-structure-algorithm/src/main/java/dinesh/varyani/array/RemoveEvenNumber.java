package dinesh.varyani.array;

import java.util.Arrays;

public class RemoveEvenNumber {
    public static void main(String[] args) {

        int[] arr={3,4,2,4,7,10,6,5,1};//3 7 5 1
        int oddCount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0)oddCount++;
        }

        int[] newArray = new int[oddCount];
        int newArrayCounter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                newArray[newArrayCounter++]=arr[i];
            }
        }

        System.out.println(Arrays.toString(newArray));
    }

}
