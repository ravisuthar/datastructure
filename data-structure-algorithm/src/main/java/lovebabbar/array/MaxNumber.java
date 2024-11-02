package lovebabbar.array;

//https://www.geeksforgeeks.org/maximum-number-by-concatenating-every-element-in-a-rotation-of-an-array/
public class MaxNumber {

    // Function to print the largest number
    static void printLargest(int a[], int n)
    {
        // store the index of largest
        // left most digit of elements
        int max = -1;
        int ind = -1;

        // Iterate for all numbers
        for (int i = 0; i < n; i++) {
            int num = a[i];

            // check for the last digit
            while (num > 0) {
                int r = num % 10;
                num = num / 10;
                if (num == 0) {
                    // check for the largest left most digit
                    if (max < r) {
                        max = r;
                        ind = i;
                    }
                }
            }
        }
        // print the largest number

        // print the rotation of array
        for (int i = ind; i < n; i++)
            System.out.print(a[i]);

        // print the rotation of array
        for (int i = 0; i < ind; i++)
            System.out.print(a[i]);
    }

    // Driver Code
    public static void main(String args[])
    {
        int a[] = { 54, 546, 568, 60 };
        int n = a.length;
        printLargest(a, n);
    }
}
