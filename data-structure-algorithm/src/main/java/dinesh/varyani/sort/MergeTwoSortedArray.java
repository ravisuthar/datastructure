package dinesh.varyani.sort;

import java.util.Arrays;

public class MergeTwoSortedArray {

    private static int[] sort(int[] a, int[] b ){

        int i=0;
        int j=0;
        int k=0;

        int[] result = new int[a.length+b.length];

        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                result[k++]=a[i++];
            }else{
                result[k++]=b[j++];
            }
        }

        for (; i< a.length ;) { //replace with while loop
            result[k++]=a[i++];
        }

        for (; j< b.length ;) {//replace with while loop
            result[k++]=b[j++];
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(new int[]{2,3,5,10,11}, new int[] {4,6,7,9,12,15,19})));
    }
}
