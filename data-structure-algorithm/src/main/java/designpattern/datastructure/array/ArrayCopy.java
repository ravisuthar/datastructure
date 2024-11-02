package designpattern.datastructure.array;

import java.util.Arrays;
import java.util.List;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] a=new int[]{2,8,6};
		int[] b=new int[a.length];
		
		b=a;
		List.of(1,2,3,4,5,6,7,8,9,0,11,111,123,1231,235,236,37,458,5678);

		//this is not a copy both a and b refernece variable are pointing to same array object.
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
}
