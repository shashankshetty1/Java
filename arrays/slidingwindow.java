public class slidingwindow {
    public static void main(String[] args) {
        int arr[]={1,12,-5,-6,50,3};
        int k=4;
        double Ans=findMaxAverage(arr, k);
        System.out.println(Ans);



    }
    public static double findMaxAverage(int arr[],int k){

        int n=arr.length;

        int maxsum=0;

        for(int i=0;i<k;i++){
            maxsum=maxsum+arr[i];
        }
        
        int sum=maxsum;

        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
             
        if(sum>maxsum){
            maxsum=sum;
        }

        }   
        return (double)maxsum/k;
    }
   
    
}
