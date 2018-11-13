package datastructure.array;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] a=new int[]{2,8,6};
		int[] b=new int[a.length];
		
		b=a;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
}
