package designpattern.datastructure;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] array=new int[]{1,2,3,4,5,6,7,8,9};
		int d=2;
		
		System.out.println(Arrays.toString(array));
		System.out.println(method1(array, 2, array.length));
		
	}
	
	
	public static int[] method1(int[] array, int shiftElement, int totalElement){
		
		int[] temp=new int[shiftElement];
		for(int i=0;i<shiftElement;i++){
			temp[i]=array[i];
		}
		System.out.println(Arrays.toString(temp));
		
		int[] temp1=new int[totalElement];
		for(int i=0;i<totalElement-1;i++){
			if(i+shiftElement < totalElement)
			temp1[i]=array[i+shiftElement];
		}
		System.out.println(Arrays.toString(temp1));
		
		return null;
	}
}
