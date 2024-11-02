package designpattern.datastructure.array;

import java.util.Arrays;

public class ArrayIncrease {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		 
		//int[] copied = new int[arr.length];
		//System.arraycopy(arr, 0, copied, 1, 5);//5 is the length to copy
		//System.arraycopy(arr, 0, copied, 0, arr.length);
		
		int[] copied = Arrays.copyOf(arr, 50); //50 the the length of the new array
		System.out.println(Arrays.toString(copied));
	}
}
