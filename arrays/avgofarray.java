public class avgofarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        float sum=0;
        float avg=0;
        float n=arr.length;

        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of arry is= "+sum);
        avg=sum/n;
        System.out.println("the avg is " +avg);
    }
    
}
