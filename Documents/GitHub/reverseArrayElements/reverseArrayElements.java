package reverseArrayElements;
public class reverseArrayElements {

    public void reverseArray(int arr[],int start,int end) {

        if(start>=end)
        return;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverseArray(arr, start+1, end-1);
        
        
    }

    public void printArray(int arr[]) {
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }



    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,0};

        reverseArrayElements revArray = new reverseArrayElements();
        revArray.reverseArray(arr, 0, 9);  
        revArray.printArray(arr);
        
    }

}