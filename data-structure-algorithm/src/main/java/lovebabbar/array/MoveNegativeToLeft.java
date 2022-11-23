package lovebabbar.array;


import java.util.Arrays;

//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
public class MoveNegativeToLeft {
    public static void main(String[] args) {

        int[] a = new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6};
        dutchNationProblem(a);
        System.out.println(Arrays.toString(a));
    }

    static void dutchNationProblem(int[] a){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            if(a[left]<=0){
                left++;
            }else{
                int temp = a[left];
                a[left]=a[right];
                a[right]=temp;
                right--;
            }
        }
    }


    //using two pointer can be solved.
    static void sort(int[] a) {

        int left = 0;
        int right = a.length - 1;


        while (left <= right) {

            if (a[left] < 0 && a[right] < 0) {
                left++;
            }

           else if (a[left] >= 0 && a[right] < 0) {
                int temp = a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }

            else if(a[left] < 0 && a[right] >=0){
                left++;
                right--;
            }
        }
    }
}
