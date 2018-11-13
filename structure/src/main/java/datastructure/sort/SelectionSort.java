package datastructure.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] a = { 12, 5, 19, 26, 45, 78, 35, 58, 56, 25, 9 };

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					min = j;
					System.out.println("i="+i+", j="+j+", min="+min+", a[i]=" +a[i] +",  a[j]="+ a[j]);
				}
				
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
			

		}

		System.out.println(Arrays.toString(a));

	}
}
