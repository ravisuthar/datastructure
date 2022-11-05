package neetcode.io;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 * 36. Valid Sudoku
 *
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 *
 */
public class LeetCode0036_Medium_Valid_Sudoku {


    public static boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> columnSet = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            for (int column = 0; column < board[row].length; column++) {
                System.out.println("board[" + row + "][" + column + "] " + board[row][column]);
                if (board[row][column] != '.' && !rowSet.add(board[row][column])) {
                    return false;
                }
                if (board[column][row] != '.' && !columnSet.add(board[column][row])) {
                    return false;
                }

                //this is important logic
                /**
                 * Great solution!. Just trying to explain how to think about % and /. These two operators can be helpful for matrix traversal problems.
                 *
                 * For a block traversal, it goes the following way.
                 *
                 * 0,0, 0,1, 0,2; < --- 3 Horizontal Steps followed by 1 Vertical step to next level.
                 *
                 * 1,0, 1,1, 1,2; < --- 3 Horizontal Steps followed by 1 Vertical step to next level.
                 *
                 * 2,0, 2,1, 2,2; < --- 3 Horizontal Steps.
                 *
                 * And so on...
                 * But, the j iterates from 0 to 9.
                 *
                 * But we need to stop after 3 horizontal steps, and go down 1 step vertical.
                 *
                 * Use % for horizontal traversal. Because % increments by 1 for each j : 0%3 = 0 , 1%3 = 1, 2%3 = 2, and resets back. So this covers horizontal traversal for each block by 3 steps.
                 *
                 * Use / for vertical traversal. Because / increments by 1 after every 3 j: 0/3 = 0; 1/3 = 0; 2/3 =0; 3/3 = 1.
                 *
                 * So far, for a given block, you can traverse the whole block using just j.
                 *
                 * But because j is just 0 to 9, it will stay only first block. But to increment block, use i. To move horizontally to next block, use % again : ColIndex = 3 * i%3 (Multiply by 3 so that the next block is after 3 columns. Ie 0,0 is start of first block, second block is 0,3 (not 0,1);
                 *
                 * Similarly, to move to next block vertically, use / and multiply by 3 as explained above. Hope this helps.
                 */
                int RowIndex = 3 * (row / 3);
                int ColIndex = 3 * (row % 3);

                System.out.println("RowIndex: "+RowIndex+" ColIndex:"+ColIndex+" board["+(RowIndex + column / 3)+"]["+(ColIndex + column % 3)+"]: "+board[RowIndex + column / 3][ColIndex + column % 3]);
                if (board[RowIndex + column / 3][ColIndex + column % 3] != '.' && !cube.add(board[RowIndex + column / 3][ColIndex + column % 3]))
                    return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        char[][] board1 = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(board1));

        char[][] board2 = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
       // System.out.println(isValidSudoku(board2));
    }

}
