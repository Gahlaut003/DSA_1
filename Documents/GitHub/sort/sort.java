public class sort{
    public static void main(String[] args) {
        System.out.println("HI");
        int arr[] = {1,9,2,7,5,6,4,8,3};

     for (int i=0;i<arr.length;i++){
        //  System.out.println("For index "+i+ " value = "+arr[i]);

         for(int j = 0;j<arr.length-1;j++){
       
      if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] =temp;      }

      
      
       
        
       
        }

        // System.out.println(arr[i]);
        
       
    
    }


    for(int k = 0 ;k<arr.length;k++){
        System.out.println(arr[k]);
    }
}
}