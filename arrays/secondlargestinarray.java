public class secondlargestinarray {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,8,4,2,6,3,9,4};
        bubble(arr);
        System.out.println("The second largest element is "+arr[1]);
    }
    public static void bubble(int arr[]){

        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
