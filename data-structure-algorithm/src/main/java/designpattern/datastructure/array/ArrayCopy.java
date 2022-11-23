package designpattern.datastructure.array;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] a=new int[]{2,8,6};
		int[] b=new int[a.length];
		
		b=a;

		//this is not a copy both a and b refernece variable are pointing to same array object.
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
}
