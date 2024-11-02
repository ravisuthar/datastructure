package dinesh.varyani.matrix;

/**
 * Given a row and column wise (m*n) sorted matrix.
 * write a program to search a key in a given matrix
 */


/**
 * 10 20 30 40
 * 15 25 35 45
 * 27 29 37 48
 * 32 33 39 51
 */
public class SearchKey {

    public boolean searchKey(int[][] matrix, int size, int key) {
        int i = 0;
        int j = size - 1;

        while (i < size && j >= 0) {

            if (matrix[i][j] == key) {
                System.out.println("found key");
                return true;
            }

            if (matrix[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51}};
        int size = 4;
        int key = 34;

        SearchKey program = new SearchKey();
        System.out.println(program.searchKey(matrix, size, key));
    }
}
