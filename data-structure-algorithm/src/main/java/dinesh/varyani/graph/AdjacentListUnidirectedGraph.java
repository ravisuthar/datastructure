package dinesh.varyani.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacentListUnidirectedGraph {
    private LinkedList<Integer>[] adjacentList;   //array of LinkedList

    public AdjacentListUnidirectedGraph(int nodes) {
        this.adjacentList = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adjacentList[i] = new LinkedList<>();
        }
    }

    public void add(int row, int column) {
        this.adjacentList[row].add(column);
        this.adjacentList[column].add(row);
    }

    public void print() {
        //System.out.println(Arrays.deepToString(this.adjacentList));
        for (int i = 0; i < this.adjacentList.length; i++) {
            LinkedList<Integer> nodes = this.adjacentList[i];
            System.out.print(i +" => "+nodes+" \n");
        }
    }


    //0 1 3 2
    public void breadthFirstSearch(int startNode) {
        boolean[] visited = new boolean[this.adjacentList.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        visited[startNode] = true;
        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            System.out.print(node + " ");
            for (Integer connect : this.adjacentList[node]) { //mistakenly used startNode which was wrong
                if (!visited[connect]) {
                    visited[connect] = true;
                    queue.offer(connect);
                }
            }
        }
    }

    //0 3 2 1
    //Iterative Depth First Search (DFS) traversal of an Undirected Graph | Animation
    public void depthFirstSearch(int startNode) {
        boolean[] visited = new boolean[this.adjacentList.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);
        visited[startNode] = true;
        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            System.out.print(node + " ");
            for (Integer connect : this.adjacentList[node]) { //mistakenly used startNode which was wrong
                if (!visited[connect]) {
                    visited[connect] = true;
                    stack.push(connect);
                }
            }
        }
    }

    //[[1, 3], [0, 2], [1, 3], [2, 0]]
    public static void main(String[] args) {
        AdjacentListUnidirectedGraph graph = new AdjacentListUnidirectedGraph(4);
        graph.add(0, 1);
        graph.add(1, 2);
        graph.add(2, 3);
        graph.add(3, 0);

        graph.print();
        System.out.println();

        System.out.println("breadthFirstSearch");
        graph.breadthFirstSearch(0);
        System.out.println();

        System.out.println("depthFirstSearch");
        graph.depthFirstSearch(0);

    }


}
