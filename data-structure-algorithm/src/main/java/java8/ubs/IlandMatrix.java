package java8.ubs;

public class IlandMatrix {
    public static void dfs(int[][] matrix, boolean[][] visited, int i, int j) {
        // add bounds checking
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
            return;
        }

        // base case: if the current cell is not a 1 or if it has already been visited, return
        if (matrix[i][j] != 1 || visited[i][j]) {
            return;
        }

        // mark the current cell as visited
        visited[i][j] = true;

        // traverse the neighbors of the current cell (up, down, left, right)
        dfs(matrix, visited, i + 1, j);
        dfs(matrix, visited, i - 1, j);
        dfs(matrix, visited, i, j + 1);
        dfs(matrix, visited, i, j - 1);
    }

    public static int countIslands(int[][] matrix) {
        // create a boolean matrix to track which cells have been visited
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    // if the current cell is an unvisited 1, it is part of a new island
                    // perform a depth-first search to visit all cells in the island
                    dfs(matrix, visited, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        int[][] matrix2 = {
                {0, 0},
                {0, 0}
        };

        int numIslands = countIslands(matrix2);
        System.out.println("Number of islands: " + numIslands);
    }
}
