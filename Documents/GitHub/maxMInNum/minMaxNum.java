public class minMaxNum {

    static class Pair {
 
        int min;
        int max;
    }
 

    static Pair minMax(int arr[], int len) {

        Pair minMax1 = new Pair();

        if(len == 1){
            minMax1.max = arr[0];
            minMax1.min = arr[0];
            return minMax1;
        }


        if(arr[0]>arr[1]){
         
                minMax1.max = arr[0];
                minMax1.min = arr[1];
        }

        else{
           
                minMax1.max = arr[1];
                minMax1.min = arr[0];

        }
        for (int i = 2; i < len; i++) {
            if (arr[i] > minMax1.max) {
                minMax1.max = arr[i];
            } else if (arr[i] < minMax1.min) {
                minMax1.min = arr[i];
            }
        }
 

        return minMax1;
        
    }
    public static void main(String[] args) {

        minMaxNum minMax = new minMaxNum();
        int arr[] = {11,33,44,6456,786785,2321431,9,0};
        int arr_size = arr.length;
        Pair minmax = minMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
 
        
    }
}
    

