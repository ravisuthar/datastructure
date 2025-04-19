package abdul.bari;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] a = new int[]{2, 8, 15, 18};
        int[] b = new int[]{5, 9, 12, 17};
        int[] c = new int[a.length+b.length];//2


        int i=0, j=0, k=0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }


        for(;i<a.length;i++){
            c[k++] = a[i++];
        }


        for(;j<b.length;j++){
            c[k++] = b[j++];
        }

        System.out.println(Arrays.toString(c));
    }


    /*public static void main(String[] args) {
        int[] a = new int[]{2, 8, 15, 18};
        int[] b = new int[]{5, 9, 12, 17};
        int[] c = new int[a.length+b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }

        for(;i<a.length;i++){
            c[k++]=a[i];
        }

        for(;j<b.length;j++){
            c[k++]=b[j];
        }

        System.out.println(Arrays.toString(c));
    }*/
}
