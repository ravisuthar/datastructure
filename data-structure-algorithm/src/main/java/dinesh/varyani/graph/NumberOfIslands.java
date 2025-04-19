package dinesh.varyani.graph;

/**
 * In this problem, we are given an m x n 2D binary grid,
 * which represents a map of '1's (land) and '0's (water).
 * We need to return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */
//https://www.youtube.com/watch?v=iz0T9z3V84g&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=173&ab_channel=DineshVaryani
public class NumberOfIslands {


    public static void main(String[] args) {
        char[][] matrix = new char[][]
                         {{'1', '1', '0', '0', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '1', '0', '0'},
                        {'0', '0', '0', '1', '1'}};
        System.out.println(countIsland(matrix));
    }

    private static int countIsland(char[][] matrix){
        int row= matrix.length;
        int column=matrix[0].length;
        boolean[][] visited = new boolean[row][column];
        int count=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if(!visited[i][j] && matrix[i][j]!='0'){
                    dfs(matrix, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] matrix, int i, int j, boolean[][] visited) {

        if(i<0 || j<0 ||
                i>=matrix.length || j>=matrix[i].length ||
                visited[i][j] ||
                matrix[i][j]=='0'
        ){
            return;
        }

        visited[i][j] = true;
        dfs( matrix,i+1,  j,    visited);
        dfs( matrix,i,  j+1,    visited);
        dfs( matrix,i-1,  j,  visited);
        dfs( matrix,i,  j-1,  visited);

    }
    
    /*public static void main(String[] args) {

        char[][] matrix = new char[][]
                {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        System.out.println(getIsland(matrix));
    }


    private static int getIsland( char[][] matrix){

        int row= matrix.length;
        int column=matrix[0].length;
        boolean[][] visited = new boolean[row][column];
        int count=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if(!visited[i][j] && matrix[i][j]!='0'){
                    dfs(matrix, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] matrix, int i, int j, boolean[][] visited) {

        if(i<0 || j<0 ||
          i>=matrix.length || j>=matrix[i].length ||
          visited[i][j] ||
          matrix[i][j]=='0'
        ){
            return;
        }


        visited[i][j]=true;
        dfs(matrix, i+1, j, visited);
        dfs(matrix, i, j+1, visited);
        dfs(matrix, i-1, j, visited);
        dfs(matrix, i, j-1, visited);
    }*/


}
