// package maxMinNum;
public class maxMinNum{

    public void sortArray(int arr[]) {
        for(int i = 0; i<arr.length;i++){
            
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   
                   
                } 
            }
            // System.out.println(arr[i]);
        }
        
    }

    public void printArray( int arr[],int len) {
        System.out.println("Min Element Array = "+arr[0]+" & Max Element Array = "+arr[len]);

        // for(int i =0;i<arr.length;i++){
        //     // System.out.println(arr[i]);
        // }
        
    }

    public static void main(String[] args) {
        
        // int arr[] = {1,2,3,66,88,90,123,345,8,33,-1};

        int arr[] = {-1,-5};
        int len = arr.length;

        maxMinNum max1 = new maxMinNum();
        max1.sortArray(arr);
        max1.printArray(arr,len-1);


    }
    
}