

public class Selectionsort {
    public static void main(String[] args) {
        
        int[] arr={3,2,1,7,9,8};
       

        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                     min=j;     
                }
             }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
           

        }
        printing(arr);
    }
    public static void printing(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");                                                  
        }    
    }
    
}
