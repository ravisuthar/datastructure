package dinesh.varyani.matrix;

public class TraverseInSpiralForm {


    public void spiralPrint(int[][] matrix, int row, int column){
        int rowPointer = 0; // rowPointer -> row
        int columnPointer = 0; // columnPointer -> column

        while(rowPointer < row && columnPointer < column){
            // left to right --> column varies --> columnPointer -> column - 1, row remains constant
            for(int i = columnPointer; i < column; i++){
                System.out.print(matrix[rowPointer][i] + " ");
            }
            rowPointer++;
            // top to bottom --> row varies --> rowPointer -> row - 1, column remains constant
            for(int i = rowPointer; i < row; i++){
                System.out.print(matrix[i][column - 1] + " ");
            }
            column--;
            if(rowPointer < row){
                // right to left --> column varies --> column - 1 -> columnPointer, row remains constant
                for(int i = column - 1; i >= columnPointer; i--){
                    System.out.print(matrix[row - 1][i] + " ");
                }
                row--;
            }
            if(columnPointer < column){
                // bottom to top --> row varies --> row - 1 -> rowPointer, column remains constant
                for(int i = row - 1; i >= rowPointer; i--){
                    System.out.print(matrix[i][columnPointer] + " ");
                }
                columnPointer++;
            }
        }
    }



    public static void main(String[] args) {
        int[][] matrix = new int[][]
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10,},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20}
                };

        TraverseInSpiralForm program = new TraverseInSpiralForm();
        program.spiralPrint(matrix, 4, 5);
    }
}
