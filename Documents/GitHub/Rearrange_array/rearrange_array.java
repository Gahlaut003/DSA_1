public class rearrange_array{
    public static void main(String[] args) {
        System.out.println("HI");
        
        int arr[] = {1,6,-1,4,-1,-1};

     for (int i=0;i<arr.length;i++){
       


    

         for(int j = 0;j<arr.length;j++){

       
       
    //   if(arr[j]>arr[j+1]){
        if(arr[j] == i){
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] =temp;      
        break;}  

        }
      

        // System.out.println(arr[i]);
        
       
    
    }

for(int l =0;l<arr.length;l++){
if(arr[l] != l){
    arr[l]= -1;
}

}
    for(int k = 0 ;k<arr.length;k++){
        System.out.println(arr[k]);
    }
}
}