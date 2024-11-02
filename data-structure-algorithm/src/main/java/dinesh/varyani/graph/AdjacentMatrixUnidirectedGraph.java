package dinesh.varyani.graph;

import java.util.Arrays;

public class AdjacentMatrixUnidirectedGraph {
    private int[][] adjacentMatrix;

    public AdjacentMatrixUnidirectedGraph(int nodes) {
        this.adjacentMatrix = new int[nodes][nodes];
    }

    public void add(int row, int column) {
        this.adjacentMatrix[row][column] = 1;
        this.adjacentMatrix[column][row] = 1;
    }

    public void print(){
        System.out.println(Arrays.deepToString(this.adjacentMatrix));
    }


    public static void main(String[] args) {
        AdjacentMatrixUnidirectedGraph graph = new AdjacentMatrixUnidirectedGraph(4);
        graph.add(0,1);
        graph.add(1,2);
        graph.add(2,3);
        graph.add(3,0);

        graph.print();
    }

}
