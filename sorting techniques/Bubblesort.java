public class Bubblesort {
    public static void printbubble(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr={7,6,4,21,3};

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;             
                   }
            }
        }
        printbubble(arr);
        System.out.println();
        System.out.println( arr[4]);
    }
}
