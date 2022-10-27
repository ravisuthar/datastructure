package dinesh.varyani.sort;

//Time : 	O(n^2)
// Space:  O(1)
public class SelectionSort {
    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {//for each loop can be used
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){ //skip last one
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    private void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 1, 2, 9, 10};
        SelectionSort ss = new SelectionSort();
        ss.printArray(arr);
        ss.selectionSort(arr);
        ss.printArray(arr);
    }

}
