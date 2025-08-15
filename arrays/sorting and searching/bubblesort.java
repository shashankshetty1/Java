

public class bubblesort {
    public static void main(String[] args) {

        int arr[]={8,6,4,3,21,3,43,234,234,2423434,34234,22,22221};
        int temp=0;
        int flag=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){

                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=flag+1;
                }
            }
        }
        System.out.println(flag);
        System.out.print("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




        
        
    }
    
}
