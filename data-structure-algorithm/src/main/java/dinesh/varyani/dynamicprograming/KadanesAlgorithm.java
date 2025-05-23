package dinesh.varyani.dynamicprograming;

public class KadanesAlgorithm {


    //max value test
    //maximum sum from given array
    public static int subArray(int[] arr) {

        int currentMax = arr[0];
        int maxSoFar = arr[0];

        int j=1;
        while(j<arr.length){
            currentMax=currentMax+arr[j];
            if(currentMax >= arr[j]){
                j++;
            }else{
                currentMax=arr[j];
                j++;
            }
            if(currentMax > maxSoFar){
                maxSoFar=currentMax;
            }
        }

        //below using simple for loop
        /*for (int i = 1; i < arr.length; i++) {
            if(currentMax < arr[j]){
                currentMax=arr[j];
            }
            if(currentMax > maxSoFar){
                maxSoFar=currentMax;
            }
        }*/
        return maxSoFar;
    }

    public static void main(String[] args) {
        System.out.println(subArray(new int[]{1,3,-2,6,-12,7,-1,8}));
        System.out.println(maxSubArray(new int[]{4, 3, -2, 6, -12, 7, -1, 6}));
    }

    //Kadane's algo
    private static int maxSubArray(int[] arr){

        int currentMax = arr[0];
        int maxSoFar = arr[0];
        int j=1;

        while(j < arr.length){
            currentMax = currentMax + arr[j];

            if(currentMax <= arr[j]){
                currentMax = arr[j];
                j++;
            }else{
                j++;
            }

            if(currentMax > maxSoFar){
                maxSoFar= currentMax;
            }
        }

        return maxSoFar;
    }
}
