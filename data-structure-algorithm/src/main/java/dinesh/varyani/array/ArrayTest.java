package dinesh.varyani.array;

public class ArrayTest {
    public static void main(String[] args) {


        int[] i = {1, 2, 3, 4};
        long[] l = new long[1];
        byte[] b = new byte[2];
        short[] s = new short[2];
        char[] c = new char[2];
        float[] f = new float[2];
        double[] d = new double[2];
        boolean[] boo = new boolean[2];

        int[] ii = new int[Integer.MAX_VALUE];
        //long[] ll = new long[Long.MAX_VALUE]; not allowed
        long[] ll = new long[Integer.MAX_VALUE]; //allowed


        int[] numbers = new int[]{1, 2, 3, 4, 5};

        //two dim
        int[][] matrix = new int[2][];//second is optional
        int[][] d2 = new int[][]{{1, 2, 3}, {1, 23}, {2}};//second is optional


        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 1;
        myArray[3] = 1;
        myArray[4] = 1;
        //myArray[5] = 1; // index out of bound. index is n-1


    }
}
